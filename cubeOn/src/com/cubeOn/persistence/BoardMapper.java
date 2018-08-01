package com.cubeOn.persistence;

import java.util.List;

import com.cubeOn.domain.Board;

public interface BoardMapper {
	public List<Board> list();
	public void add(Board board);
}