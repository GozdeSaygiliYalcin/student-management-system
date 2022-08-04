package com.bilgeadam.lesson029;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class LocaleExample {

	public static void main(String[] args) {
		// Locale[] locales = Locale.getAvailableLocales();
		// for (Locale locale : locales) {
		// System.out.println(locale);
		// }

		System.out.println(Locale.getDefault());
		Locale.setDefault(new Locale("tr", "TR"));
		System.out.println(Locale.getDefault());

		Locale[] numberFormatlocales = NumberFormat.getAvailableLocales();
		for (Locale locale : numberFormatlocales) {
			System.out.println(locale);
		}
		System.out.println("000000000000000000");
		Locale[] dateFormatlocales = DateFormat.getAvailableLocales();
		for (Locale locale : dateFormatlocales) {
			System.out.println(locale);
		}

	}

}
