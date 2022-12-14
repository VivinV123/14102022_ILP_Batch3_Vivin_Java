package com.bank.utility;

import java.util.ArrayList;
import java.util.Scanner;

import com.bank.entity.Account;
import com.bank.entity.Customer;
import com.bank.service.MisService;
import com.bank.service.Service;

public class BankUtility {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Account> accountList = new ArrayList<Account>();
		Customer customer = null;
		char choice;
		do {
			System.out.println("******************Welcome To Bank************");
			// System.out.println("1.Create Account 2.Deposit Money 3. Display Account
			// Details 4.Withdraw Money \n Enter your Choice");
			System.out.println("1.Create Account 2.Manage Account 3. Display Account 4. Exit");
			int mainChoice = scanner.nextInt();
			switch (mainChoice) {
			case 1:
				String customerAccountChoice = MisService.enterAccountChoice();
				accountList.add(Service.createAccount(customerAccountChoice, null));
				customer = Service.createCustomer(accountList);
				System.out.println(customerAccountChoice + " Created for " + customer.getCustomerName()+"!");
				System.out.println("Account is Active !!!");
				break;
			case 2: Service.manageAccount(customer);
				
				break;

			case 3:

				MisService.displayAccountDetails(customer, accountList);

				break;
			case 4:
				System.exit(0);

			}
			System.out.println("Do you wish to continue in Main Menu  (y/n) : - ");
			choice = scanner.next().charAt(0);

		} while (choice == 'y' || choice == 'Y');

	}
	

}
