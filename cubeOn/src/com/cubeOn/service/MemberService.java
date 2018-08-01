package com.cubeOn.service;

import java.util.List;

import com.cubeOn.domain.Member;

public interface MemberService {
	public List<Member> list(Member member); 
	
	public Boolean login(Member member);
}
