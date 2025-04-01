package br.com.unisales;

public class MyThread extends Thread {
	@Override
	public void run() {
		try {
			Thread.sleep(5000);
			for (int i = 0; i < 10; i++) {
				System.out.println("Este executa primeiro");
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
