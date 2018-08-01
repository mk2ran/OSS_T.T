package com.cubeOn.presentation;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.collections4.multiset.SynchronizedMultiSet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.cubeOn.domain.Board;
import com.cubeOn.service.BoardService;

@Controller
@RequestMapping(value = "/board")
public class BoardController {

	@Autowired
	private BoardService boardService;
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ModelAndView getBoardList(HttpServletRequest request) {
		ModelAndView modelAndView = new ModelAndView("/board/list");
		
		List<Board> list = boardService.list();
		modelAndView.addObject("listBoard", list);
		
		return modelAndView;
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public ModelAndView getBoardAdd(HttpServletRequest request) {
		return new ModelAndView("/board/add");
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public ModelAndView postBoardAdd(Board board, HttpServletRequest request) {
		Date dat = new Date();
		SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
		board.setRegistration(date.format(dat));
		
		boardService.add(board);
		
		System.out.println(board.toString());
		
		return new ModelAndView(new RedirectView("/board/list"));
	}
	@RequestMapping(value = "/remove/{boardId}", method = RequestMethod.GET)
	public ModelAndView getBoardRemove(@PathVariable String boardId, HttpServletRequest request) {
		System.out.println(boardId);
		return null;
	}
}
