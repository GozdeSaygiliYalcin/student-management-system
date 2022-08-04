package com.bilgeadam.lesson022;

import java.util.Arrays;
import java.util.LinkedList;

import com.bilgeadam.lesson021.Chess;

public class LinkedListExample {
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		linkedList.add("Elma");
		linkedList.add("Armut");
		linkedList.add("Muz");
		linkedList.add("Çilek");
		linkedList.add(1);
		Chess chess = new Chess();
		linkedList.add(chess);

		linkedList.add(3, "Karpuz");
		for (Object object : linkedList) {
			if (object instanceof String) {
				String str = (String)object;
				System.out.println(str);
			}
			else if (object instanceof Integer) {
				int i = (Integer)object;
				System.out.println(++i);
			}
			else if (object instanceof Chess) {
				Chess chss = (Chess)object;
				System.out.println(chss);
			}
		}
		
		Object[] objs = linkedList.toArray();
		System.out.println(Arrays.toString(objs));
		
		if (linkedList.contains(chess)) {
			System.out.println("Santraç tahtası listede");
		}
		else {
			System.out.println("Santraç tahtası listede değil");
		}
		linkedList.remove(chess);
		if (linkedList.contains(chess)) {
			System.out.println("Santraç tahtası listede");
		}
		else {
			System.out.println("Santraç tahtası listede değil");
		}
	}
}
