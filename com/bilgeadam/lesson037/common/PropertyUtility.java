package com.bilgeadam.lesson037.common;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyUtility {
	public static Properties readProperties(String fileName) {
		Properties props = new Properties();
		
		try (InputStream is = new FileInputStream(fileName);) {
			props.load(is);
		}
		catch (FileNotFoundException ex) {
			ex.printStackTrace();
		}
		catch (IOException ex) {
			ex.printStackTrace();
		}
		
		return props;
	}
}
