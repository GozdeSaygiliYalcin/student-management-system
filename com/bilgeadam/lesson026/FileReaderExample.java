package com.bilgeadam.lesson026;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {

	public static void main(String[] args) {
		// File myFile = new File(".\\mektup.txt"); // göreceli/relative erişim. Programın çalıştığı yerden okuyor
		File myFile = new File(
				"C:\\Users\\babur.somer\\boost-02-workspace\\Java Boost Course 02\\src\\com\\bilgeadam\\lesson026\\mektup.txt");
		if (!myFile.exists()) {
			System.err.println("Dosya yok");
			System.exit(0);
		}

		FileReader fileReader = null;
		BufferedReader reader = null;
		try {
			fileReader = new FileReader(myFile); // dosyayı okumak için bir katman oluşturdum
			reader     = new BufferedReader(fileReader); // dosyayı daha hızlı okumak için bir ceket daha giydirdik
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
		finally {
			if (fileReader != null) {
				try {
					fileReader.close();
				}
				catch (IOException ex) {
					ex.printStackTrace();
				}
			}
			if (reader != null) {
				try {
					reader.close();
				}
				catch (IOException ex) {
					ex.printStackTrace();
				}
			}

		}

	}

}
