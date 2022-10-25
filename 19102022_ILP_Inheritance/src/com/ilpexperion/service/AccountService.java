package com.ilpexperion.service;

import com.ilpexperion.entity.Account;

public class AccountService {
	
	public void depositCash(Account account,double amount)
	{
		System.out.println("Depositing money via Counter");
	}
	public void depositCash(Account account,double amount,String upicode)
	{
		System.out.println("Depositing money via Online Transfer");
	}
	public void depositCash(Account account,String chequeNumber,double amount)
	{
		System.out.println("Depositing money via Cheque");
	}
	
}
