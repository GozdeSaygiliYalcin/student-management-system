package com.bilgeadam.lesson029;

import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class Messages {
	private static final String BUNDLE_NAME = Messages.class.getPackageName() + ".messages"; //$NON-NLS-1$

	private static Locale         locale          = Locale.getDefault();
	private static ResourceBundle RESOURCE_BUNDLE = ResourceBundle.getBundle(BUNDLE_NAME, locale);

	private Messages() {

	}

	public static void setLocale(String language) {

		if (language == null) {
			locale = Locale.getDefault();
		}
		else {
			locale = new Locale(language);
		}
		Messages.RESOURCE_BUNDLE = ResourceBundle.getBundle(BUNDLE_NAME, locale);
	}

	public static void setLocale(String language, String country) {

		if (language == null) {
			locale = Locale.getDefault();
		}
		else {
			if (country == null) {
				locale = new Locale(language);
			}
			else {
				locale = new Locale(language, country);
			}
		}
		Messages.RESOURCE_BUNDLE = ResourceBundle.getBundle(BUNDLE_NAME, locale);
	}

	public static String getString(String key) {
		try {
			return RESOURCE_BUNDLE.getString(key);
		}
		catch (MissingResourceException e) {
			return '!' + key + '!';
		}
	}
}
