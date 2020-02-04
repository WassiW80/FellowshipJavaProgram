package com.bridgelabz.fellowship.logicalprogram;

import com.bridgelabz.fellowship.utility.Utility;

public class StopWatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long start=Utility.startTime();
		System.out.println("Started at: "+start);
		long stop=Utility.stopTime();
		System.out.println("Stoped at: "+stop);
		System.out.println("Elapsed time is: "+(stop-start)*1000+" sec");
	}

}
