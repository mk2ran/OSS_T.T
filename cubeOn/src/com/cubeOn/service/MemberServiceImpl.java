package com.cubeOn.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cubeOn.domain.Member;
import com.cubeOn.persistence.MemberMapper;

@Service
public class MemberServiceImpl implements MemberService {
	@Resource
	private MemberMapper memberMapper;

	public List<Member> list(Member member) {
		List<Member> list = this.memberMapper.list(member);
		return list;
	}

	@Override
	public Boolean login(Member member) {
		
		member = memberMapper.login(member);
		
		if(member == null) {
			return false;
		}else {
			return true;
		}
	}
}
