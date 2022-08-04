package com.bilgeadam.lesson031;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDateTime;

public class MultiThreadedTimeServer /*implements Runnable */ {
	private int    port;
	private Socket socket;

	public static void main(String[] args) {

		MultiThreadedTimeServer server = new MultiThreadedTimeServer();

		if (args.length >= 1) {
			server.port = Integer.parseInt(args[0]);
		}
		else {
			server.port = 4711;
			System.out.println("Sunucu için port numarası belirlenmedi. Varsayılan değer olarak 4711 kullanılacak!");
		}

		server.serve();
	}

	private void serve() {

		try (ServerSocket serverSocket = new ServerSocket(this.port);) {
			System.out.println(this.port + " portu üzerinden  sunucu yeni bağlantıları kabul etmeye hazır");

			while (true) {
				this.socket = serverSocket.accept(); // yeni client bağlantı isteği bekleniyor
/*
 * Sınıfın kendini thread içinde kullanması yerine başka bşr sınıf tanımlayabiliriz
				Thread thread = new Thread(this); // Main method içinde thread üretecek olsak böyle new Thread(server)
													// yazmak gerekirdi
													// burada Thread'e içinde bulunduğu sınıf ile çalış diyoruz. Yani
													// kendini kullan
 */
				TimeInfo time = new TimeInfo(this.socket);
				Thread thread = new Thread(time);
				thread.start();
			}
		}
		catch (IOException ex) {
			ex.printStackTrace();
		}
	}

	/*
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
	*/
}
