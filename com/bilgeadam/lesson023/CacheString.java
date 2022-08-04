package com.bilgeadam.lesson023;

public class CacheString {
	private String message;
	
	public void add(String message) {
		this.message = message;
	}
	
	public String get() {
		return this.message;
	}
}
