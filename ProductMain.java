package com.blc.elc;

public class ProductMain {
	public static void main(String[] args) {
		Product product=new Product();
		product.setProductDetails("Laptop",501,75000.0);
		System.out.println(product.getProductDetails());
	}
}
