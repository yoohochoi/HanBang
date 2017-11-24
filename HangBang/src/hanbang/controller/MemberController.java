package hanbang.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import hanbang.domain.Member;
import hanbang.service.MemberService;

@Controller
public class MemberController {

	@Autowired
	private MemberService service;
	
	@RequestMapping(value="memberJoin.do", method = RequestMethod.POST)
	public String registerMember(Member member){
		
		//아직!
		
		return null;
	}
	

	@RequestMapping(value = "findAllMember.do", method = RequestMethod.GET)
	public String findAllMember(Model model) {
		List<Member> members = service.findAll();
		model.addAttribute("members", members);

		return "memberList.jsp";
	}

	@RequestMapping(value = "findMember.do", method = RequestMethod.GET)
	public String findByMemberId(String memberId, Model model) {
		Member member = service.find(memberId);
		model.addAttribute("memberDetail", member);

		return "memeberDetail.jsp";
	}

	@RequestMapping(value = "modifyMember.do", method = RequestMethod.GET)
	public String modifyMember(String memberId, Model model) {
		Member member = service.find(memberId);

		model.addAttribute("member", member);
		return "memeberModify.jsp";
	}

	@RequestMapping(value = "modifyMember.do", method = RequestMethod.POST)
	public String modifyMember(Member member, Model model) {
		service.modify(member);
		return "redirect:/findMember.do?memberId=" + member.getId();
	}

	@RequestMapping(value = "removeMember.do")
	public String removeMember(String memberId) {
		service.remove(memberId);
		if ("admin".equals(memberId)) {
			return "redirect:/findAllMember.do";
		}
		return "index.jsp";
	}

	@RequestMapping(value = "login.do" , method = RequestMethod.POST)
	public String login(HttpServletRequest request) {
		String memberId = request.getParameter("memberId");
		String password = request.getParameter("password");

		HttpSession session = request.getSession();
		Member loginMember = service.find(memberId);

		if (loginMember != null) {
			if (loginMember.getPassword().equals(password)) {
				session.setAttribute("memberId", memberId);
				session.setAttribute("name", loginMember.getName());
				return "redirect:/index.jsp";
			} else {
				return "redirect:/login.jsp";
			}
		} else {
			return "redirect:/login.jsp";
		}
	}
	
	@RequestMapping(value = "logout.do")
	public String logout(HttpServletRequest request){
		HttpSession session = request.getSession();
		session.invalidate();
		
		return "redirect:/index.do";
	}
	

}
