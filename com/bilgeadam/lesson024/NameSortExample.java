package com.bilgeadam.lesson024;

import java.util.Arrays;

public class NameSortExample {
	
	
	public static void main(String[] args) {
		String[] names = {"Ali", "Veli", "Babür", "Ayşe", "Fatma", "Erşan"};
		
		System.out.println("Sıralanmamış   : " + Arrays.toString(names));
//		Arrays.sort(names, new StringLengthComparator()); // doğal sıralama dışındaki herhangi bir sıralama
		Arrays.sort(names, StringLengthComparator.COMPARATOR); // doğal sıralama dışındaki herhangi bir sıralama ==> Comparator interface
		System.out.println("Küçükten büyüğe: " + Arrays.toString(names));
		
		Arrays.sort(names);   // doğal sıralama   Comparable interface
		System.out.println("Doğal sıra     : " + Arrays.toString(names));
		
		Arrays.sort(names, StringLengthComparator.DSC); // büyükten küçüğe sıralama
		System.out.println("Büyükten küçüğe: " + Arrays.toString(names));

	}

}
