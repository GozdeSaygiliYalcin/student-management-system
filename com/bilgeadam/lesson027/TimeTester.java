package com.bilgeadam.lesson027;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class TimeTester {

	public static void main(String[] args) {
		System.out.println("Yerel zaman                       :" + LocalTime.now());
		System.out.println("Yerel tarih                       :" + LocalDate.now());
		System.out.println("Yerel tarih ve zaman              :" + LocalDateTime.now());
		System.out.println("Saat dilimli yerel tarih ve zaman :" + ZonedDateTime.now());
		System.out.println("Saat dilimli yerel tarih ve zaman :" + ZonedDateTime.now(ZoneId.of("America/New_York")));
		System.out.println("Ofsetli zaman                     :" + OffsetTime.now());
		System.out.println("Ofsetli tarif zaman               :" + OffsetDateTime.now());
		System.out.println("Ay ve gün                         :" + MonthDay.now());
		System.out.println("Yıl ve ay                         :" + YearMonth.now());
		System.out.println("An                                :" + Instant.now());
		
		LocalDate lD = LocalDate.of(2022, 12, 19);
		System.out.println(lD);
		lD = LocalDate.parse("2021-11-20");
		System.out.println(lD);
		
		LocalDateTime lDT = LocalDateTime.parse("2011-05-25T15:45");
		System.out.println(lDT);
		
		lD = LocalDate.parse("2021-12-20");
		System.out.println("Dün           :" + lD.minusDays(1));
		System.out.println("Bugün         :" + lD);
		System.out.println("Yarın         :" + lD.plusDays(1));
		System.out.println("Gelecek hafta :" + lD.plusWeeks(1));
		System.out.println("Gelecek ay    :" + lD.plusMonths(1));
		System.out.println("Gelecek yıl   :" + lD.plusYears(1));
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM YYYY - HH:mm.s, DDD");
		System.out.println(lDT.format(formatter));
	}

}
