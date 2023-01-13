package com.training.springmvc.model;


public class User {
	
	String name;
	int passwd;
	
	public User() {
		
	}
	public User(String name, int passwd) {
		super();
		this.name = name;
		this.passwd = passwd;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPasswd() {
		return passwd;
	}
	public void setPasswd(int passwd) {
		this.passwd = passwd;
	}
	

}
