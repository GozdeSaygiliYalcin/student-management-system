package com.bilgeadam.lesson024;

public class StringCompareExample {

	public static void main(String[] args) {
		String s1 = "Mutlu";
		String s2 = "Kodlayıcılar";

		int result = s1.compareTo(s2);
		System.out.println(result);
		
		result = s2.compareTo(s1);
		System.out.println(result);
		
		result = s2.compareTo("Kodlayıcılar");
		System.out.println(result);
		
		Integer i = Integer.valueOf(5);
		System.out.println(i.compareTo(5));
	}

}
