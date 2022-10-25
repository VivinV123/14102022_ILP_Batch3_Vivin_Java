package com.experion.service;

import java.util.Scanner;

import com.experion.entity.Product;

public class Service {
	
	
	//static Product product =null; => not good

	
	public static Product createProduct() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Product Codes -");
		String productCode = scanner.nextLine();
		System.out.println("Enter Product Name -");
		String productName = scanner.nextLine();
		System.out.println("Enter Product Description -");
		String productDescription = scanner.nextLine();
		System.out.println("Enter Product Price -");
		double productPrice = scanner.nextDouble();

		scanner.nextLine();
		System.out.println("Enter Product Open Date -");
		String openDate = scanner.nextLine();
		System.out.println("Enter Product Validity Date -");
		String validityDate = scanner.nextLine();
		System.out.println("Enter Product Expiry Date -");
		String expiryDate = scanner.nextLine();
		System.out.println("Active (true or false) "
				+ "-");
		boolean active = scanner.nextBoolean();
		
//		product.setProductCode(productCode);
//		product.setProductName(productName);
//		product.setProductDescription(productDescription);
//		product.setProductPrice(productPrice);
//		product.setOpenDate(openDate);
//		product.setValidityDate(validityDate);
//		product.setExpiryDate(expiryDate);
//		product.setActive(active);
//		
		Product product =new Product(productCode,productName,productDescription,productPrice,openDate,validityDate,expiryDate,active);
		
		
		return product;
	}

	public static  void displayProductDetails(Product productList[]) {
		System.out.println("Product Code" + "		" +"Product Name" + "		" + "Product Description" + "		" + "Product Price" + "		"
				+ "Open Date" + "		" + "Validity Date" + "		" + "Expiry Date" + "		" + "active");
		
		for(Product product: productList) {
			System.out.println(product.getProductCode() + "		" +product.getProductName() + "		" + product.getProductDescription() + "		" + product.getProductPrice() + "		" + product.getOpenDate()
			+ "		" + product.getValidityDate() + "		" + product.getExpiryDate() + "		" + product.isActive());
		}
		
		
	}


}
