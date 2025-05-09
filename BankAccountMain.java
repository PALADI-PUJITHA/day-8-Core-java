package com.blc.elc;

public class BankAccountMain {
	public static void main(String[] args) {
		BankAccount ba=new BankAccount();
		ba.setAccountDetails("Rahul", 123456, 5000.0);
		System.out.println(ba.getAccountDetails());
	}
}
