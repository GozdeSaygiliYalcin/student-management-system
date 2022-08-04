package com.bilgeadam.lesson030;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDateTime;

public class TimeServer {
	private int port;

	public static void main(String[] args) {
		
		TimeServer server = new TimeServer();
		
		if (args.length >= 1) {
			server.port = Integer.parseInt(args[0]);
		}
		else {
			System.err.println("Lütfen sunucu için bir port numarası tanımlayın!");
			System.exit(-10);
		}
		
		server.serve();
	}

	private void serve() {
		
		try  (ServerSocket serverSocket = new ServerSocket(this.port);) {
			System.out.println(this.port + " portu üzerinden  sunucu yeni bağlantıları kabul etmeye hazır");
			
			while (true) {
				Socket socket = serverSocket.accept(); // yeni client bağlantı isteği bekleniyor
				System.out.println("Yeni istemci bağlantısı <<<" + socket.getPort() + ">>> üzerinden oluşturuldu.");
				
				OutputStream os = socket.getOutputStream();
//				BufferedWriter bf = new BufferedWriter(new OutputStreamWriter(os));
				PrintWriter sender = new PrintWriter(os, true);  // otomatik gönderim
				for (int i=0; i < 10; i++) {
					sender.println(LocalDateTime.now());
					Thread.sleep(3000);
				}
			}
		}
		catch (IOException | InterruptedException ex) {
			ex.printStackTrace();
		}
	}
}
