package com.ilpexperion.entity;

public abstract class Product {
	private String ProductName;

	public Product(String productName) {
		super();
		ProductName = productName;
	}

	public String getProductName() {
		return ProductName;
	}

	public void setProductName(String productName) {
		ProductName = productName;
	}
	
	public abstract void checkProductValidity();


}
