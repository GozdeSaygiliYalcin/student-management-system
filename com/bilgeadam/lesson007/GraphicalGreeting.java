package com.bilgeadam.lesson007;

import javax.swing.JOptionPane;

public class GraphicalGreeting {
	
	public void hello() {
		JOptionPane.showMessageDialog(null, "Merhaba Java Sınıfı", "Selamlama", JOptionPane.INFORMATION_MESSAGE);
	}

	public void bye() {
		JOptionPane.showMessageDialog(null, "Elveda Java Sınıfı", "Selamlama", JOptionPane.WARNING_MESSAGE);
	}
}
