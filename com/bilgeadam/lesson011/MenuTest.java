package com.bilgeadam.lesson011;

import java.util.Scanner;

public class MenuTest {

	public static void main(String[] args) {
		
		System.out.println("Hoş geldiniz");
		Scanner scanner = new Scanner(System.in);

		int number = 0;
		do {
			System.out.print("Lütfen bir sayı giriniz!");
			
			String str = scanner.nextLine();
			
			System.out.println(str);
			if (str != null && !str.isEmpty() && !str.isBlank()) {
				number = Integer.parseInt(str);
			}
			
		} while (number != 99);
		
		scanner.close();
		System.out.println("bye bye");

	}

}
