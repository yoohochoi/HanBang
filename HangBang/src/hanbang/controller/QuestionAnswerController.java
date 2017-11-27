package hanbang.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import hanbang.service.AnswerService;

@Controller
public class QuestionAnswerController {
	
	@Autowired
	private AnswerService service;
	
	@RequestMapping(value="/quesAnswer/registQuesAnswer.do", method=RequestMethod.POST)
	public String registQuesAnswer() {
		
		return "";
	}

}
