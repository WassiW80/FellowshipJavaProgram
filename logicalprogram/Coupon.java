package com.bridgelabz.fellowship.logicalprogram;

import com.bridgelabz.fellowship.utility.Utility;

public class Coupon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number of coupon you want to generate: ");
		int num=Utility.integerInput();
		System.out.println(Utility.collect(num));
	}

}
