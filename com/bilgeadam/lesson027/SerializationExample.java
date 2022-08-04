package com.bilgeadam.lesson027;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;

public class SerializationExample {

	public static void main(String[] args) {
		StudentClass clazz = new StudentClass("KD-Java02", "Java Boost 2. Kurs", "Java");
		 
		clazz.addStudent(new Student(1, "Berna Baykan Dere", LocalDate.of(1997, 5, 14)));
		clazz.addStudent(new Student(2, "Can Demirhan", LocalDate.of(1994, 9, 28)));
		clazz.addStudent(new Student(3, "Cebrail Feyzullah Kaplan", LocalDate.of(1995, 5, 9)));
		
		System.out.println(clazz);
		
		try (FileOutputStream fos = new FileOutputStream("C:\\Users\\babur.somer\\OneDrive - BilgeAdam\\Boost\\26 - File Examples\\students.dat");
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			oos.writeObject(clazz);
			oos.flush();
			System.out.println("Nesne yazıldı");
		}
		catch (IOException ex) {
			System.err.println("Hata: " + ex.getMessage());
			ex.printStackTrace();
		}
		
		StudentClass deserializedClass = null;
		
		try (FileInputStream fis = new FileInputStream("C:\\Users\\babur.somer\\OneDrive - BilgeAdam\\Boost\\26 - File Examples\\students.dat");
				ObjectInputStream ois = new ObjectInputStream(fis)) {
			Object o = ois.readObject();
			
			deserializedClass = (StudentClass)o;
			
			System.out.println("Obje hali: " + o);
		}
		catch (FileNotFoundException ex) {
			ex.printStackTrace();
		}
		catch (IOException ex) {
			ex.printStackTrace();
		}
		catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		}
		
		System.out.println(deserializedClass);
	}

}
