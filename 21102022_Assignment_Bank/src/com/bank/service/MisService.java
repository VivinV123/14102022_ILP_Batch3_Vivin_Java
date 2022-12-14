package com.bank.service;

import java.util.ArrayList;
import java.util.Scanner;

import com.bank.entity.Account;
import com.bank.entity.Customer;

public class MisService {
	
	public static String enterAccountChoice() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("*************Accounts Available*************");
		System.out.println("Savings Max Account");
		System.out.println("Current Account");
		System.out.println("Loan Account");
		System.out.println("Enter the Account Type you wish to Create");
		String customerAccountChoice = scanner.nextLine();
		return customerAccountChoice;
		
	}
public static void withdrawAmount(Customer customer) {
		
		ArrayList<Account>customerAccountList = new ArrayList<Account>();
		Scanner scanner = new Scanner(System.in);
		customerAccountList = customer.getAccountList();
		System.out.println("Account Name " + "     "+"Account Balance");
		for(Account account : customerAccountList)
			System.out.println(account.getProductName() + "     "+ account.getAccountBalance());
			
		System.out.println("Type the account name you want to withdraw money - ");
		String account = scanner.nextLine();
		System.out.println("Enter the amount to be withdraw - ");
		double withdrawMoney = scanner.nextDouble();
		for(Account selectedAccount : customerAccountList)
			if(selectedAccount.getProductName().compareTo(account)==0)
			{
				
				selectedAccount.setAccountBalance(selectedAccount.getAccountBalance() - withdrawMoney);
			}
		
	}
public static void depositMoney(Customer customer) {
	
	ArrayList<Account>customerAccountList = new ArrayList<Account>();
	Scanner scanner = new Scanner(System.in);
	customerAccountList = customer.getAccountList();
	System.out.println("Account Name " + "     "+"Account Balance");
	for(Account account : customerAccountList)
		System.out.println(account.getProductName() + "     "+ account.getAccountBalance());
	
	System.out.println("Type the account name you want to deposit money - ");
	String account = scanner.nextLine();
	System.out.println("Enter the amount to be deposited - ");
	double depositMoney = scanner.nextDouble();
	for(Account selectedAccount : customerAccountList)
		if(selectedAccount.getProductName().compareTo(account)==0)
		{
			
			selectedAccount.setAccountBalance(selectedAccount.getAccountBalance() + depositMoney);
		}
	
	
}
public static void displayAccountDetails(Customer customer,ArrayList<Account> accountList) {
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter Customer Code : ");
	String cusCode= scanner.nextLine();
	if((customer!=null) && customer.getCustomerCode().compareTo(cusCode)==0)
	{
		System.out.println("****************Customer Account Details****************");
		System.out.println("Customer ID " + "     "+"Customer Name " + "     "+"Account Type " + "     "+"	"+"	" + "     "+"Account Balance");
		System.out.println("********************************************************");
		for(Account account : accountList)
		{
			System.out.println(customer.getCustomerCode() + "     "+"	"+"	"+customer.getCustomerName()+"	"+"	" + "     "+account.getProductName() +"	"+"	"+ "     "+ account.getAccountBalance());
		}
	}
	else {
		System.out.println("Customer is not Available Please Create an Account");
	}
			
}

	
}
