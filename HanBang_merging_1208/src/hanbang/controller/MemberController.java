package hanbang.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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
	public String registerMember(Member member, BindingResult bindingResult, HttpServletRequest request) {

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

	@RequestMapping(value = "findMember.do", method = { RequestMethod.GET, RequestMethod.POST })
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
	public String removeMember(HttpSession session, String memberId) {
		String id = (String) session.getAttribute("memberId");
		if ("admin".equals(id)) {
			service.remove(memberId);
			return "allMemberList.do";
		} else {
			service.remove(id);
			session.invalidate();
			return "redirect:/index.do";
		}
	}

	@RequestMapping(value = "login.do", method = RequestMethod.POST)
	public String login(HttpServletRequest request, String memberId, String password, HttpServletResponse response) {

		Member member = service.find(memberId);
		HttpSession session = request.getSession();

		if (member != null) {
			if (member.getPassword().equals(password)) {
				session.setAttribute("memberId", memberId);
				session.setAttribute("name", member.getName());
				session.setAttribute("memberType", member.getMemberTypeId());

				System.out.println(member.getMemberTypeId());
				if (member.getMemberTypeId() == 1) {

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
				response.setContentType("text/html; charset=UTF-8");
				PrintWriter out;
				try {
					out = response.getWriter();
					out.println("<script>alert('로그인 정보를 확인해주세요.'); history.go(-1);</script>");
					out.flush();
				} catch (IOException e) {
					e.printStackTrace();
				}
				return "/views/login.jsp";
			}
		} else {
			response.setContentType("text/html; charset=UTF-8");
			PrintWriter out;
			try {
				out = response.getWriter();
				out.println("<script>alert('로그인 정보를 확인해주세요.'); history.go(-1);</script>");
				out.flush();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return "/views/login.jsp";
		}

	}

	@RequestMapping(value = "logout.do")
	public String logout(HttpServletRequest request) {
		HttpSession session = request.getSession();
		session.invalidate();

		return "redirect:/views/login.jsp";
	}

}
