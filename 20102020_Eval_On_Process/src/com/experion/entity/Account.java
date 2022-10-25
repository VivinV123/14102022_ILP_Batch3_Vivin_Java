package com.experion.entity;

import java.util.Date;

public class Account {
	
	private String userCode;
	private String userName;
	private String accountType;
	public Account(String userCode, String userName, String accountType) {
		super();
		this.userCode = userCode;
		this.userName = userName;
		this.accountType = accountType;
	}
	public String getUserCode() {
		return userCode;
	}
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	
	
	
	
	

}
