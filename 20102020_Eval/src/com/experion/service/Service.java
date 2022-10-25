package com.experion.service;


import java.util.ArrayList;
import java.util.Scanner;

import com.experion.entity.Account;
import com.experion.entity.SavingsAccount;




public class Service {

	

	public static SavingsAccount createAccount() {
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Customer Code: ");
		String userCode= scanner.nextLine();
		System.out.println("Enter Customer Name: ");
		String userName= scanner.nextLine();
		String accountType="Savings";
		
		SavingsAccount account = new SavingsAccount(userCode,userName,accountType);
		
		return account;

		
	
	}
	
		public static void displayAccount(ArrayList<Account> accountList) {
			System.out.println("Customer Name: " + "		" + "Customer Code" );
			for(Account account : accountList)
			{
			System.out.println(account.getUserName()+ "				" + account.getUserCode());
			}

			
		}
	public static void manageAccount(ArrayList<Account> accountList)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Customer ID: ");
		int userinput= scanner.nextInt();
		for(Account account : accountList)
		{
			if( Integer.parseInt(account.getUserCode())==userinput)
			{
				System.out.println("Customer Id available. u can manage ur account  ");
				System.out.println(account.getUserCode());
			}
			else
			{
				System.out.println("Customer Id not available.Create a new Account  ");
				System.out.println(account.getUserCode());
				System.out.println(userinput);
			}
		}
		
	}



		
		
	
		
	}
	


