package com.experion.entity;

public class LoanAccount extends Account {
	private int emi;

	public LoanAccount(String userCode, String userName, String accountType, int emi) {
		super(userCode, userName, accountType);
		this.emi = emi;
	}

	public int getEmi() {
		return emi;
	}

	public void setEmi(int emi) {
		this.emi = emi;
	}

	

}
