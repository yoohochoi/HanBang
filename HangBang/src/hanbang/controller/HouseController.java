package hanbang.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import hanbang.domain.House;
import hanbang.domain.PublicUsage;
import hanbang.service.HouseService;

@Controller
public class HouseController {

	@Autowired
	private HouseService service;

	@RequestMapping(value = "registHouse.do", method = RequestMethod.POST)
	public String registerHouse(House house, List<PublicUsage> publicUsages, HttpSession session) {
		house.setMemberId((String) session.getAttribute("memberId"));
		boolean registed = service.register(house, publicUsages);
		if (!registed) {
			return "redirect:/registHouse.do";
		} else {
			return "redirect:/findMember.do?memberId=" + house.getMemberId();
		}
	}

	@RequestMapping(value = "houseModify.do", method = RequestMethod.GET)
	public String modifyHouse(int houseId, Model model, HttpSession session) {
		String memberId = (String) session.getAttribute("memberId");
		House house = service.find(houseId);

		if (house.getMemberId().equals(memberId)) {
			model.addAttribute(house);
			return "houseModify.jsp";
		} else {
			return "redirect:/houseDetail.do?houseId=" + houseId;
		}

	}

	@RequestMapping(value = "houseModify.do", method = RequestMethod.POST)
	public String modifyHouse(House house, List<PublicUsage> publicUsages, Model model) {
		service.modify(house, publicUsages);
		model.addAttribute(house);
		return "redirect:/houseDetail.do?houseId=" + house.getHouseId();
	}

	@RequestMapping(value = "houseDelete.do")
	public String removeHouse(int houseId) {
		House house = service.find(houseId);
		service.remove(houseId);

		return "redirect:/findMember.do?memberId=" + house.getMemberId();
	}

}
