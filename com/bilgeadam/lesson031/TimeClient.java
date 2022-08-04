package com.bilgeadam.lesson031;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class TimeClient {
	private String host;
	private int    port;

	public static void main(String[] args) {

		TimeClient client = new TimeClient();
		if (args.length == 2) {
			client.host = args[0];
			client.port = Integer.parseInt(args[1]);
		}
		else {
			client.host = "localhost";
			client.port = 4711;
			System.out.println("Bağlanılacak server'ın ip adresi ve port numarasını girilmedi! "
					+ "varsayılan değerler kullanılcak: host="+client.host + " port=" + client.port);
		}

		client.process();
	}

	private void process() {

		try (Socket socket = new Socket(this.host, this.port)) {
			InputStream    is     = socket.getInputStream();
			BufferedReader reader = new BufferedReader(new InputStreamReader(is));
			int i = 1;
			while (true) {
				String line = reader.readLine();
				System.out.println((i++) + " - " +line);
				if (i == 11) // 1'den başladığımız için
					break;
			}
		}
		catch (UnknownHostException ex) {
			ex.printStackTrace();
		}
		catch (IOException ex) {
			ex.printStackTrace();
		}

	}

}
