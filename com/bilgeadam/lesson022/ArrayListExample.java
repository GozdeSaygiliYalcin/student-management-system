package com.bilgeadam.lesson022;

import java.util.ArrayList;

public class ArrayListExample {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		ArrayList arrayList = new ArrayList();
		arrayList.add("Elma");
		arrayList.add("Armut");
		arrayList.add(0, "Muz");
		arrayList.add(2, "Çilek");
		arrayList.add(2, "x");
		for (Object object : arrayList) {
			String str = (String)object;
			System.out.println(str);
		}
		
		Object[] objs = arrayList.toArray();
		System.out.println(objs[2]);
	}

}
