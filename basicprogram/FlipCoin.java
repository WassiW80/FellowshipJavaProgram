package com.bridgelabz.fellowship.basicprogram;

import com.bridgelabz.fellowship.utility.Utility;

public class FlipCoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0;
		System.out.println("Enter the number of time you want to toss coin: ");
		num=Utility.integerInput();
		System.out.println(Utility.flipCoin(num));
	}

}
