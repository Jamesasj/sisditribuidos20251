package br.com.unisales;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hell Wolrd!");
				
		int [] meuVetor = new int[10];
		int [] meuVetor2 = {1,2,3,4,5,6,78,9};
		
		for (int i = 0; i < meuVetor2.length; i++) {
			if(meuVetor2[i] > 10) {
				System.out.println("valor maior que 10 =" +meuVetor2[i] );
			} else {
				System.out.println("valor menor que 10 = " +meuVetor2[i] );
			}
		}
	}

}
