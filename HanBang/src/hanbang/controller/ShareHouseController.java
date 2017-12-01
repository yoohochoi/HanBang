package hanbang.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import hanbang.domain.EssentialInfo;
import hanbang.domain.ExtraInfo;
import hanbang.domain.Facilitie;
import hanbang.domain.House;
import hanbang.domain.Photo;
import hanbang.domain.ProvidedGood;
import hanbang.domain.PublicUsage;
import hanbang.domain.Room;
import hanbang.domain.ShareHouse;
import hanbang.service.EssentialInfoService;
import hanbang.service.ExtraInfoService;
import hanbang.service.ShareHouseService;

@Controller
public class ShareHouseController {

	@Autowired
	private ShareHouseService shareHouseService;
	@Autowired
	private EssentialInfoService essentialInfoService;
	@Autowired
	private ExtraInfoService extraInfoService;

	@RequestMapping(value = "/shareHouse/registShareHouse.do", method = RequestMethod.POST)
	public String registerShareHouse(HttpSession session, ShareHouse shareHouse, EssentialInfo essentialInfo,
			ExtraInfo extraInfo, List<Room> rooms, House house, List<Photo> photos, List<Facilitie> facilities, List<PublicUsage> publicUsages) {

		shareHouse.setWriterId((String) session.getAttribute("memberId"));
		boolean registed = shareHouseService.register(shareHouse, rooms, house, photos);
		if (!registed) {
			registed = essentialInfoService.register(essentialInfo, publicUsages);
			if (!registed) {
				extraInfoService.register(extraInfo, facilities);
			} else {
				System.out.println("필수정보 미입력");
				return "redirect:/views/shareHouseCreate.jsp";
			}
		} else {
			System.out.println("shareHouse 생성 안된다.");
			return "redirect:/views/shareHouseCreate.jsp";
		}

		return "redirect:/shareHouseDetail.do?shareHouseId" + shareHouse.getShareHouseId();
	}

	@RequestMapping(value = "/shareHouse/shareHouseModify.do", method = RequestMethod.GET)
	public String modifyShareHouse(int shareHouseId, Model model, HttpSession session) {
		String memberId = (String) session.getAttribute("memberId");
		ShareHouse shareHouse = shareHouseService.find(shareHouseId);
		EssentialInfo essentialInfo = essentialInfoService.find(shareHouseId);
		ExtraInfo extraInfo = extraInfoService.find(shareHouseId);

		if (shareHouse.getWriterId().equals(memberId)) {
			model.addAttribute("shareHouse", shareHouse);
			model.addAttribute("essentialInfo", essentialInfo);
			model.addAttribute("extraInfo", extraInfo);
			return "redirect:/views/shareHouseModify.jsp";
		} else {
			return "redirect:/shareHoueDetail.do?shareHouseId=" + shareHouse.getShareHouseId();
		}
	}

	@RequestMapping(value = "/shareHouse/shareHouseModify.do", method = RequestMethod.POST)
	public String modifyShareHouse(ShareHouse shareHouse, EssentialInfo essentialInfo, ExtraInfo extraInfo,
			List<Room> rooms, House house, List<Photo> photos, List<Facilitie> facilities, List<PublicUsage> publicUsages) {
		boolean modified = shareHouseService.modify(shareHouse, rooms, house, photos);
		if (!modified) {
			modified = essentialInfoService.modify(essentialInfo, publicUsages);
			if (!modified) {
				extraInfoService.modify(extraInfo, facilities);
			} else {
				System.out.println("필수정보 입력안함");
				return "/shareHouseModify.do?shareHouseId=" + shareHouse.getShareHouseId();
			}
		} else {
			System.out.println("shareHouseModify error");
			return "shareHouseModify.do?shareHouseId=" + shareHouse.getShareHouseId();
		}

		return "redirect:/shareHouseDetail.do?shareHouseId" + shareHouse.getShareHouseId();
	}

	@RequestMapping(value = "/shareHouse/shareHouseDelete.do")
	public String removeShareHouse(String shareHouseId) {
		int id = Integer.parseInt(shareHouseId);

		shareHouseService.remove(id);
		essentialInfoService.deleteByShareHouse(id);
		extraInfoService.deleteByShareHouse(id);
		return "redirect:/shareHouseList_.do";
	}

	@RequestMapping(value = "/shareHouse/shareHouseList.do")
	public String findAllShareHouse(Model model) {

		List<ShareHouse> list = shareHouseService.findAll();
		model.addAttribute("list", list);

		return "/views/shareHouseList_.jsp";
	}

	@RequestMapping(value = "/shareHouse/shareHouseDetail.do")
	public String detailShareHouse(String shareHouseId, Model model) {
		int id = Integer.parseInt(shareHouseId);
		ShareHouse shareHouse = shareHouseService.find(id);
		model.addAttribute("shareHouse", shareHouse);

		return "/views/shareHouseDetail.jsp";
	}

}
