package hanbang.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import hanbang.domain.Answer;
import hanbang.service.AnswerService;

@Controller
public class QuestionAnswerController {
	
	@Autowired
	private AnswerService service;
	
	// 문의 댓글 등록
	@RequestMapping(value="/question/registAnswer.do", method=RequestMethod.POST)
	public String registAnswer(HttpSession session, HttpServletRequest request, Model model) {
		Answer answer = new Answer();
		answer.setWriterId((String)session.getAttribute("loginedUser"));
		answer.setContent((String)request.getAttribute("content"));
		answer.setTypeId(1);
		boolean check = service.registerQuestion(answer);
		if(check == false) {
			return "redirect:detailQuestion.do";
		} else {
			model.addAttribute(answer);
			return "redirect:detailQuestion.do";
		}
	}
	
	//문의 댓글 수정
	
	
	
	//문의 댓글 삭제
	
	
	
}
