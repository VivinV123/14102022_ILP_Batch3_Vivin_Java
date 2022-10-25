package com.experion.entity;

public class CurrentAccount extends Account {
	private int withdrawalAmount;

	public CurrentAccount(String userCode, String userName, String accountType, int withdrawalAmount) {
		super(userCode, userName, accountType);
		this.withdrawalAmount = withdrawalAmount;
	}

	public int getWithdrawalAmount() {
		return withdrawalAmount;
	}

	public void setWithdrawalAmount(int withdrawalAmount) {
		this.withdrawalAmount = withdrawalAmount;
	}

	
	
}
