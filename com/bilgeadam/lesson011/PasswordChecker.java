package com.bilgeadam.lesson011;

import java.util.Scanner;

public class PasswordChecker {

	public static void main(String[] args) {
		String password = "";
		String correctPassword = "123";
		
		System.out.println("Hoş geldiniz");
		Scanner scanner = new Scanner(System.in);

		/*
		 * ya üç defa yanlış girince ya da doğru password'ü girince döngüden çıksın
		 */
		int counter = 0;
		do {
			System.out.print("Lütfen 123 dışında bir password giriniz: ");
			password = scanner.nextLine();
			System.out.println("Girilen password :" + password);
			
			if (!password.equals(correctPassword)) {
				counter++;
			}
			
		} while (!((counter == 3) || password.equals(correctPassword)));  // duurm sağladığında çık, sağlamadığı sürece dön

			scanner.close();
			System.out.println("bye bye");

	}

}
