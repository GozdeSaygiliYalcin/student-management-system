package com.bilgeadam.lesson030;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {
		System.out.println("Server started");
		int    port     = 4711;
		
		try (ServerSocket server = new ServerSocket(port);) {
			Socket socket = server.accept();   // bu satırda bir bağlantı isteği gelinceye dek bekliyor
			System.out.println(socket.getPort() + " portuna bağlantı kuruldu...");
		}
		catch (IOException ex) {
			ex.printStackTrace();
		}

		System.out.println("Server stopped");
	}

}
