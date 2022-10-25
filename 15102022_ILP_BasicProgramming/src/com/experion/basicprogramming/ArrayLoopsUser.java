package com.experion.basicprogramming;

import java.util.Scanner;

public class ArrayLoopsUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		String productNames[] = new String[5];
		int productCount;
		
		System.out.println("Enter the product count");
		
		System.out.println("Enter 5 prduct names");
		for (int index = 0; index < 5; index++) {
			productNames[index] = scanner.nextLine();
		}
		System.out.println("*********** Product In Stock ******************* ");
		for (int index = 0; index < 5; index++) {
			System.out.println(productNames[index]);

		}
	}
}
