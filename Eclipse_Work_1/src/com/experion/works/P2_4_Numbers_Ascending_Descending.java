package com.experion.works;

import java.util.Arrays;
import java.util.Scanner;

public class P2_4_Numbers_Ascending_Descending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner =new Scanner(System.in);
		int number[]=new int[4];
		
		System.out.println("Enter 4 numbers");
		for(int i=0;i<number.length;i++)
		{
			number[i]=scanner.nextInt();
		}
		System.out.println("The Numbers are");
		for(int i=0;i<number.length;i++)
		{
			
			System.out.println(number[i]);
		}
		System.out.println("Numbers in Ascending Order");
		Arrays.sort(number);
		for(int i=0;i<number.length;i++)
		{
			System.out.println(number[i]);
		}
		System.out.println("Numbers in Descending Order");
		for(int i=number.length-1;i>=0;i--)
		{
			System.out.println(number[i]);
		}
			

	}

}
