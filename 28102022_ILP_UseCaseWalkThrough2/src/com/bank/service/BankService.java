package com.bank.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.bank.entity.Rate;
import com.bank.entity.Service;

public class BankService {

	public static Service createService() {
		// TODO Auto-generated method stub
		
		//taking inputs

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the following details to create service");
		System.out.println("Service Code : -");
		String serviceCode =scanner.nextLine();
		System.out.println("Service Name : -");
		String serviceName =scanner.nextLine();
		System.out.println("Service Description : -");
		String serviceDescription =scanner.nextLine();
		System.out.println("Open Date : -");
		String opendate =scanner.nextLine();
		System.out.println("Vaildity Date : -");
		String validitydate =scanner.nextLine();
		System.out.println("Expiry Date : -");
		String expirydate =scanner.nextLine();
		
		
	//String to date
		Date openDateConverted = stringToDate(opendate);
		Date validityDateConverted = stringToDate(validitydate);
		Date expiryDateConverted = stringToDate(expirydate);
		
		
//		Service service = new Service("SCB100","Cash Deposit","Cash Deposit", new Date(2022,10,27), new Date(2022,10,27),new Date(2022,10,27));
	
		
		//creation pf service object
		Service service = new Service(serviceCode,serviceName,serviceDescription,openDateConverted,validityDateConverted,expiryDateConverted);
		return service;
	}

	public static void createRateCard(Service service ) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		Rate rate = new Rate();
//		int [] min =new int[3];
//		int [] max =new int[3];
//		double [] fees =new double[3];
		
		
		System.out.println("***************************Enter the Rate Crd for "+service.getServiceName()+"****************");
		System.out.println("Enter the no. of tiers you want to add -");
		int noOfTiers =scanner.nextInt();
		
		int [] min =new int[noOfTiers];
		int [] max =new int[noOfTiers];
		double [] fees =new double[noOfTiers];
		
		for(int tier=0; tier<noOfTiers; tier++)
		{
			System.out.println("Enter the MIN   MAX and Rate for the"+ (tier+1)+ "tier");
			min[tier]= scanner.nextInt();
			max[tier]= scanner.nextInt();
			fees[tier]= scanner.nextDouble();
			System.out.println("Successfully inserted values in the" +(tier+1)+ "tier");
			
			if(tier<noOfTiers)
			{
				System.out.println("Do you want to add more tiers - (y/n)");
				char ch =scanner.next().charAt(0);
				if(ch =='y')
					continue;
				else
					break;
			}
			
			
		}
		
		
//		min[0]= 0;
//		min[1]= 2000;
//		min[2]= 5000;
//		
//		max[0]= 2000;
//		max[1]= 5000;
//		max[2]= 999999;
//		
//		fees[0]= 0.25;
//		fees[1]= 0.5;
//		fees[2]= 0.1;
		
//		
//		rate.setMin(min);
//		rate.setMax(max);
//		rate.setRate(fees); //setter method
		
		//setter vilichila
		service.setRate(rate);
		
		service.getRate().setMin(min);
		service.getRate().setMax(max);
		service.getRate().setRate(fees); //setter method
		System.out.println("************************Sucessully Created Rate Card for service "+service.getServiceName());
		
	}

	public static void displayServiceDetails(Service service) {
		// TODO Auto-generated method stub
		
		System.out.println("***************Service Details***************");
		System.out.println("Service Code"+"  "+"Service Name"+"  "+"Service Description"+"  "+"Open Date"+"  "+"Validity Date"+"  "+"Expiry Date");

		System.out.println(service.getServiceCode()+"  "+service.getServiceName()+"  "+service.getServiceDesc()+"  "+service.getOpenDate()+"  "+service.getValidityDate()+"  "+service.getExpiryDate());
		
		System.out.println("***************Rate Card for the service "+service.getServiceName()+"	"+ "is given below");
		
		System.out.println("Min		Max		Rate");
		for (int index=0; index <service.getRate().getMin().length;index++)
		{
			if((service.getRate().getMax()[index]<=999999)&&(service.getRate().getMax()[index]!=0))
			{
				System.out.println(service.getRate().getMin()[index]+"	"+service.getRate().getMin()[index]+"	"+service.getRate().getRate()[index]);
			}
		}
		
	}
	public static Date stringToDate(String dateString)
	{
		Date convertedDate= null;
		try {
			convertedDate = new SimpleDateFormat("dd/MM/yyy").parse(dateString);
			//parse means portion portion
			
			//converted to data inte object aakum
					
		
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			
		}
		return convertedDate;
		
	}

}
