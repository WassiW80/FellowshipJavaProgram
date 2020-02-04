package com.bridgelabz.fellowship.basicprogram;

import com.bridgelabz.fellowship.utility.Utility;

public class PrimeFactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0;
		System.out.println("Enter a number to find a prime factor: ");
		num=Utility.integerInput();
		System.out.println(Utility.primeFactor(num));
	}

}
