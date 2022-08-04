package com.bilgeadam.lesson026;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;

public class ReadDataExample {

	public static void main(String[] args) {
		File inputFile = new File("C:\\Users\\babur.somer\\OneDrive - BilgeAdam\\Boost\\26 - File Examples\\values.dat");
		try (DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream(inputFile)));) {
			System.out.println(in.readDouble());
			System.out.println(in.readDouble());
			System.out.println(in.readDouble());
			System.out.println(in.readDouble());
			System.out.println(in.readDouble());
			System.out.println(in.readDouble());
			System.out.println(in.readDouble());
			System.out.println(in.readDouble());
//			while (true) {
//				double value = in.readDouble();
//				System.out.println(value);
//			}
 		}
		catch (Exception e) {
			System.err.println("Something went wrong. Cause: " + e.getMessage());
		}
	}

}
