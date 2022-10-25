package com.ilpexperion.entity;

public class Product {
	private String productCode;

	public Product(String productCode, String productName, String productType) {
		super();
		this.productCode = productCode;
		this.productName = productName;
		this.productType = productType;
	}
	private String productName;
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	private String productType;
}
