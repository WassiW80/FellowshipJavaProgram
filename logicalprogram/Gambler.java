package com.bridgelabz.fellowship.logicalprogram;

import com.bridgelabz.fellowship.utility.Utility;

public class Gambler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the stake, your goal and number of time you want to play bet:");
		int stake =Utility.integerInput();
		int goal =Utility.integerInput();
		int trail =Utility.integerInput();
		Utility.gambler(stake, goal, trail);
	}

}
