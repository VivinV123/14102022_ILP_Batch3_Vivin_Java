package com.experion.utility;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

import com.experion.entity.Product;
import com.experion.service.Service;

public class ProductUtility {

	public static void main(String[] args) {
		
		char mainChoice;
		char customerChoice;
		int serialNumber;
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<Product> productList = new ArrayList<Product>();
		
		System.out.println("************Welcom**********");
		do {
			System.out.println("1.Add Product 2.Display Product ");
			int choice = scanner.nextInt();
			switch(choice) {
				case 1:  try {
					productList.add(Service.createProduct());
				} catch (ParseException e) {
					
					e.printStackTrace();
				}
						 break;
				case 2: Service.displayProductDetails(productList);
						break;
			}
			
			System.out.println("Do you want to continue: y/n ");
			mainChoice = scanner.next().charAt(0);
		}while(mainChoice == 'y');
		
			System.out.println("Do you wish to purchase: y/n ");
			customerChoice = scanner.next().charAt(0);
		while(customerChoice == 'y')
		{
			
			System.out.println("Enter Serial Number");
			serialNumber = scanner.nextInt();
			Service. displayValidProducts(productList,serialNumber );
			
			System.out.println("Do you wish to purchase: y/n ");
			customerChoice = scanner.next().charAt(0);
		}
		System.out.println("Thank you");
	}
	

}
