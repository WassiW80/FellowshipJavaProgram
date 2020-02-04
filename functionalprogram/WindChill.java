package com.bridgelabz.fellowship.functionalprogram;

import com.bridgelabz.fellowship.utility.Utility;

public class WindChill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double t=Double.parseDouble(args[0]);
		double v=Double.parseDouble(args[1]);
		System.out.println(Utility.windChill(t, v));
	}

}
