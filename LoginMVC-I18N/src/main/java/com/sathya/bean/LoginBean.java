package com.sathya.bean;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
//this is java bean
public class LoginBean {
	@NotEmpty
	private   String   username;
	
	@Size(min=4, max=8)
	private   String   password;


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
