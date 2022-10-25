package com.experion.utility;

import java.util.ArrayList;
import java.util.Scanner;
import com.experion.entity.Product;
import com.experion.service.Service;

public class ProductUtility {
	// TODO Auto-generated method stub
	public static void main(String[] args)throws Exception {
			 int userChoice;
				int choice;
				int i=0;
				char mainChoice;
				char c;
				Scanner scanner=new Scanner(System.in);
				System.out.println("**********WELCOME TO BANK**********");
				ArrayList<Product>productList=new ArrayList<Product>();
				do 
					{
					System.out.println("1.Create Account\n2.Manage Account\n3.Display Account\n4.Exit\n Enter your Choice-");
					userChoice=scanner.nextInt();
						
							switch(userChoice) 
							{
							case 1:	do
									{		
								System.out.println("1.Create Account\n2.Manage Account\n3.Display Account\n4.Exit\n Enter your Choice-");
									System.out.println("Enter your Choice- ");
									choice=scanner.nextInt();
									switch(choice) 
									{
										case 1:
											productList.add(Service.createProduct());
											i++;
											break;
										case 2:
											if(i<=0)
											{
												System.out.println("No products Available");
											}
											else
											Service.displayProductDetails(productList);
											break;
									}
									System.out.println("Do you want to continue? yes/no");
									c=scanner.next().charAt(0);	
									}while(c=='y');
									break;
							case 2:	do
									{	
									System.out.println("MENU\n 1.Display Products\n 2.Buy Products");
									System.out.println("Enter Choice =");
									choice=scanner.nextInt();
									switch(choice) 
										{
										case 1:
											Service.displayProductDetails(productList);
											break;
										case 2:
											Service.purchaseProduct(productList);
											break;
										}
											System.out.println("Do you want to continue? yes/no");
											c=scanner.next().charAt(0);	
										}while(c=='y');
										break;
							}
							
					System.out.println("Continue with Main Menu? yes/no");
						mainChoice=scanner.next().charAt(0);
				}while(mainChoice=='y');
					
	}
}


				