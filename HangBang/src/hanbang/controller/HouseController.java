package hanbang.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import hanbang.domain.House;
import hanbang.service.HouseService;

@Controller
public class HouseController {
	
	@Autowired
	private HouseService service;

	@RequestMapping(value = "houseRegister.do" , method = RequestMethod.POST)
	public String registerHouse(House house, HttpSession session, MultipartFile file) {
		house.setMemberId((String)session.getAttribute("memberId"));
		service.register(house);
		
		return "redirect:/findMember.do?memberId=" + house.getMemberId(); 
	}
	

}
