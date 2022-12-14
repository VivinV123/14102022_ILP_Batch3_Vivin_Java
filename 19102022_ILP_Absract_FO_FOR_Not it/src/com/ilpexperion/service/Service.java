package com.ilpexperion.service;

import java.util.ArrayList;

import com.ilpexperion.entity.Account;
import com.ilpexperion.entity.BankServices;
import com.ilpexperion.entity.Card;
import com.ilpexperion.entity.Product;

public class Service {
	public static Product createProduct(String productType) {
		// TODO Auto-generated method stub

		Product product = null;
		
		//BankServices bankServices = new BankServices("SCB100","Online Banking");
		
		ArrayList<BankServices> bankServiceList =new ArrayList<BankServices>();
		
		bankServiceList.add(new BankServices("AC111","Savings"));
		bankServiceList.add(new BankServices("AC111","Savings Acount"));
		
		
		BankServices cardServices = new BankServices("ACT100","Cashing Withdrawl");
		
		
		if (productType.compareTo("Cards") == 0) {
			 product = new Card("PRDMC100", "MasterCard", "Cards", "Master",cardServices);

		} else if (productType.compareTo("Accounts") == 0) {
			product = new Account("PRDWSA100", "Womens Savings Account", "Accounts", "Savings",bankServiceList);

		}
		return product;

	}


	public static void displayProduct(ArrayList<Product> productList) {
		// TODO Auto-generated method stub
		
		Card card = null;
		Account account =null;
		System.out.println("Product Code"+"	"+"Product Name"+"	"+"Account/Card"+"	"+"Product Type"+"	"+"Services");
		for(Product product:productList)
		{
			if(product instanceof Card)
			{

				card =(Card)product;
			System.out.println(card.getProductCode()+"	"+card.getProductName()+"	"+card.getProductType()+"	"+card.getCardType()+"	"+card.getCardType()+"	");	
			}
			
			
			
			else if(product instanceof Account)
			{
				account =(Account)product;
				System.out.println(account.getProductCode()+"	"+account.getProductName()+"	"+account.getProductType()+"	"+account.getAccountType()+"	");
				//account.getBankServices().getServiceName() to access method from BankServices use . operator
				
				for(BankServices bankServices : account.getBankServiceList())
				{
					System.out.println(bankServices.getServiceName());
				}
			}
				
			
				
			
		}
		
	}

}
