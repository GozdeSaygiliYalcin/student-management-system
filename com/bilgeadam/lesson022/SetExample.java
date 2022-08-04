package com.bilgeadam.lesson022;

import java.util.HashSet;
import java.util.TreeSet;

@SuppressWarnings({"unchecked", "rawtypes"})
public class SetExample {
	public static void main(String[] args) {
		TreeSet trs = new TreeSet();
		trs.add("Elma");
		trs.add("Armut");
		trs.add("Karpuz");
		for (Object object : trs) {
			String str = (String)object;
			System.out.println(str);
		}
		System.out.println();
		HashSet hs = new HashSet();
		hs.add("Elma");
		hs.add("Armut");
		hs.add("Karpuz");
		hs.remove("Armut");
		for (Object object : hs) {
			String str = (String)object;
			System.out.println(str);
		}

		System.out.println();
		int[] integers = {2, 5, 8, 67, 7687, 5, 8, 34, 98, 1};
		TreeSet ts = new TreeSet();
		
		for (int i : integers) {
			ts.add(i);
		}
		
		for (Object object : ts) {
			int num = (Integer)object;
			System.out.println(num);
		}
	}
}
