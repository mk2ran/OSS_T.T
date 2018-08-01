package com.cubeOn.presentation;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.cubeOn.domain.Member;
import com.cubeOn.service.MemberService;

@Controller
public class LoginController {

	@Autowired
	private MemberService memberService;
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView getMember(HttpServletRequest request) {
		return new ModelAndView("/login");
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView postMember(Member member, HttpServletRequest request) {
		boolean check = memberService.login(member);
		
		if(check) {
			return new ModelAndView(new RedirectView("/main"));
		}else {
			return new ModelAndView(new RedirectView("/login"));
		}
	}
	
}
