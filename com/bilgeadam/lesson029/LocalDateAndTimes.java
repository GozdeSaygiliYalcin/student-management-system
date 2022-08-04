package com.bilgeadam.lesson029;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class LocalDateAndTimes {

	public static void main(String[] args) {

		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime);

		String datePattern = "dd-MMMM-yy, EEEE";
		String timePattern = "HH:mm.ss";
		String fullPattern = "dd-MMMM-yyyy HH:mm.ss.SSS";

		Locale.setDefault(Locale.ENGLISH);
		DateTimeFormatter defaultFormatter = DateTimeFormatter.ofPattern(datePattern);
		System.out.println(defaultFormatter.format(dateTime));

		DateTimeFormatter trFormatter = DateTimeFormatter.ofPattern(datePattern, new Locale("tr"));
		System.out.println(trFormatter.format(dateTime));
	}
}