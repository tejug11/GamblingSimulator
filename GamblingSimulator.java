package com.bridelabz;

import java.util.Scanner;

public class GamblingSimulator {

	static int amount_of_stake = 100;
	static int bet_amount = 1;
	static int won = 1;
	static int lost = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Starting amount of stake is " + amount_of_stake);
		System.out.println("Amount to bet after every play " + bet_amount);
		int cashInHand = amount_of_stake;

		int InHandcash = 0;
		while (InHandcash > 50 && InHandcash < 150) {
			int play = (int) Math.floor(Math.random() * 10) % 2;
			System.out.println("Gamblers play:" + play);

			if (play == won) {
				cashInHand = InHandcash + bet_amount;
				System.out.println("Total current cash gambler has " + InHandcash);
			} else if (play == lost) {
				InHandcash = InHandcash - bet_amount;
				System.out.println("Total current cash gambler has " + InHandcash);
			} else {
				System.out.println("default");
			}
			if (play == 1) {
				System.out.println("Player won the current play");
			} else {
				System.out.println("Player lost the current play");
			}

		}
		if (InHandcash == 150 || InHandcash == 50) {
			System.out.println("Player will resign for current day");

		}
	}

}