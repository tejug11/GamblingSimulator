package com.bridelabz;

import java.util.Scanner;

public class GamblingSimulator {

	static int amountOfStake = 100;
	static int betAmount = 1;
	static int won = 1;
	static int lost = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Starting amount of stake : " + amountOfStake);
		System.out.println("Amount to bet after every play : " + betAmount);
		int play = (int) Math.floor(Math.random() * 10) % 2;
		System.out.println("Gamblers play:" + play);
		int InHandcash = amountOfStake;
		switch (play) {
		case 1:
			InHandcash = InHandcash + betAmount;
			System.out.println("Total current cash gambler has " + InHandcash);
			break;
		case 2:
			InHandcash = InHandcash - betAmount;
			System.out.println("Total current cash gambler has " + InHandcash);
			break;
		default:
			System.out.println("default");
		}
		if (play == 1) {
			System.out.println("Player had won the first play");
		} else {
			System.out.println("Player had lost the first play");
		}

	}

}