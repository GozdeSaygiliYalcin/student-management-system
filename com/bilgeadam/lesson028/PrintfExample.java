package com.bilgeadam.lesson028;

public class PrintfExample {
/*
 * System.out.printf ile Java String format() aynı şekilde çalışır
 * 
 * https://www.javatpoint.com/java-string-format
 */
	public static void main(String[] args) {
		int i = 10;
		
		System.out.printf("Normal tam sayı                   : %d,\n", i);
		System.out.printf("10 haneli yazım sağ taraf tam sayı: %10d,\n", i);
		System.out.printf("10 haneli yazım sol taraf tam sayı: %-10d,\n", i);
		System.out.printf("10 haneli başında 0'lı tam sayı   : %010d,\n", i);
		
		String str = "Kolay gelsin";
		System.out.printf("Normal string                   : %s,\n", str);
		System.out.printf("20 haneli yazım sağ taraf string: %20s,\n", str);
		System.out.printf("20 haneli yazım sol taraf string: %-20s,\n", str);
		
		String formatted = String.format("\nNormal string                   : %s,", str);
		System.out.println(formatted);
		formatted = String.format("20 haneli yazım sağ taraf string: %20s,", str);
		System.out.println(formatted);
		formatted = String.format("20 haneli yazım sol taraf string: %-20s,", str);
		System.out.println(formatted);
	}
}
