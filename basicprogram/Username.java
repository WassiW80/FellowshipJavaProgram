package com.bridgelabz.fellowship.basicprogram;

import com.bridgelabz.fellowship.utility.Utility;

public class Username {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string,string2,string3,string4;
		System.out.println("Enter a string: ");
		string=Utility.stringIntput();
		System.out.println("Enter a <<username>> name you want to replace:");
		string2=Utility.stringIntput();
		System.out.println("Enter a name you want to replace with:");
		string3 = Utility.stringIntput();
		
		string4=string.replace(string2, string3);
		System.out.println(string4);
	}

}
