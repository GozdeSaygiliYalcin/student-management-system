package com.bilgeadam.lesson020;

import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Oyuncu sayısı: ");
		int numOfPlayers = in.nextInt();
		System.out.println();
		in.nextLine();
		
		String[] players = new String[numOfPlayers];
		
		for (int i = 0; i < numOfPlayers; i++) {
			System.out.print((i + 1) + ". oyuncunun adı: ");
			players[i] = in.nextLine();
		}
		in.close();
		System.out.println("\n==================\n");
		for (int i = 0; i < numOfPlayers; i++) {
			System.out.println((i + 1) + ". oyuncunun adı: " + players[i]);
		}

//		System.out.println(players[6]);
		System.out.println("===================");
		int i = 1;
		for (String player : players) {
			System.out.println(i++  + ". oyuncunun adı: " + player);
		}
	}

}
