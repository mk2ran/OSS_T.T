package com.cubeOn.service;

import java.util.List;

import com.cubeOn.domain.Board;

public interface BoardService {
	public List<Board> list(); 
	public void add(Board board);
}
