package com.bilgeadam.lesson029;

import java.text.NumberFormat;
import java.util.Locale;

public class LocaleNumbers {

	public static void main(String[] args) {
		double d = 124_345_456.234;
		System.out.println(d);
		
		NumberFormat usNumberFormat = NumberFormat.getNumberInstance(Locale.US);
		NumberFormat trNumberFormat = NumberFormat.getNumberInstance(new Locale("tr"));
		
		System.out.println(usNumberFormat.format(d));
		System.out.println(trNumberFormat.format(d));
	}
}