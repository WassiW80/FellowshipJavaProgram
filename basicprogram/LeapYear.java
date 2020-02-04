package com.bridgelabz.fellowship.basicprogram;

import com.bridgelabz.fellowship.utility.Utility;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year=0;
		System.out.println("Enter the year: ");
		year=Utility.integerInput();
		if (Utility.leapYear(year)) {
			System.out.println("Leap Year");
		}
		else {
			System.out.println("Not Leap Year");
		}
	}

}
