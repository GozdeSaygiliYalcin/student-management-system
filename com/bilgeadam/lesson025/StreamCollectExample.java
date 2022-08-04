package com.bilgeadam.lesson025;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamCollectExample {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(17);
		list.add(9);
		list.add(1);
		list.add(0);
		list.add(-3);
		
		list.stream().forEach(System.out::println);

		List<Integer> list2 = new ArrayList<>();
		list2.add(85);
		list2.add(26);
		list2.add(999);
		list2.add(10);
		list2.add(20);
		list2.add(48);

		Stream<Integer> finalStream;
//		finalStream.collect(() -> new ArrayList<>(), (list, s) ->  )
		
	}

}
