package br.com.unisales;

import java.util.Scanner;

public class Programa5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//		String ipTarget = args[0];
//		int portTarget = Integer.parseInt(args[1]);
//		int portTo = Integer.parseInt(args[2]);
//		System.out.println("meu ip = " +ipTarget);
//		System.out.println("meu portTarget = " +portTarget);
//		System.out.println("meu portTo = " +portTo);
	
		System.out.println("Este executa segundo");
		MyThread mythread = new MyThread();
		mythread.start();
		
	    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter username");

	    String userName = myObj.nextLine();  // Read user input
	    System.out.println("Username is: " + userName);  // Output user input
	}



}
