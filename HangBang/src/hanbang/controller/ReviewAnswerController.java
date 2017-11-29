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
public class ReviewAnswerController {
	
	@Autowired
	private AnswerService service;
	
	// 후기 댓글 등록
	@RequestMapping(value="/review/registAnswer.do", method=RequestMethod.POST)
	public String registAnswer(HttpSession session, HttpServletRequest request, Model model) {
		Answer answer = new Answer();
		answer.setTypeId(2);
		answer.setContent((String)request.getAttribute("content"));
		answer.setWriterId((String)session.getAttribute("loginedUser"));
		boolean check = service.registerReview(answer);
		if(check == false) {
			return "redirect:reviewDetail.do";
		} else {
			model.addAttribute(answer);
			return "redirect:reviewDetail.do";
		}
	}
	
	// 후기 댓글 수정
	@RequestMapping(value="/review/modifyAnswer.do", method=RequestMethod.POST)
	public String modifyAnswer(HttpServletRequest request, HttpSession session) {
		
		return "";
	}
	
	// 후기 댓글 삭제
	
	
}
