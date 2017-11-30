package hanbang.controller;

import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import hanbang.domain.House;
import hanbang.domain.Member;
import hanbang.service.HouseService;
import hanbang.service.MemberService;

@Controller
public class MemberController {

	@Autowired
	private MemberService service;
	@Autowired
	private HouseService houseService;

	@RequestMapping(value = "memberJoin.do", method = RequestMethod.POST)
	public String registerMember(@Valid Member member, BindingResult bindingResult, HttpServletRequest request) {

		// if (bindingResult.hasErrors()) {
		// return "memberJoin.jsp";
		// } else {
		service.register(member);
		return "redirect:/views/login.jsp";
		// }

	}

	@RequestMapping(value = "findAllMember.do", method = RequestMethod.GET)
	public String findAllMember(Model model) {
		List<Member> members = service.findAll();

		model.addAttribute("members", members);

		return "memberList.jsp";
	}

	@RequestMapping(value = "findMember.do", method = RequestMethod.GET)
	public String findByMemberId(HttpSession session, Model model) {
		String memberId = (String) session.getAttribute("memberId");
		Member member = service.find(memberId);
		List<House> houses = houseService.findByMemberId(memberId);

		model.addAttribute("member", member);
		model.addAttribute("houses", houses);

		return "/views/memberDetail.jsp";
	}

	@RequestMapping(value = "modifyMember.do", method = RequestMethod.GET)
	public String modifyMember(HttpSession session, Model model) {
		String memberId = (String) session.getAttribute("memberId");
		Member member = service.find(memberId);

		model.addAttribute("member", member);
		return "/views/memberModify.jsp";
	}

	@RequestMapping(value = "modifyMember.do", method = RequestMethod.POST)
	public String modifyMember(Member member, Model model) {

		service.modify(member);
		return "redirect:/findMember.do?memberId=" + member.getId();

	}

	@RequestMapping(value = "removeMember.do")
	public String removeMember(HttpSession session) {
		String memberId = (String) session.getAttribute("memberId");
		service.remove(memberId);
		if ("admin".equals(memberId)) {
			return "redirect:/findAllMember.do";
		}
		return "redirect:/index.jsp";
	}

	@RequestMapping(value = "login.do", method = RequestMethod.POST)
	public String login(HttpServletRequest request, String memberId, String password) {

		Member member = service.find(memberId);
		HttpSession session = request.getSession();

		if (member != null) {
			// System.out.println("****로그인확인중");
			if (member.getPassword().equals(password)) {
				// System.out.println("***2");
				session.setAttribute("memberId", memberId);
				session.setAttribute("name", member.getName());
				// System.out.println("memberId" + memberId);
				// System.out.println("memberName" + member.getName());
				if (member.getMemberTypeId() == 1) {
					// System.out.println("***@");

					return "redirect:/index.jsp";
				} else {
					List<House> houses = houseService.findByMemberId(memberId);
					if (houses.size() == 0) {
						return "redirect:/views/houseCreate.jsp";
					} else {
						return "redirect:/index.jsp";
					}
				}
			} else {
				return "redirect:/views/login.jsp";
			}
		} else {
			System.out.println("******* login failure");
			return "redirect:/views/login.jsp";
		}

	}

	@RequestMapping(value = "logout.do")
	public String logout(HttpServletRequest request) {
		HttpSession session = request.getSession();
		session.invalidate();

		return "redirect:/views/login.jsp";
	}

}
