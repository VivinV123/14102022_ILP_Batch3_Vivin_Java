package com.bank.utility;

import java.util.Scanner;

import com.bank.entity.Service;
import com.bank.service.BankService;

public class BankUtility {

	public static void main(String[] args) {
		Service service =null;
		Scanner scanner = new Scanner(System.in);
		int mainChoice;
		
		do {
			
			System.out.println("1.Create Service 2.Create Rate 3. Display Service Details");
			mainChoice = scanner.nextInt();
			
			switch(mainChoice) {
			case 1:
				service = BankService.createService();
				break;
				
			case 2:
				BankService.createRateCard(service);
				break;
			case 3:
				BankService.displayServiceDetails(service);
				break;
			case 4:
				System.exit(0);
				break;
			}
			
			
		}while(mainChoice !=4); //other than do you want continue
		

		
//		Service service = BankService.createService();
//		BankService.createRateCard(service);
//		BankService.displayServiceDetails(service);
	}

}
