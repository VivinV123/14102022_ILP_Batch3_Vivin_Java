package com.experion.works;

import java.util.Scanner;

public class P4_Sum_Of_Series_Primes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Sum of Series 1^3+2^3+3^3+5^3+7^3+.............+n^3");
		System.out.println("Enter the range of number");
		int number = scanner.nextInt();
		int sum = 0;
		int m = 0;
		
		if(number%2!=0)
		{
			System.out.println("The prime cube series for "+number+" is");
			for (int i=1;i<=number;i++)
				
			{
				int count=0;
				
				
				for(int j=2;j<=i/2;j++)
				{
					if(i%j==0) {
						count++;
						break;
					}
					break;
				}
				
				if(count==0) {
					 m=i*i*i;
					sum+=m;
					System.out.println(m);
				}
				
				
				
			}
			System.out.println("The Sum is "+sum);
		}
		else {
			System.out.println("please enter a prime number");
			
		}
	
		
	}

}
