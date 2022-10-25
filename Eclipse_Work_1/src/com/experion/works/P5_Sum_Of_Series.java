package com.experion.works;

import java.util.Scanner;

public class P5_Sum_Of_Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Sum of Series 1^1-3^2+5^3-7^4+.............+n");
		System.out.println("Enter the range of number");
		int number = scanner.nextInt();
		int initial = 1;
		int sum = 0;
		int total = 0;
		int count=0;
		System.out.println("The series is");
		if (number % 2 != 0) {
			while (initial <= number)

			{
				count++;
				int finale = initial*count + 2;
				System.out.println(initial + "-" + finale);
				sum = (initial - finale);
				total += sum;
				initial = finale + 2;

			}

			System.out.println("Sum of the Series is  " + total);
		} else {
			System.out.println("Please Enter a odd number ");
		}

	}

}
