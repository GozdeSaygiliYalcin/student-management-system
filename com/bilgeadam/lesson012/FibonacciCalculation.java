package com.bilgeadam.lesson012;

public class FibonacciCalculation {

	public static void main(String[] args) {
		int number = 40;
		long start = System.nanoTime();
		double fib = calculateClassicalFibonacci(number);
		long stop = System.nanoTime();
		System.out.println(number + ". fibonacci sayısı: " + fib + " in " + (stop-start) + " nanoseconds");

		start = System.nanoTime();
		fib = calculateRecursiveFibonacci(number);
		stop = System.nanoTime();
		System.out.println(number + ". fibonacci sayısı: " + fib + " in " + (stop-start) + " nanoseconds");

		start = System.nanoTime();
		fib = calculateExplicitFibonacci(number);
		stop = System.nanoTime();
		System.out.println(number + ". fibonacci sayısı: " + fib + " in " + (stop-start) + " nanoseconds");
	}

	private static double calculateExplicitFibonacci(int number) {
		double sqrtOfFive = Math.sqrt(5);
		return (1 / sqrtOfFive) * (Math.pow(((1 + sqrtOfFive)/2), number) - Math.pow(((1 - sqrtOfFive)/2), number));
	}
	private static double calculateRecursiveFibonacci(int number) {
		if (number == 1 || number == 2) {
			return 1;
		}
		else {
			return calculateRecursiveFibonacci(number - 1) + calculateRecursiveFibonacci(number - 2);
		}
	}

	private static double calculateClassicalFibonacci(int number) {
		long n1 = 0;
		long n2 = 1;
		long nth = 0;
		
		for (int i = 1; i < number; ++i) {
			nth = n1 + n2;
			n1 = n2;
			n2 = nth;
		}
		return nth;
	}
}
