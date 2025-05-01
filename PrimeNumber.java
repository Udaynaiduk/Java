package com.conditonalDemo;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		// WAP TO find given number is prime number or not
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to check ");
		int numberToCheck = sc.nextInt();
		int factorsCount = 0;
		int loopCounter = 0;
		if (numberToCheck % 2 == 0) {
			System.out.println("Given number is not prime");
		} else {
			for (int i = 2; i <= Math.sqrt(numberToCheck); i++) {
				if (numberToCheck % i == 0) {
					factorsCount++;// Alt shift R
				}
				loopCounter++;
				System.out.println(loopCounter);
			}
			if (factorsCount == 0) {
				System.out.println("Given number is Prime Number");
			} else {
				System.out.println("Given number is not prime");
			}
		}

	}

}
