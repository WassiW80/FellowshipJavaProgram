package com.bridgelabz.fellowship.junitprogram;

import com.bridgelabz.fellowship.utility.Utility;

public class DayOfWeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int d=0,m=0,y=0;
		System.out.println("Enter the day, month and year in number format");
		d=Utility.integerInput();
		m=Utility.integerInput();
		y=Utility.integerInput();
		System.out.println(Utility.dayOfWeek(d, m, y));
	}

}
