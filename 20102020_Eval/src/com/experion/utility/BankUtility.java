package com.experion.utility;

import java.util.ArrayList;
import java.util.Scanner;

import com.experion.entity.Account;

import com.experion.service.Service;

public class BankUtility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int userChoice;
		int accountChoice;
		char checkChoice;
		char checkAccount;
		String userCode;
		String userName;
		ArrayList<Account> accountList = new ArrayList<Account>();

		do {
			Scanner scanner = new Scanner(System.in);
			System.out.println("1.Create Account\n2.Manage Account\n3.Exit\n Enter your Choice-");
			userChoice = scanner.nextInt();

			switch (userChoice) {

			case 1:	do {
				System.out.println("1.Savings Max Account\n2.Current Account\n3.Loan Account\n Enter your Choice-)");
				accountChoice = scanner.nextInt();
				switch (accountChoice) {
				case 1:
				
						accountList.add(Service.createAccount());
//						System.out.println(
//								"1.Create Account\n2.Manage Account\n3.Display Account\n4.Exit\n Enter your Choice-");
						Service.displayAccount(accountList);
						System.out.println("Savings Max Account created");
						System.out.println("Account is active.!!!!!!  ");

						
					
					break;
				case 2:
					System.out.println("Manage Account");

				}
				System.out.println("Do you want to stay logged in : y/n ");

				checkAccount = scanner.next().charAt(0);
			} while (checkAccount == 'y');
			break;
			case 2:
				Service.manageAccount(accountList);
				break;
			}

			System.out.println("Do you want to continue: y/n ");
			checkChoice = scanner.next().charAt(0);
		} while (checkChoice == 'y');

	}

}
