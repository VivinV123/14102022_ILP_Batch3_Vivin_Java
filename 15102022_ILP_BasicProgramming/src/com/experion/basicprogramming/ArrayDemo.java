package com.experion.basicprogramming;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		int i;
		String productName[]= new String[5];
		
		System.out.println("Enter product name");
		productName[0]=scanner.nextLine();
		productName[1]=scanner.nextLine();
		productName[2]=scanner.nextLine();
		productName[3]=scanner.nextLine();
		productName[4]=scanner.nextLine();
		System.out.println("Products are"+productName[0]+" "+productName[1]+" "+productName[2]+" "+productName[3]+" "+productName[4]+" ");
		
		for(i=0;i<5;i++) {
			System.out.println(productName[i]);
			
			
		}
		
		
		
		

	}

}
