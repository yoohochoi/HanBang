package hanbang.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import hanbang.domain.InterestShareHouse;
import hanbang.domain.ShareHouse;
import hanbang.service.InterestShareHouseService;

@Controller
public class InterestShareHouseController {

	@Autowired
	private InterestShareHouseService service;
	
	
	@RequestMapping(value = "registInterstHouse.do")
	public String registerInterstHouse(InterestShareHouse interstHouse, int shareHouseId,HttpSession session, Model model) {
		String memberId = (String) session.getAttribute("memberId");
		interstHouse.setMemberId(memberId);
		boolean registed = service.register(interstHouse);
		if(!registed) {
			// 이미 저장되있을때
			service.removeInterestShareHouse(memberId, shareHouseId);
			return "redirect:/ShareHouseDetail.do?shareHouseId=" + shareHouseId;
		}else {
			return "redirect:/ShareHouseDetail.do?shareHouseId=" + shareHouseId;
		}
	}
	
	@RequestMapping(value = "interestShareHouseList.do", method = RequestMethod.GET)
	public String findInterestShareHouse(HttpSession session, Model model) {
		String memberId = (String)session.getAttribute("memberId");
		List<ShareHouse> shareHouses = service.findAll(memberId);
		model.addAttribute(shareHouses);
		return "InterestHouselist.jsp";
	}
	
	//리스트에서 삭제할때
	@RequestMapping(value ="interestShareHousedelete.do")
	public String removeShareHouse(HttpSession session) {
		String memberId = (String)session.getAttribute("memberId");
		service.removeByMemberId(memberId);
		
		return "redirect:/InterestHouselist.jsp";
	}
	
 
}
