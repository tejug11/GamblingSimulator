package com.bridelabz;

import java.util.Scanner;

public class GamblingSimulator {
	static int amaunt_of_stake = 100;
	static int bet_amaunt = 1;
	static int won = 1;
	static int lost = 0;
	static int total_amaunt = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Starting amount of stake is " + amaunt_of_stake);
		System.out.println("Amount to bet after every play " + bet_amaunt);
		for (int i = 1; i <= 20; i++) {
			int cashInHand = amaunt_of_stake;
			while (cashInHand > 50 && cashInHand < 150) {
				int play = (int) Math.floor(Math.random() * 10) % 2;
				System.out.println("Gamblers play:" + play);

				switch (play) {
				case 1:
					cashInHand = cashInHand + bet_amaunt;
					System.out.println("Total current cash gambler has " + cashInHand);
					break;
				case 0:
					cashInHand = cashInHand - bet_amaunt;
					System.out.println("Total current cash gambler has " + cashInHand);
					break;
				default:
					System.out.println("default");
				}
				if (play == 1) {
					System.out.println("Player won the current play");
				} else {
					System.out.println("Player lost the current play");
				}

			}
			if (cashInHand == 150 || cashInHand == 50) {
				System.out.println("Player would like to resign for current day" + i);

			}
			total_amaunt = total_amaunt + cashInHand;
		}
		System.out.println("Total amount player has after 20 days as per day included = " + total_amaunt + " $");
	}
}
