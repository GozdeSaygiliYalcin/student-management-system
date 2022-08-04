package com.bilgeadam.lesson022;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Queue;

import com.bilgeadam.lesson011.Person;

public class HashExample {

	@SuppressWarnings({"unchecked", "rawtypes"})
	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put(1, "Elma");
		hm.put(2, "Armut");
		hm.put(5, "Elma");
		
		Iterator valueIter = hm.values().iterator();
		while (valueIter.hasNext()) {
			String str = (String)valueIter.next();
			System.out.println(str);
		}
		 
		Iterator keyIter = hm.keySet().iterator();
		while (keyIter.hasNext()) {
			int str = (Integer)keyIter.next();
			System.out.println(str);
		}
		
		System.out.println(hm.get(5));
		
		
		Hashtable ht = new Hashtable();
		ht.put(1, "karpuz");
		ht.get(1);
		
		Person p = new Person();
		p.age = 32;
		p.name = "Ali";
		p.salary = 43.5;
		
		ht.put(88, p);
		System.out.println(((Person)ht.get(88)).name);
		
	
	}

}
