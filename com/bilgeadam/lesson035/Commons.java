package com.bilgeadam.lesson035;

import java.util.logging.Logger;

public class Commons {
	private static Commons instance = null; // zaten aslında null ama Babür Hoca böyle yapmayı seviyor
	private Logger logger;
	private String something;
	
	private Commons() {  // ilk adım. Sınıfın yapııc yöntemi özel olmalı. Bu şekilde başka bir yerden sınıf örneği oluşturulamaz
		super();
		this.logger = Logger.getLogger("bla bla");
		this.something = "";
	}
	
	public static Commons getInstance() {  // ikinci adım: bir statik metod üzerinden sınıf örneğine erişebilmemiz gerekli
		if (Commons.instance == null) {  // lazy initialization
			Commons.instance = new Commons();
		}
		return Commons.instance;
	}
	
	public Logger getLogger() {
		return this.logger;
	}

	public String getSomething() {
		return this.something;
	}

	public void setSomething(String something) {
		this.something = something;
	}
}
