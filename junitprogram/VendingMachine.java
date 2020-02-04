package com.bridgelabz.fellowship.junitprogram;

import com.bridgelabz.fellowship.utility.Utility;

public class VendingMachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int amount=0;
		System.out.println("Enter the amount you want to withdraw: ");
		amount=Utility.integerInput();
		Utility.vendingMachine(amount);
	}

}
