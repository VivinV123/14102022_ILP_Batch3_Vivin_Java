package com.ilpexperion.BasicProgramming;

import java.util.Scanner;

public class ExperionEmployeeDetailsScanner {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		String trainingName = "****************Welcome to ILP Program*************";
		String employeeName;
		int  employeeAge;
		char employeeGender;
		double employeeCgpa;
		
		System.out.println("Enter your Employee name");
		employeeName = scanner.nextLine();
		System.out.println("Enter your Employee Age");
		employeeAge = scanner.nextInt();
		System.out.println("Enter your Employee Gender");
		employeeGender = scanner.next().charAt(0);
		System.out.println("Enter your Employee Cgpa");
		employeeCgpa = scanner.nextDouble();
		
		
		
		System.out.println(trainingName);
		System.out.println("Name"+ "	"+"Age"+"	"+"Gender"+"	"+"CGPA");
		System.out.println(employeeName+"	"+employeeAge+"	"+employeeGender+"	"+employeeCgpa);

	}

}
