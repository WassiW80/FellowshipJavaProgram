package com.bridgelabz.fellowship.basicprogram;

import com.bridgelabz.fellowship.utility.Utility;

public class HarmonicNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0;
		System.out.println("Enter the value of n to get harmonic number: ");
		num=Utility.integerInput();
		System.out.println(Utility.harmonicNumber(num));
	}

}
