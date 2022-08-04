package com.bilgeadam.lesson037.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import com.bilgeadam.lesson037.server.common.Commons;

public class TranslatorServer {

	public static void main(String[] args) {
		if (args.length != 1) {
			System.err.println("Yetersiz argüman sayısı. Program sonlandırılıyor");
			System.exit(-10);
		}
		Commons.getInstance().setArguments(args[0]);

		TranslatorServer server = new TranslatorServer();
		server.communicate();
	}

	private void communicate() {
		try (ServerSocket serverSocket = new ServerSocket(Commons.getInstance().getPort());) {
			System.out.println(Commons.getInstance().getPort() + " portu üzerinden  sunucu yeni bağlantıları kabul etmeye hazır");

			while (true) {
				Socket socket = serverSocket.accept(); // yeni client bağlantı isteği bekleniyor
				Translator translator = new Translator(socket);
				Thread thread = new Thread(translator);
				thread.start();
			}
		}
		catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}
