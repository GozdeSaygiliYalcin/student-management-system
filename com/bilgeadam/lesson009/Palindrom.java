package com.bilgeadam.lesson009;

import java.util.Scanner;

public class Palindrom {

	/**
	 * Kullanıcının girdiği bir kelimenin palindrom olup olmadığını 
	 * kontrol edin
	 * 
	 * String'lerin .charAt(i) metodunu kullanabilirsiniz
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen bir kelime giriniz: ");
		String palindromeCandidate = scanner.nextLine();

		palindromeCandidate = palindromeCandidate.trim();			// girilen metnin baş ve sonundaki space'leri silmek için
		int length 			= palindromeCandidate.length();			// girilen metnin uzunluğunu öğrenmek için
		palindromeCandidate = palindromeCandidate.toLowerCase();	// girilen metni tümüyle küçük harflere döndürmek için
		
		boolean isPalindrome = true;
		for (int i=0; i<=length/2; i++) {
			if (palindromeCandidate.charAt(i) != palindromeCandidate.charAt(length - i - 1)) {
				isPalindrome = false;
				break;
			}
		}
		
		/* for'lu çözüme alternatif
		int i = 0;
		while (i <= length/2) {
			if (palindromeCandidate.charAt(i) != palindromeCandidate.charAt(length - i - 1)) {
				isPalindrome = false;
				break;
			}
			i++;
		} 
		*/
		
		String result = palindromeCandidate + " bir " + (isPalindrome ? "palindromdur." : "palindrom değildir.");
		System.out.println(result);
		scanner.close();
		System.out.println("bye bye");
	}

}
