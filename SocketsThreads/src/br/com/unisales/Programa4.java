package br.com.unisales;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class Programa4 {

	public static void main(String[] args) {
		try {
			Socket cliente = new Socket("localhost", 8080);
			PrintWriter out = new PrintWriter(cliente.getOutputStream(), true);
			out.println("ola mundo na 8080");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	}
}
