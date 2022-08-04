package com.bilgeadam.lesson013;

public class Person {
	private static int numOfPersons = 0; // Class/Sınıf değişkeni

	/*
	 * Nesne/Instance değişkenleri (nesne öznitelikleri)
	 */
	private String firstName;
	private String lastName;
	private int age;

	public static void main(String[] args) {
		Person person = new Person();
		
		System.out.println(person.toString()); 	// sınıf ve örnek değişkenlerine Java otomatik olarak ilk değer atar
												// sayı türleri 0, boolean türü false ve diğerleri null şeklinde
		
		person.age = 12;
		person.firstName = "Hüdaverdi";
		person.lastName = "Cengaver";
		Person.numOfPersons++;
		System.out.println(person.toString());

		int daysLived; // yerel/local değişken
//		System.out.println(daysLived);  ==> yerel değişlenlere her zaman kullnılmadan önce bir ilk değer atamak gerekir
		
		daysLived = person.age * 365; 
		System.out.println("Number of persons created " + Person.numOfPersons);

	}

	private String getFullName() {
		String fullName = Person.numOfPersons + " - " + this.firstName + " " + this.lastName; // yerel/local değişken
		return fullName;
	}

	@Override
	public String toString() {
		return "Person [firstName=" + this.firstName + ", lastName=" + lastName + ", age=" + age + "]";
	}

}
