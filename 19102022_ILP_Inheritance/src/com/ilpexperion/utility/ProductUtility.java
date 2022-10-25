package com.ilpexperion.utility;

import java.util.Scanner;

import com.ilpexperion.entity.Account;
import com.ilpexperion.entity.Card;
import com.ilpexperion.entity.Loan;
import com.ilpexperion.entity.Product;
import com.ilpexperion.service.AccountService;

public class ProductUtility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Product product =new Product("Account"); Error cannot crearte
//		
//		Account account = new Account("Womens Saving Account","ACFG100044",10000);
//		AccountService accountservice = new AccountService();
//		accountservice.depositCash(account, 20000);
//		accountservice.depositCash(account, 0,"6282395195@ybi");
//		accountservice.depositCash(account,"SBI82395195",1000);
		
		Scanner scanner = new Scanner(System.in);
		Product product =null;//
		System.out.println("1. Account 2. Card 3. Loan");
		int choice =scanner.nextInt();
		if(choice==1)
		{
			product = new Account("Womens Savings account","ASF33444",10000);
		}
		else if(choice==2)
		{
			product = new Card("Master Card","CARDMS33434",100000);
		}
		if(choice==3)
		{
			product = new Loan("Home Loan","Loan33444",20000);
		}
		product.checkProductValidity();
		
}

}