package com.bank.service;

import java.util.ArrayList;
import java.util.Scanner;

import com.bank.entity.Account;
import com.bank.entity.Customer;

public class Service {

	public static Account createAccount(String accountType,Account account) {

		//Account account ;
		if (accountType.compareTo("Savings Max Account") == 0) {
			account = new Account("Savings Max Account", 1000);
		} else if (accountType.compareTo("Current Account") == 0) {
			account = new Account("Current Account", 1000);
		} else if (accountType.compareTo("Loan Account") == 0) {
			account = new Account("Loan Account", 0);
		}

		return account;

	}

	public static Customer createCustomer(ArrayList<Account> accountList) {
		Scanner scanner = new Scanner(System.in);
		// ArrayList<Customer>customerList = new ArrayList<Customer>();
		// System.out.println("Enter Customer ID")
		System.out.println("Enter Customer Code");
		String customerCode = scanner.nextLine();
		System.out.println("Enter Customer Name");
		String customerName = scanner.nextLine();
		
		Customer customer = new Customer(customerCode, customerName, accountList);

		return customer;
	}

	public static void manageAccount(Customer customer) {
		ArrayList<Account> accountList = new ArrayList<Account>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Customer Code : ");
		String cusCode = scanner.nextLine();
		if ((customer!=null) && customer.getCustomerCode().compareTo(cusCode) == 0) {
			System.out.println("*************Accounts Available*************");
			System.out.println("Savings Max Account");
			System.out.println("Current Account");
			System.out.println("Loan Account");

			System.out.println("1.Deposit Money  2.Withdraw Money \n Enter your Choice");
			int availableChoice = scanner.nextInt();
			switch (availableChoice) {
			case 1:
				MisService.depositMoney(customer);
				break;
			case 2:
				MisService.withdrawAmount(customer);
				break;

			}
		} else {
			System.out.println("Customer is not Available Please Create an Account");
		}

	}

}
