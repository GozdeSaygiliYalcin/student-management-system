package com.bilgeadam.lesson009;

import java.util.Scanner;

public class FactoriellCalculate {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input;
		double factor;
		
		while (true) {
			System.out.print("Lütfen 1 ila 95 arası bir sayı giriniz (99 -> program sonu): ");
			input = scanner.nextInt();
			System.out.println();
			if (input == 99) {
				System.out.println("Programı kullandığınız için teşekkürler");
				break;
			}
			if (input < 1 || input > 95) {
				System.err.println("Girdiğiniz sayı ile hesap yapamıyorum. Lütfen tekrarlayınız!");
				continue;
			}
			factor = 1;
			for (int i=1; i<=input; i++) {
				factor *= i;   // factor = factor * i
			}
			System.out.println(input + " sayısının faktoriyeli " + factor + " dir.");
		}
		
		scanner.close();
		System.out.println("Bye bye");

	}

}
