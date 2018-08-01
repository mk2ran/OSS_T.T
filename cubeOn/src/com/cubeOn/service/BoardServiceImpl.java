package com.cubeOn.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cubeOn.domain.Board;
import com.cubeOn.persistence.BoardMapper;

@Service
public class BoardServiceImpl implements BoardService {
	@Resource
	private BoardMapper boardMapper;

	@Override
	public List<Board> list() {
		List<Board> list = boardMapper.list();
		return list;
	}

	@Override
	public void add(Board board) {
		boardMapper.add(board);
	}
}
