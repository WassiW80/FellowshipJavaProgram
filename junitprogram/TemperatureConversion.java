package com.bridgelabz.fellowship.junitprogram;

import com.bridgelabz.fellowship.utility.Utility;

public class TemperatureConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double celsius=0,fahrenheit=0;
		System.out.println("Enter your choice:\n 1. To convert celsius to fahrenheit\n 2.To convert fahrenheit to celsius");
		int choice=Utility.integerInput();
		switch (choice) {
		case 1:
			System.out.println("Enter temperature in celsius: ");
			celsius=Utility.doubleInput();
			System.out.println(Utility.fahrenheit(celsius));
			break;
			case 2:
				System.out.println("Enter temperature in fahrenheit: ");
				fahrenheit=Utility.doubleInput();
				System.out.println(Utility.celsius(fahrenheit));
				break;

		default:
			break;
		}
	}

}
