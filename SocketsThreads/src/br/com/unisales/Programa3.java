package br.com.unisales;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Programa3 {
	private static String extractStr(InputStream is) throws IOException {
		InputStreamReader ir = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(ir);
		String str = br.readLine();
		return str;
	}
	public static void main(String[] args) {
		try {
			System.out.println("Ativa a porta 8081");
			ServerSocket socket = new ServerSocket(8081);
			int i = 3;
			do {
				System.out.println("reservou a porta");
				Socket ret = socket.accept();
				InputStream msg = ret.getInputStream();
				System.out.println(extractStr(msg));
				System.out.println("passei com louvor");
				i--;
			} while (i > 0);
			System.out.println("Terminou o programa que recebe");
		} catch (IOException e) {
			System.out.println("se voce viu esse erro errou!");
			e.printStackTrace();
		}
	}

}
