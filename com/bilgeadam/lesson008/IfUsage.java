package com.bilgeadam.lesson008;

public class IfUsage {

	public static void main(String[] args) {
		int a = 11;
		int b = 10;
		
		if (a == b) {
			System.out.println("Sayılar eşit");
		}
		System.out.println("Bir sonraki değerlendirme");
		
		if (a == b) {
			System.out.println("Sayılar eşit");
		}
		else {
			System.out.println("Sayılar eşit değil");
		}
		System.out.println("Bye bye");
		
		String output = (a > b) ? "A, B'den büyüktür" : "B, A'ya eşittir veya büyüktür";
		System.out.println(output);
	}
}
