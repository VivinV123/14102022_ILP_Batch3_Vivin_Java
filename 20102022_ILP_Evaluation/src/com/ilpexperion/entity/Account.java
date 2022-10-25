package com.ilpexperion.entity;

import java.util.ArrayList;

import com.ilpexperion.service.CardAcountService;


public class Account extends Product implements CardAcountService{
	
	private String accountNumber;
	private double accountBalance;
	
	
	
	public Account(String productName, String accountNumber, double accountBalance) {
		super(productName);
		this.accountNumber = accountNumber;
		this.accountBalance = accountBalance;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	@Override
	public void checkValidity() {
		// TODO Auto-generated method stub
		System.out.println("Validity Check of account class called..");
	}

	@Override
	public void checkBalance() {
		System.out.println("check Balance invoked.");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cashWithdrawal() {
		System.out.println("cash with drawal");
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	}
