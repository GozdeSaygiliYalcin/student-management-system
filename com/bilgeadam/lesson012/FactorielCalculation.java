package com.bilgeadam.lesson012;

public class FactorielCalculation {

	public static void main(String[] args) {
		int number = 150;
		long start = System.nanoTime();
		double fact = calculateClassicalFactoriel(number);
		long stop = System.nanoTime();
		System.out.println(number + " sayısının faktörieli: " + fact + " in " + (stop-start) + " nanoseconds");

		start = System.nanoTime();
		fact = calculateRecursiveFactoriel(number);
		stop = System.nanoTime();
		System.out.println(number + " sayısının faktörieli: " + fact + " in " + (stop-start) + " nanoseconds");
	}

	private static double calculateClassicalFactoriel(int number) {
		double fact = 1;
		
		if (number == 0 || number == 1) {
			return fact;
		}
		else {
			for (int i = 1; i<= number; i++) {
				fact *= i;
			}
		}
		return fact;
	}

	private static double calculateRecursiveFactoriel(int number) {
		if (number == 0 || number == 1) { // rekursif fonksiyondan çıkış noktam
			return 1;
		}
		else {
			return number * calculateRecursiveFactoriel(number - 1);
		}

	}
}
