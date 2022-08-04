package com.bilgeadam.lesson024;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {
		// birinci yol
		String[]     customerArray = { "Müşteri 1", "Müşteri 2", "Müşteri 3", "Müşteri 4", "Müşteri 5", "Müşteri 6",
				"Müşteri 7" };
		List<String> customers     = Arrays.asList(customerArray);

		// ikinci yol
		List<String> list = Arrays.asList("Müşteri 1", "Müşteri 2", "Müşteri 3", "Müşteri 4", "Müşteri 5", "Müşteri 6",
				"Müşteri 7");

		// üçüncü yol
		List<String> customerList = new ArrayList<>();
		customerList.add("Müşteri 1");
		customerList.add("Müşteri 2");
		customerList.add("Müşteri 3");
		customerList.add("Müşteri 4");
		customerList.add("Müşteri 5");

		Stream<String> stream   = list.stream();
		Stream<String> parallel = list.parallelStream();
		
		stream.forEach(s -> System.out.println("Stream: " + s + " - " + Thread.currentThread()));
		System.out.println("============");
		parallel.forEach(s -> System.out.println("Parallel: " + s + " - " + Thread.currentThread()));
	}

}
