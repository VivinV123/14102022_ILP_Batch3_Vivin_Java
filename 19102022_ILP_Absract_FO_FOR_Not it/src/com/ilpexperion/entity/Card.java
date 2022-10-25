package com.ilpexperion.entity;

public class Card extends Product {
	private String cardType;
	private BankServices cardServices;
	public Card(String productCode, String productName, String productType, String cardType,
			BankServices cardServices) {
		super(productCode, productName, productType);
		this.cardType = cardType;
		this.cardServices = cardServices;
	}
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	public BankServices getCardServices() {
		return cardServices;
	}
	public void setCardServices(BankServices cardServices) {
		this.cardServices = cardServices;
	}

	

}
