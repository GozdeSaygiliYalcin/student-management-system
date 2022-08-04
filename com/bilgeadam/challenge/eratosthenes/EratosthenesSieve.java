package com.bilgeadam.challenge.eratosthenes;

import java.util.Arrays;
import java.util.stream.Stream;

public class EratosthenesSieve {

	public static void main(String[] args) {
		int       n     = 10000;  // kullanıcı girişi yerine sabit sayı verdim
		Integer[] sieve = new Integer[n + 1];
		for (int i = 1; i < sieve.length; i++) {
			sieve[i] = i;
		}

		sieve[0] = -1;
		sieve[1] = -1;
		for (int number = 2; number < n; number++) {
			for (int i = number; i < sieve.length; i++) {
				if (sieve[i] != -1) {
					if (i != number && i % number == 0) {
						sieve[i] = -1;
					}
				}
			}
		}

		Stream<Integer> result = Arrays.asList(sieve).stream();
		result.filter(x -> x >= 0)
			  .forEach(System.out::println);
	}

}
