package com.bilgeadam.lesson030;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

	public static void main(String[] args) {
		System.out.println("Client started");

		String hostName = "localhost"; // 127.0.0.1
		int    port     = 4711; // 0 - 65535
		
		try (Socket socket = new Socket(hostName, port);){
			
		}
		catch (UnknownHostException ex) {
			ex.printStackTrace();
		}
		catch (IOException ex) {
			ex.printStackTrace();
		}
		System.out.println("Client stopped");
	}
}
