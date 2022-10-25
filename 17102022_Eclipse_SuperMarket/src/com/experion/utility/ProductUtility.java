package com.experion.utility;

import java.util.Scanner;

import com.experion.service.Service;

public class ProductUtility {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Service service = new Service();
		System.out.println("************SuperMarket**********");
		System.out.println("Enter 1 - Add Product");
		System.out.println("Enter 2 - Display Product");
		int userChoice = scanner.nextInt();
		switch(userChoice) {
		case 1: service.inputProductDetails();
			service.displayProductDetails();
				break;
		case 2: service.displayProductDetails();
				break;
		default : System.out.println("Invalid Choice");
		}
		
		
		

	}

}
