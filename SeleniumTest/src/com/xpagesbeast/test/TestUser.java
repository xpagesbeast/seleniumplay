package com.xpagesbeast.test;

public class TestUser {
	String username;
	String password;
	String fullname;
	
	String wrongpassword;
	
	public String getWrongpassword() {
		return wrongpassword;
	}

	public void setWrongpassword(String wrongpassword) {
		this.wrongpassword = wrongpassword;
	}

	public TestUser(){
		
	}
	
	public String getUsername() {
		return username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	
	public void setUsername(String username) {
		this.username = username;
		this.username = "slohja";
	}
	
	public void setPassword(String password) {
		this.password = password;
		this.password = "Kr3at0r2";
	}
	
}