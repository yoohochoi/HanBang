package hanbang.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import hanbang.domain.House;
import hanbang.service.HouseService;


public class MapController {
	
	@Autowired
	private HouseService service;
	
	@RequestMapping(value  = "showAddressMap.do" , method = RequestMethod.GET)
	public String registerAddress(HttpServletRequest request, Model model) {
		String mapAddress = request.getParameter("address");
		
		model.addAttribute("mapAddress", mapAddress);
		return "showMap.do";
	}
	
//	@RequestMapping(value = "showAddressMap.do", method = RequestMethod.POST)
//	public String registerAddress(String address) {
//		
//	
//	}

}
