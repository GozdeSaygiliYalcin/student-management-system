package com.bilgeadam.lesson037.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import com.bilgeadam.lesson037.client.common.Commons;


public class TranslatorClient {

	public static void main(String[] args) {
		com.bilgeadam.boost.utilites.BAUtil.header("Tercüman istemcisi");

		if (args.length != 2) {
			System.err.println("Yetersiz argüman sayısı. Program sonlandırılıyor");
			System.exit(-10);
		}
		Commons.getInstance().setArguments(args[0], args[1]);

		TranslatorClient client = new TranslatorClient();
		client.translate();

		com.bilgeadam.boost.utilites.BAUtil.footer();
	}

	private void translate() {
		try (Socket socket = new Socket(Commons.getInstance().getServerAddress(), Commons.getInstance().getPort())) {

			InputStream    is     = socket.getInputStream();
			BufferedReader reader = new BufferedReader(new InputStreamReader(is));

			OutputStream os     = socket.getOutputStream();
			PrintWriter  sender = new PrintWriter(os, true);

			String phrase     = null;
			String targetLang = null;

			while (true) {
				phrase = com.bilgeadam.boost.utilites.BAUtil.readString("Tercüme etmek istediğiniz kelime (bitirmek için ÇIK)");
				if (phrase.equalsIgnoreCase("çık")) {
					break;
				}
				targetLang = com.bilgeadam.boost.utilites.BAUtil.readString("Tercüme etmek istediğiniz dil (EN/DE/JP)");
				
				sender.println(phrase + "|" + targetLang);
				
				String line = reader.readLine();
				System.out.println(phrase + " kelimesinin " + targetLang + " karşılığı " + line + "'dır");
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
