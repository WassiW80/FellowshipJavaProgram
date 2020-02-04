package com.bridgelabz.fellowship.functionalprogram;

import java.util.Scanner;

import com.bridgelabz.fellowship.utility.Utility;

public class Array2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m=0,n=0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the rows and columns: ");
		m=scanner.nextInt();
		n=scanner.nextInt();
		Utility.array2D(m, n);
	}

}
