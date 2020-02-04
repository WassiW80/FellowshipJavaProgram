package com.bridgelabz.fellowship.functionalprogram;

import com.bridgelabz.fellowship.utility.Utility;

public class Quadratic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the value of a, b, c: ");
		int a=Utility.integerInput();
		int b=Utility.integerInput();
		int c=Utility.integerInput();
		System.out.println(Utility.quadratic(a, b, c));
	}

}
