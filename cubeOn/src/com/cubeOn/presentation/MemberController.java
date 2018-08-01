package com.cubeOn.presentation;


import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cubeOn.domain.Member;
import com.cubeOn.service.MemberService;

@Controller
public class MemberController {
	@Autowired
	private MemberService memberService;

	@RequestMapping(value = "/main", method = RequestMethod.GET)
	   public ModelAndView getMember(Member member, HttpServletRequest request) {
	      ModelAndView modelAndView = new ModelAndView("/main");
	      List<Member> mem = memberService.list(member);
	     
	      modelAndView.addObject("listMember", mem);
	      return modelAndView;
	   }
	
}
