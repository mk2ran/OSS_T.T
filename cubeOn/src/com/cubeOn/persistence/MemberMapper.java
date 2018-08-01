package com.cubeOn.persistence;

import java.util.List;

import com.cubeOn.domain.Board;
import com.cubeOn.domain.Member;

public interface MemberMapper {
	public List<Member> list(Member member);
	
	public void add(Board board);
	
}