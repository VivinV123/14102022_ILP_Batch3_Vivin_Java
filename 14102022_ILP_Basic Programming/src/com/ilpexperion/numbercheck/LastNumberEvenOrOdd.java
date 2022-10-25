package com.ilpexperion.numbercheck;

import java.util.Scanner;

public class LastNumberEvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int number;
		int lastnumber;
		
		System.out.println("Enter the number");
		number=scanner.nextInt();
		lastnumber=number%10;
	
		if((lastnumber%2)==0) {
			System.out.println("Number is Even ");
		}
		else {
			System.out.println("Number is Odd ");
		}
		
		

	}

}
