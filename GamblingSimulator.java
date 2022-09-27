package com.bridelabz;

import java.util.Scanner;

public class GamblingSimulator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter amount of stake :");
		int amount = sc.nextInt();
		System.out.println("Enter amount to bet after every play :");
		int bet = sc.nextInt();
		sc.close();
		System.out.println("Amount of stake is " + amount);

		System.out.println("Amount to bet after every game " + bet);
	}
}
