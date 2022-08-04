package com.bilgeadam.lesson008;

import java.util.Scanner;

public class SwitchUsage {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int note = scanner.nextInt();
		scanner.close();
		
		int evaluatedNote = note/10;
		switch (evaluatedNote ) {
		case 10:
		case 9:
			System.out.println("Not: A");
			break;
		case 8:
			System.out.println("Not: B");
			break;
		case 7:
			System.out.println("Not: C");
			break;
		case 6:
			System.out.println("Not: D");
			break;
		case 5, 4, 3, 2, 1, 0:
			System.out.println("Not: F");
			break;
		default :
			System.out.println("Hatalı not girişi");
		}
		
		String harfNotu = switch (evaluatedNote ) {
				case 9, 10:
					yield "Not: A";
				case 8:
					yield "Not: B";
				case 7:
					yield "Not: C";
				case 6:
					yield "Not: D";
				case 5, 4, 3, 2, 1, 0:
					yield "Not: F";
				default :
					yield "Hatalı not girişi";
				};
		System.out.println(harfNotu);
	}
}
