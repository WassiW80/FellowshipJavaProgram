package com.bridgelabz.fellowship.utility;

import java.util.*;

public class Utility {

	static Scanner scanner = new Scanner(System.in);

	// Input Integer
	public static int integerInput() {
		return scanner.nextInt();
	}

	// Input String
	public static String stringIntput() {
		return scanner.next();
	}

	// Input Double
	public static double doubleInput() {
		return scanner.nextDouble();
	}

	// Input FLoat
	public static float floatInput() {
		return scanner.nextFloat();
	}

	// Input Long
	public static long longInput() {
		return scanner.nextLong();
	}

	// Flip Coin
	public static String flipCoin(int num) {

		int head = 0, tail = 0;
		for (int i = 0; i < num; i++) {
			if (Math.random() > 0.5) {
				head++;
			} else {
				tail++;
			}
		}
		return "Percentage of head and tail: " + head * 100.0 / num + " & " + tail * 100.0 / num;
	}

	// Leap Year
	public static boolean leapYear(int year) {
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			return true;
		}
		return false;
	}

	// Power of 2
	public static int powerOf2(int num) {
		int pow = 1;
		if (num >= 0 && num < 31) {
			for (int i = 0; i < num; i++) {
				pow = pow * 2;
			}
			return pow;
		} else {
			System.out.println("Enter a number less than 31");
			return pow = 0;
		}

	}

	// Harmonic Number
	public static double harmonicNumber(int num) {
		double h = 1;
		if (num != 0) {
			for (int i = 1; i <= num; i++) {
				h = h + (float) 1 / i;
			}
		}
		return h;
	}

	// Factor
	public static int primeFactor(int num) {
		int i = 2;
		System.out.print(num + " = ");
		while (i * i <= num) {
			if (num % i == 0) {
				System.out.print(i + " * ");
				num = num / i;
			} else {
				i++;
			}
		}
		return num;
	}

	// Distance
	public static double distance(int x, int y) {
		double sqrt = (Math.pow(x, x) + Math.pow(y, y));
		return sqrt;
	}

	// Quadratic
	public static String quadratic(int a, int b, int c) {
		double delta = Math.abs(b * b - 4 * a * c);
		double root1 = (-b + Math.sqrt(delta) / (2 * a));
		double root2 = (-b - Math.sqrt(delta) / (2 * a));
		return "Root 1 of x: " + root1 + " Root 2 of x: " + root2;
	}

	// Wind Chill
	public static double windChill(double t, double v) {
		return 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16);
	}

	// Gambler
	public static void gambler(int stake, int goal, int trail) {
		int bet = 20;
		int won = 0, loss = 0;
		for (int i = 0; i < trail; i++) {
			if (stake < bet) {
				System.out.println("You don't have enough money to play: ");
				break;
			} else if (goal <= stake) {
				break;
			} else {
				if (Math.random() > 0.5) {
					stake = stake + (bet * 2);
					won++;
				} else {
					stake = stake - (bet * 2);
					loss++;
				}
			}
		}
		System.out.println(stake + "Number of won: " + won);
		System.out.println("Percentage of win and loss: " + (won * 100.0) / trail + " & " + (loss * 100.0) / trail);
	}

	// Coupon
	public static int getCoupon(int n) {
		return (int) (Math.random() * n);
	}

	public static int collect(int n) {
		boolean[] isCollected = new boolean[n];
		int count = 0;
		int distinct = 0;
		while (distinct < n) {
			int value = getCoupon(n);
			count++;
			if (!isCollected[value]) {
				distinct++;
				isCollected[value] = true;
			}
		}
		return count;
	}

	// Day of Week
	public static int dayOfWeek(int d, int m, int y) {
		y = y - (14 - m) / 12;
		int x = y + y / 4 - y / 100 + y / 400;
		m = m + 12 * ((14 - m) / 12) - 2;
		d = (d + x + 31 * m / 12) % 7;
		return d;
	}

	// celsius to fahrenheit
	public static double fahrenheit(double celsius) {
		return (celsius * (9 / 5)) + 32;
	}

	// fahrenheit to celsius
	public static double celsius(double fahrenheit) {
		return (fahrenheit - 32) * 5 / 9;
	}

	// monthly Payment
	public static double monthlyPayment(double p, double y, double r) {
		r = r / 100;
		y = 12 * y;
		return (p * r) / 1 - Math.pow((1 - r), (-y));
	}

	// square root using newton's method
	public static double sqrt(double c) {
		double t = c;
		double epsilon = 1e-15;
		while (Math.abs(t - (c / t)) > epsilon * t) {
			t = c / t + t;
		}
		return t;
	}

	// 2D array
	public static void array2D(int m, int n) {
		int array[][] = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.println("Enter the elements: ");
				array[i][j] = integerInput();
			}
		}
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}

	// Tripplets
	public static void tripplet(int n) {
		int array[] = new int[n];
		int count = 0;
		for (int i = 0; i < n; i++) {
			System.out.println("Enter the elments: ");
			array[i] = integerInput();
		}
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				for (int k = j + 1; k < n; k++) {
					if (array[i] + array[j] + array[k] == 0) {
						// System.out.println(array[i]+"i"+array[j]+"j"+array[k]+"k");
						count++;
					}
				}
			}
		}
		System.out.println(count);
	}

	// Decimal to Binary
	public static int[] binary(int decimal) {
		// int binary[]=new int[256];
		// int i=0;
		String string = "";
		while (decimal > 0) {
			string = decimal % 2 + string;
			decimal = decimal / 2;
			// System.out.println(string);
			// i++;
		}
		while (string.length() % 4 != 0) {
			string = 0 + string;
		}
		return stringToArray(string);
	}

	// string to integer array
	public static int[] stringToArray(String string) {
		int[] binary = new int[string.length()];
		for (int i = 0; i < binary.length; i++) {
			binary[i] = string.charAt(i) - 48;
		}
		return binary;
	}

	// Stopwatch
	// Start function
	public static long startTime() {
		long start = 0;
		System.out.println("Enter 1 to start timer: ");
		start = longInput();
		start = System.currentTimeMillis();
		return start;
	}

	// Stop function
	public static long stopTime() {
		long stop = 0;
		System.out.println("Enter 2 to stop timer: ");
		stop = longInput();
		stop = System.currentTimeMillis();
		return stop;
	}

	// Vending machine
	public static void vendingMachine(int amount) {
		int[] arr = { 2000, 500, 100, 50, 20, 10, 5, 2, 1 };
		int amount1 = 0;
		int flag = 0;
		// int i=0;
		for (int i = 0; i < arr.length; i++) {
			if (amount / arr[i] > 0) {
				amount1 = amount % arr[i];
				amount = amount / arr[i];
				System.out.println(amount + " of " + arr[i] + " ");
				flag = flag + amount;
				amount = amount1;

			}

		}
		System.out.println("Total notes are: " + flag);

		// i++;

	}

	// Binary search
	public static void binarySearch(int num) {
		String array[] = new String[num];
		int low = 0;
		boolean found = false;
		int high = array.length - 1;
		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter the elements in array: ");
			array[i] = stringIntput();
		}
		System.out.println("Enter the element you want to search: ");
		String search = stringIntput();
		while (low <= high) {
			int mid = (low + high) / 2;
			if (array[mid].equalsIgnoreCase(search)) {
				found = true;
				break;
			} else if (array[mid].compareToIgnoreCase(search) > 0) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		if (found) {
			System.out.println("Element found!!!");
		} else {
			System.out.println("Element Not found!!!");
		}
	}

	// Insertion sort
	public static void insertionSort(int num) {
		String array[] = new String[num];
		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter the element you want: ");
			array[i] = stringIntput();
		}
		for (int i = 0; i < array.length; i++) {
			String temp = array[i];
			int j = i;
			while (j > 0 && (array[j - 1].compareTo(temp) > 0)) {
				array[j] = array[j - 1];
				j--;
			}
			array[j] = temp;
		}
		System.out.println("Elements after sorting: ");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

	// Bubble sort
	public static void bubbleSort(int num) {
		String array[] = new String[num];
		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter the element you want: ");
			array[i] = Utility.stringIntput();
		}
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - 1 - i; j++) {
				if (array[j].compareTo(array[j + 1]) > 0) {
					String temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		System.out.println("Elements after sorting: ");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

	// Anagram
	public static void anagram(String string, String string2) {
		int count = 0;
		if (string.length() == string2.length()) {
			for (int i = 0; i < string.length(); i++) {
				for (int j = 0; j < string2.length(); j++) {
					if (string.toLowerCase().charAt(i) == string2.toLowerCase().charAt(j)) {
						count++;
					}
				}
			}
			if (count >= string.length()) {
				System.out.println("String are anagram!!!");
			} else {
				System.out.println("String are not anagram!!!");
			}
		}
	}

	// Prime number
	public static void isPrime() {
		int[] array = new int[1000];
		for (int i = 2; i < array.length; i++) {
			if (i == 2 || i == 3 || i == 5 || i == 7) {
				System.out.println(i);
			} else if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0) {
				System.out.println(i);
			}
		}
	}

	// Count Function
	public static int[] count(int n) {
		int count[] = new int[10];
		int temp = n;
		while (temp != 0) {
			int rem = temp % 10;
			count[rem]++;
			temp = temp / 2;
		}
		return count;
	}

	// Integer Anagram
	public static boolean intAnagram(int n1, int n2) {
		int[] n1count = count(n1);
		int[] n2count = count(n2);
		for (int i = 0; i < n2count.length; i++) {
			if (n1count[i] != n2count[i]) {
				return false;
			}
		}
		return true;
	}

	// Find your answer
	public static void guessYourNumber(int num) {
		int NUM = (int) Math.pow(2, (num));
		int array[] = new int[NUM];
		int low = 0;
		int high = array.length - 1;
		for (int i = 0; i < NUM; i++) {
			System.out.print(i + "  ");
			array[i] = i;
		}
		System.out.println();
		for (int j = 0; j < num; j++) {
			int mid = (low + high) / 2;
			System.out.println();
			System.out.println("Enter ''true'' if your number is betwen" + low + " - " + mid
					+ "  ''false'' if your number is between " + (mid+1) + " - " + high);
			boolean yes = scanner.nextBoolean();
			// boolean yes=false;
			System.out.println();

			if (yes) {
				for (int i = low; i < mid; i++) {
					System.out.print(array[i] + " ");
					/*
					 * if (array.length == 0) { System.out.println("Your number is: " + array[i]); }
					 */
				}
				high = mid;
			} else {
				// System.out.print("---OR--- ");
				for (int i = mid; i < high; i++) {
					System.out.print(array[i] + " ");
					low = mid;
					/*
					 * if (array.length == 1) { System.out.println("Your number is: " + array[i]); }
					 */
				}
			}

		}

	}

}
