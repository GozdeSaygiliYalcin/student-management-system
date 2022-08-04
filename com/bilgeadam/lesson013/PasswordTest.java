package com.bilgeadam.lesson013;

public class PasswordTest {

	public static void main(String[] args) {
		Password password = new Password();
		
		if (password.assign("", "Qwerty")) {
			System.out.println("Yeni şifre oluşturuldu");
		}
		else {
			System.err.println("Şifre oluşturmada hata oluştu");
		}
		
		if (password.assign("", "dyfıus")) {
			System.out.println("Yeni şifre oluşturuldu");
		}
		else {
			System.err.println("Şifre oluşturmada hata oluştu");
		}

		if (password.assign("Qwerty", "Dyfıus")) {
			System.out.println("Yeni şifre oluşturuldu");
		}
		else {
			System.err.println("Şifre oluşturmada hata oluştu");
		}
	}

}
