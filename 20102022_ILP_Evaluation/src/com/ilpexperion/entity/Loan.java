package com.ilpexperion.entity;

import com.ilpexperion.service.LoanService;

public class Loan extends Product implements LoanService {

	private String loanNumber;
	private double loanAccount;
	
	public Loan(String productName, String loanNumber, double loanAccount) {
		super(productName);
		this.loanNumber = loanNumber;
		this.loanAccount = loanAccount;
	}

	public String getLoanNumber() {
		return loanNumber;
	}

	public void setLoanNumber(String loanNumber) {
		this.loanNumber = loanNumber;
	}

	public double getLoanAccount() {
		return loanAccount;
	}

	public void setLoanAccount(double loanAccount) {
		this.loanAccount = loanAccount;
	}

	@Override  //annotation
	public void checkValidity() {
		System.out.println("Validity Check of Loan class called..");
		
	}

	@Override
	public void checkDueDate() {
		System.out.println("Checking Due date of loan");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void LoanApproval() {
		System.out.println("Checking Loan Approval");
		// TODO Auto-generated method stub
		
	}
	
	
}
