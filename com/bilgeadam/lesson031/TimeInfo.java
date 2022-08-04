package com.bilgeadam.lesson031;

import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.time.LocalDateTime;

public class TimeInfo implements Runnable{
	private Socket socket;

	public TimeInfo(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {
		System.out.println("Yeni istemci bağlantısı <<<" + socket.getPort() + ">>> üzerinden oluşturuldu.");
		try (OutputStream os = socket.getOutputStream();) {
			PrintWriter sender = new PrintWriter(os, true); // otomatik gönderim
			for (int i = 0; i < 10; i++) {
				sender.println(LocalDateTime.now());
				Thread.sleep(3000);
			}
		}
		catch (Exception ex) {
			System.err.println("Bir hata oluştu: " + ex.getMessage());
		}
	}
}
