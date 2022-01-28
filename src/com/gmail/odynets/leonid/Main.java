package com.gmail.odynets.leonid;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//Scanning number from client
		Scanner sc = new Scanner(System.in);
		int number;
		System.out.println("Enter 5 digit number: ");
		number = sc.nextInt();
		
		//Taking digits from number
		int firstDigit = number / 10000;
		int secondDigit = number % 10000 / 1000;
		int thirdDigit = number % 1000 / 100;
		int fourthDigit = number % 100 / 10;
		int fifthDigit = number % 10 / 1;
			
		//Output result
		System.out.println(firstDigit);
		System.out.println(secondDigit);
		System.out.println(thirdDigit);
		System.out.println(fourthDigit);
		System.out.println(fifthDigit);

	}

}