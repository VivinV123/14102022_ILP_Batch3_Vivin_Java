package com.experion.entity;

public class SavingsAccount extends Account {
	
	private int amountDeposit;

	public SavingsAccount(String userCode, String userName, String accountType) {
		super(userCode, userName, accountType);
		this.amountDeposit = amountDeposit;
	}

	public int getAmountDeposit() {
		return amountDeposit;
	}

	public void setAmountDeposit(int amountDeposit) {
		this.amountDeposit = amountDeposit;
	}

	

}
