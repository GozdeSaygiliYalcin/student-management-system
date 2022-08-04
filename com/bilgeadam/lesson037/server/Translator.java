package com.bilgeadam.lesson037.server;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.StringTokenizer;

import com.bilgeadam.lesson037.server.common.Commons;

public class Translator implements Runnable {
	private Socket socket;

	public Translator(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {
		System.out.println("Yeni istemci bağlantısı <<<" + socket.getPort() + ">>> üzerinden oluşturuldu.");
		try (OutputStream os = socket.getOutputStream(); InputStream is = socket.getInputStream();) {

			PrintWriter    sender = new PrintWriter(os, true);
			BufferedReader reader = new BufferedReader(new InputStreamReader(is));

			while (true) {
				String text = reader.readLine();
				if (text != null) {
					System.out.println(text);
					StringTokenizer tokenizer       = new StringTokenizer(text, "|");
					String          textToTranslate = tokenizer.nextToken();
					String          targetLanguage  = tokenizer.nextToken();

					sender.println(Commons.getInstance().translate(textToTranslate, targetLanguage));
				}
			}
		}
		catch (Exception ex) {
			System.err.println("Bir hata oluştu: " + ex.getMessage());
		}
	}

}
