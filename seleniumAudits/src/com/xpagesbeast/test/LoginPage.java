package com.xpagesbeast.test;

public class LoginPage {
	private String userNameName;
	private String passwordName;
	private String buttonName;
	
	private String userNameXPath;
	private String passwordXPath;
	private String buttonXPath;
	
	private String password;
	private String login;
	
	public LoginPage(){
		this.userNameName = "username";
		this.userNameXPath = "/html/body/div/form/div/input[1]";
		
		this.passwordName = "password";
		this.passwordXPath = "/html/body/div/form/div/input[2]";
		
		this.buttonName = "";
		this.buttonXPath = "/html/body/div/form/div/button";
		setPassword("");
		setLogin("");
	}
	
	public String getUserNameName() {
		return userNameName;
	}
	public void setUserNameName(String userNameName) {
		this.userNameName = userNameName;
	}
	public String getPasswordName() {
		return passwordName;
	}
	public void setPasswordName(String passwordName) {
		this.passwordName = passwordName;
	}
	public String getButtonName() {
		return buttonName;
	}
	public void setButtonName(String buttonName) {
		this.buttonName = buttonName;
	}
	public String getUserNameXPath() {
		return userNameXPath;
	}
	public void setUserNameXPath(String userNameXPath) {
		this.userNameXPath = userNameXPath;
	}
	public String getPasswordXPath() {
		return passwordXPath;
	}
	public void setPasswordXPath(String passwordXPath) {
		this.passwordXPath = passwordXPath;
	}
	public String getButtonXPath() {
		return buttonXPath;
	}
	public void setButtonXPath(String buttonXPath) {
		this.buttonXPath = buttonXPath;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = "Kr3at0r2";
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = "slohja";
	}
	
	
	
	
}
