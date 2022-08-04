package com.bilgeadam.lesson021;

public class EnhancedForTest {

	public static void main(String[] args) {
		int[] ints = {2, 45, 5, 67, 66, 34, 9};
		for (int i : ints) {
			System.out.println(i);
			i += 2;
			System.out.println(i);
		}
		
		for (int i=0; i < ints.length; i++) {
			ints[i] += 2;
		}

		for (int i : ints) {
			System.out.println(i);
		}
		
		
	}

}
