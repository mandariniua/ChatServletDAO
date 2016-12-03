package com.plakhotnyuk.chat.bean;

public class Users {
	
	private int id;
	private String userName;
	private String userPass;
	
	public Users() {
		
	}
	
	public Users(int id, String userName, String userPass) {
		this.id=id;
		this.userName=userName;
		this.userPass=userPass;
	}
	
	public Users(String userName, String userPass) {
		this.userName=userName;
		this.userPass=userPass;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPass() {
		return userPass;
	}

	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}
	
	

}
