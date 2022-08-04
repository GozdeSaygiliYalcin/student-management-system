package com.bilgeadam.lesson023;

public class CacheAny<Z> {
	private Z element;
	
	public void add(Z  any) {
		this.element = any;
	}
	
	public Z get() {
		return this.element;
	}
}
