package com.bilgeadam.lesson012;

import java.util.Random;
import java.util.Scanner;

public class Dodekafobi {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Lütfen hangi sayıya dek rastgele numara üretilmesi istegiğinizi giriniz: ");
		int upperBound = in.nextInt();
		in.close();
		
		System.out.println("1. Çekilen sayı: " + getRandomNumber(upperBound));
		System.out.println("2. Çekilen sayı: " + getRandomNumber(upperBound));
		System.out.println("3. Çekilen sayı: " + getRandomNumber(upperBound));
		System.out.println("4. Çekilen sayı: " + getRandomNumber(upperBound));
		System.out.println("5. Çekilen sayı: " + getRandomNumber(upperBound));
		System.out.println("6. Çekilen sayı: " + getRandomNumber(upperBound));
	}

	private static int getRandomNumber(int upperBound) {
		Random rnd = new Random();
		int randomNumber = -1;
		do {
			randomNumber = rnd.nextInt(upperBound+1);
		} while (randomNumber == 12);
		
		return randomNumber;
	}
}
