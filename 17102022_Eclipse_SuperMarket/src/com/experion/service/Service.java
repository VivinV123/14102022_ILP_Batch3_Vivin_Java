package com.experion.service;

import java.util.Scanner;

import com.experion.entity.Product;

public class Service {

	Product product[] = new Product[3];
	String userInput; 
	int noOfProducts=0;

	public void inputProductDetails() {
		
		do {
			
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter Product Code - ");
			String productCode = scanner.nextLine();
			

			System.out.println("Enter Product Name - ");
			String productName = scanner.nextLine();
			

			System.out.println("Enter Product Description - ");
			String productDescription = scanner.nextLine();
			

			System.out.println("Enter Product Price - ");
			double productPrice = scanner.nextDouble();
			

			System.out.println("Enter Open Date - ");
			String openDate = scanner.nextLine();
			

			scanner.nextLine();
			System.out.println("Enter Validity Date - ");
			String validityDate = scanner.nextLine();
			
			

			System.out.println("Enter Expiry Date - ");
			String expiryDate = scanner.nextLine();
			

			System.out.println("Enter whether product is active - ");
			boolean active = scanner.nextBoolean();
			
			product[noOfProducts] = new Product(productCode,productName,productDescription,productPrice,openDate,validityDate,expiryDate,active);
			noOfProducts+=1;
			
			System.out.println("Do you want to continue - yes/no :");
			userInput = scanner.nextLine();
			
		}	while(userInput=="yes");	
	}

	public void displayProductDetails() {
		for(int i=0;i<=noOfProducts;i++) {
		System.out.println("The product code is " + product[noOfProducts].getProductCode());
		System.out.println("The product name is " + product[noOfProducts].getProductName());
		System.out.println("The product description is " + product[noOfProducts].getProductDescription());
		System.out.println("The product price is " + product[noOfProducts].getProductPrice());
		System.out.println("The product open date is " + product[noOfProducts].getOpenDate());
		System.out.println("The product validity date is " + product[noOfProducts].getValidityDate());
		System.out.println("The product expiry date is " + product[noOfProducts].getExpiryDate());
		System.out.println("The product is active - " + product[noOfProducts].isActive());
	}

	}
}
