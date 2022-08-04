package com.bilgeadam.lesson011;

public class NonPrimitiveTypes {

	public static void main(String[] args) {
		Person ali = new Person();    // önce bir ali kişisi oluşturduk ve özelliklerini belirledik
		ali.name = "Ali";
		ali.age = 20;
		ali.salary = 35.5d;

		Person veli = new Person(); // sonra bir veli kişisi oluşturduk
		veli.name = "Veli";			//  ve özelliklerini belirledik
		veli.age = 26;
		veli.salary = 39.99d;
		
		System.out.println("Ali's name:  " + ali.name + "  Ali's reference (memory adress):  " + ali); // ali ve veli'nin isimleri 
		System.out.println("Veli's name: " + veli.name + " Veli's reference (memory adress): " + veli);// ve referans adreslerini ekranda gösterdik
		
		Person ayse = null;			// yeni bir ayşe nesnesi kullanacağımızı söyledik (beim ayse adında bir kişi'm olacak)
		System.out.println("Ayşe's reference: " + ayse);  // ayşe'nin hiç bir özellik alacak durumu yok. Çünki ayşe nesnesi yok
		
		ayse = ali;  // ayse ve ali'nin aynı kişi olduğunu söyledik. 
		
		if (ayse == ali) {
			System.err.println("Ayşe ve Ali özdeştir");
		}
		else {
			System.err.println("Ayşe ve Ali özdeş değildir");
		}
		System.out.println("Ali's name:  " + ali.name + "  Ali's reference (memory adress):  " + ali);  // ikisinin adresleri aynı
		System.out.println("Veli's name: " + veli.name + " Veli's reference (memory adress): " + veli);
		System.out.println("Ayşe's name: " + ayse.name + " Ayşe's reference (memory adress): " + ayse);

		ayse.name = "Ayşe";  // Ayşe veya ali'de yapılan tüm değişiklikler her ikisinde de olur.
		System.out.println("Ali's name:  " + ali.name + "  Ali's reference (memory adress):  " + ali);
		System.out.println("Veli's name: " + veli.name + " Veli's reference (memory adress): " + veli);
		System.out.println("Ayşe's name: " + ayse.name + " Ayşe's reference (memory adress): " + ayse);

		ayse = new Person();  // ayse değişkenine yeni bir kişi nesnesi atadık. ==> ali ile ayşe'nin adresleri farklı hale geldi
		
		ayse.age = 27;    // artık ayşe'de yapılan değişiklikler sadece ayşe'ye özel, ali'yi etkilemiyor
		ayse.salary = 55d;
		if (ayse == ali) {
			System.err.println("Ayşe ve Ali özdeştir");
		}
		else {
			System.err.println("Ayşe ve Ali özdeş değildir");
		}

		System.out.println("Ali's name:  " + ali.name + "  Ali's reference (memory adress):  " + ali);
		System.out.println("Veli's name: " + veli.name + " Veli's reference (memory adress): " + veli);
		System.out.println("Ayşe's name: " + ayse.name + " Ayşe's reference (memory adress): " + ayse);

		System.out.println();
		Person fatma = new Person();  // eğer ayşe ile aynı özelliklere sahip farklı bir kişi daha oluşturmak istersek
		fatma.name = ayse.name;		// new ile yeni kişi oluşturup her öznitelik ayrı ayrı birbvirine atanır
		fatma.age = ayse.age;
		fatma.salary = ayse.salary;    // ayşe ile fatmanın içerikleri aynı ama adresleri farklı
		System.out.println("Ayşe's age: " + ayse.age + " Ayşe's reference (memory adress): " + ayse);
		System.out.println("Fatma's age: " + fatma.age + " Fatma's reference (memory adress): " + fatma);

		fatma.age = 44;  // onun için fatmadaki değişiklik ayşeyi etkilemez
		System.out.println("Ayşe's age: " + ayse.age + " Ayşe's reference (memory adress): " + ayse);
		System.out.println("Fatma's age: " + fatma.age + " Fatma's reference (memory adress): " + fatma);
		
	}

}
