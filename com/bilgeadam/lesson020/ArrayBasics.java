package com.bilgeadam.lesson020;

public class ArrayBasics {

	public static void main(String[] args) {
		String[] weekDays = { "Pazartesi", "Salı", "Çarşamba", "Perşembe", "Cuma", "Cumartesi", "Pazar" };

		int dayOfWeek = 4;
		System.out.println("Haftanın " + dayOfWeek + " günü " + weekDays[dayOfWeek - 1] + "dir"); // hep 0'dan
																									// başlandığı için

		System.out.println("Haftanın günleri:");
		for (int i = 0; i < weekDays.length; i++) {
			System.out.println((i + 1) + ". gün: " + weekDays[i]);
		}

		System.out.println("Haftanın günleri tersten:");
		for (int i = weekDays.length - 1; i >= 0; i--) {  // length içindeki öğe sayısını veriyor. Max index herzaman length-1
			System.out.println((i + 1) + ". gün: " + weekDays[i]);
		}

		System.out.println("Haftanın günleri (2-şer):");
		for (int i = 0; i < weekDays.length; i=i+2 ) {
			System.out.println((i + 1) + ". gün: " + weekDays[i]);
		}

		for (;;) {  // sonsuz döngü ==> while(true)
			break;
		}
		
		int i=0;
		for(;i > 10;) {
			i = i+1;
//			if (i > 10)
//				break;
		}
		System.out.println("bye");
	}

}
