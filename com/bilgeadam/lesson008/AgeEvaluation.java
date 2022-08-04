package com.bilgeadam.lesson008;

import java.util.Scanner;

public class AgeEvaluation {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int age = scanner.nextInt();
		scanner.close();

		if (age < 18) {
			System.out.println("Çocuk");
		} else if (age >= 18 && age < 30) {
			System.out.println("Genç");
		} else if (age >= 30 && age < 50) {
			System.out.println("Orta yaşlı");
		} else {
			System.out.println("Yaşlı");
		}

		if (age < 18) {
			System.out.println("Çocuk");
		} else {
			if (age >= 18 && age < 30) {
				System.out.println("Genç");
			} else {
				if (age >= 30 && age < 50) {
					System.out.println("Orta yaşlı");
				} else {
					System.out.println("Yaşlı");
				}
			}
		}
	}
}
