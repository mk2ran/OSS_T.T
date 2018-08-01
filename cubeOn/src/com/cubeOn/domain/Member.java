package com.cubeOn.domain;

import java.io.Serializable;

public class Member implements Serializable {
	private String id;
	private String passWord;
	private String name; 

	
	public Member() {

	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getPassWord() {
		return passWord;
	}


	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "Member [id=" + id + ", passWord=" + passWord + ", name=" + name + "]";
	}
	
	
}