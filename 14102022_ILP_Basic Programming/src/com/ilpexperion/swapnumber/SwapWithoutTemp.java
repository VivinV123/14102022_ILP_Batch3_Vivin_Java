package com.ilpexperion.swapnumber;

import java.util.Scanner;

public class SwapWithoutTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		int firstNumber;
		int secondNumber;
		System.out.println("Enter 1 st number");
		firstNumber=scanner.nextInt();
		System.out.println("Enter 2 nd number");
		secondNumber=scanner.nextInt();
		System.out.println("Two numbers are"+" "+firstNumber+" "+"and"+" "+secondNumber);
		System.out.println("Swapped Numbers");
	
		firstNumber=firstNumber+secondNumber;
		secondNumber=firstNumber-secondNumber;
		firstNumber=firstNumber-secondNumber;
		
		System.out.println("Two numbers are"+" "+firstNumber+" "+"and"+" "+secondNumber);
		
		
		
		
		

	}

}
