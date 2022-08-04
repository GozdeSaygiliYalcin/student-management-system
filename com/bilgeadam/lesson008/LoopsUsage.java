package com.bilgeadam.lesson008;

public class LoopsUsage {

	public static void main(String[] args) {
		int i = 1;
		while (i <= 10) {
			System.out.println(i++ + ". defa merhaba");
//			i++;
		}

		int j = 0;
		do {
			System.out.println(++j + ". defa merhabalar");
//			j++;
		} while (j < 10);

		for (int k=0; k<10; k++) {
			System.out.println((k + 1) + ". defa yine merhaba");
		}
		
		while (true) {
			System.out.println("çıkarın beni buradan");
		}
//		System.out.println("bye bye");
	}

}
