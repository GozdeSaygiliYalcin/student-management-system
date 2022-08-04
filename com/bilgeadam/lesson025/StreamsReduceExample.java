package com.bilgeadam.lesson025;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamsReduceExample {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(17);
		list.add(9);
		list.add(1);
		list.add(0);
		list.add(-3);

		Stream<Integer> stream = list.stream();

//		System.out.println(stream.reduce(0, (x, y) -> x - y));
		System.out.println(stream.reduce(6, (x, y) -> x - y));
		
		List<String> strs = new ArrayList<>();
		strs.add("Bir gün");
		strs.add("okula");
		strs.add("giderken");
		strs.add("herşeye");
		strs.add("dikkat");
		strs.add("ederken");
		
		System.out.println(strs.stream().reduce("", (x, y) -> x + " " + y).trim().toUpperCase());
	}

}
