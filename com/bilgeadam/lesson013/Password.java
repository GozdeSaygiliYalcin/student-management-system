package com.bilgeadam.lesson013;

public class Password {
	private String password;
	
	public Password () {		// constructor (yapıcı) method
		super();				// hiyerarşide bir üst sınıfın method veya özniteliklerine erişmek için
								// burada aynı imzaya sahip yapıcı methodu çağırıyor
		this.password = "";		// "bu" sınıfın password isimli niteliğine erişmek için
	}
	
	boolean check (String password) {
		return password.equals(this.password);
	}
	
	public boolean assign (String oldPassword, String newPassword) {
		boolean isSuccsessful = false;
		
		if (newPassword != null) {
			if (this.check(oldPassword) && this.checkSyntax(newPassword)) {
				isSuccsessful = true;
				this.password = newPassword;
			}
		}
		
		return isSuccsessful;
		
	}
	
	private boolean checkSyntax(String password) {
		boolean isCorrect = false;
		
		char first = password.toLowerCase().charAt(0);  // password'u küçük harflere çevirip (=toLowercase()) ilk karakter'i (charAt(0)) bir değişkene atadık
		isCorrect = (first != password.charAt(0));		// password'un ilk karakteri ile first'ü karşılaştırdım. Eğer birbirine eşit ise o zaman password küçük
														// harfle başlıyor demektir ve kontrolü geçmiyor anlamına gelir
		
		return isCorrect;
	}
}
