package com.cubeOn.domain;

import java.io.Serializable;

public class Board implements Serializable {
	private String boardNo;
	private String title;
	private String content;
	private String registration; 
	private int stake;
	private int work;
	
	
	
	public Board() {

	}


	
	public String getBoardNo() {
		return boardNo;
	}



	public void setBoardNo(String boardNo) {
		this.boardNo = boardNo;
	}



	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public String getContent() {
		return content;
	}



	public void setContent(String content) {
		this.content = content;
	}



	public String getRegistration() {
		return registration;
	}



	public void setRegistration(String registration) {
		this.registration = registration;
	}



	public int getStake() {
		return stake;
	}



	public void setStake(int stake) {
		this.stake = stake;
	}

	public int getWork() {
		return work;
	}

	public void setWork(int work) {
		this.work = work;
	}



	@Override
	public String toString() {
		return "Board [boardNo=" + boardNo + ", title=" + title + ", content=" + content + ", registration="
				+ registration + ", stake=" + stake + ", work=" + work + "]";
	}

	
	
}