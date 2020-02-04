package com.bridgelabz.fellowship.junitprogram;

import com.bridgelabz.fellowship.utility.Utility;

public class MonthlyPayment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double p=Double.parseDouble(args[0]);
		double y=Double.parseDouble(args[1]);
		double r=Double.parseDouble(args[2]);
		System.out.println(Utility.monthlyPayment(p, y, r));
	}

}
