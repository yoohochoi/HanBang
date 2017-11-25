package hanbang.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import hanbang.domain.Question;
import hanbang.service.QuestionService;

@Controller
public class QuestionController {
	
	@Autowired
	private QuestionService service;
	
//	private AnswerService answerService;
	
	@RequestMapping("/question/registQuestion.do")
	public String registerQuestion() {
		return "registQuestion.jsp";
	}
	
	// 문의 등록
	@RequestMapping(value="/question/registQuestion.do", method=RequestMethod.POST)
	public String registerQuestion(Question question, HttpSession session) {
		boolean registed = service.register(question);
		if(!registed) {
			return "redirect:registQuestion.do";
		}
		return "redirect:questionDetail.do";
	}
	
	// 문의 조회
	@RequestMapping("/question/questionList.do")
	public String findQuestion(HttpSession session, Model model) {
		String memberId = (String)session.getAttribute("loginedUser");
		List<Question> list = service.findByMemberId(memberId);
		model.addAttribute(list);
		return "questionList.jsp";
	}
	
	// 문의 상세 조회
	@RequestMapping("/question/detailQuestion.do")
	public String detailQuestion(int questionId, Model model) {
		Question question = service.find(questionId);
		model.addAttribute(question);
		return "questionDetail.jsp";
	}
	
	// 문의 수정
	@RequestMapping("/question/modifyQuestion.do")
	public String modifyQuestion(int questionId, HttpSession session, Model model) {
		String memberId = (String)session.getAttribute("loginedUser");
		Question question = service.find(questionId);
		if(question.getWriterId().equals(memberId)) {
			model.addAttribute(question);
			return "modifyQuestion.jsp";
		} else {
			return "questionDetail.do";
		}
	}
	
	//
	@RequestMapping(value="/question/modifyQuestion.do", method=RequestMethod.POST)
	public String modifyQuestion(Question question, Model model) {
		service.modify(question);
		model.addAttribute(question);
		return "detailQuestion.do";
	}
	
	// 문의 삭제
	@RequestMapping("/question/removeQuestion.do")
	public String removeQuestion(int questionId) {
		service.remove(questionId);
		return "redirect:questionList.do";
	}
	
}













>>>>>>> refs/remotes/origin/master
