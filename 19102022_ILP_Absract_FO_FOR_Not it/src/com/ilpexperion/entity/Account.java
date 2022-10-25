package com.ilpexperion.entity;

import java.util.ArrayList;

public class Account extends Product {
	
	private String accountType;
	private ArrayList<BankServices> bankServiceList;
	public Account(String productCode, String productName, String productType, String accountType,
			ArrayList<BankServices> bankServiceList) {
		super(productCode, productName, productType);
		this.accountType = accountType;
		this.bankServiceList = bankServiceList;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public ArrayList<BankServices> getBankServiceList() {
		return bankServiceList;
	}
	public void setBankServiceList(ArrayList<BankServices> bankServiceList) {
		this.bankServiceList = bankServiceList;
	}
	
	

}
