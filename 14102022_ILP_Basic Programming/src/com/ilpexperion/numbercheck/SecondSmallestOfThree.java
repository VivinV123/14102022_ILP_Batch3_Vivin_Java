package com.ilpexperion.numbercheck;

import java.util.Scanner;

public class SecondSmallestOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		int firstNumber;
		int secondNumber;
		int thirdNumber;
		System.out.println("Enter 1 st number");
		firstNumber=scanner.nextInt();
		System.out.println("Enter 2 nd number");
		secondNumber=scanner.nextInt();
		System.out.println("Enter 3 rd number");
		thirdNumber=scanner.nextInt();
		
		
		
		
		if((firstNumber<secondNumber) && (firstNumber<thirdNumber)) {
			if((secondNumber<thirdNumber))
				System.out.println(secondNumber+" is Second Smallest");
			else
				System.out.println(thirdNumber+" is Second Smallest");
		}
		else if((secondNumber<firstNumber) && (secondNumber<thirdNumber))  {
			if((firstNumber<thirdNumber))
				System.out.println(firstNumber+" is Second Smallest");
			else
				System.out.println(thirdNumber+" is Second Smallest");
		}
		else if((thirdNumber<firstNumber) && (thirdNumber<secondNumber))  {
			if((firstNumber<secondNumber))
				System.out.println(firstNumber+" is Second Smallest");
			else
				System.out.println(secondNumber+" is Second Smallest");
		}
		

	}

}
