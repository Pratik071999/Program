package com.monocept.test;

import java.util.Random;
import java.util.Scanner;

public class PigDice {
	public static void main(String[] args) {
		int turn = 0, totalscore = 0;
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		while (totalscore < 20) {
			turn++;
			System.out.println("Turn: " + turn);
			int turnscore = 0;
			char ch;
			while (true) {
				System.out.println("Roll or Hold?(r/h): ");
				ch = sc.next().charAt(0);
				if (ch == 'r') {
					int die = (int) r.nextInt(6)+1;
					System.out.println("Die: " + die);

					if (die == 1) {
						System.out.println("Turn over. No score");
						break;
					}
					turnscore = turnscore + die;
				} else if (ch == 'h') {
					totalscore = totalscore + turnscore;
					System.out.println("Score for the turn " + turnscore);
					System.out.println("Total score: " + totalscore);
					break;
				}
			}
		}
		System.out.println("You finished in " + turn + " turns");
	}

}
