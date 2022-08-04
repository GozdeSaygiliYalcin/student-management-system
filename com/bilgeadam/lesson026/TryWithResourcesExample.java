package com.bilgeadam.lesson026;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourcesExample {

	public static void main(String[] args) {
		// File myFile = new File(".\\mektup.txt"); // göreceli/relative erişim. Programın çalıştığı yerden okuyor
		File myFile = new File("C:\\Users\\babur.somer\\boost-02-workspace\\Java Boost Course 02\\src\\com\\bilgeadam\\lesson026\\mektup.txt");
		if (!myFile.exists()) {
			System.err.println("Dosya yok");
			System.exit(0);
		}

		try (FileReader fileReader = new FileReader(myFile); BufferedReader reader = new BufferedReader(fileReader);) {
			while (true) {
				String line = reader.readLine();
				if (line == null) {
					break;
				}
				else {
					System.out.println("==> " + line);
				}
			}
		}
		catch (FileNotFoundException ex) {
			ex.printStackTrace();
		}
		catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}
