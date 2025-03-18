package br.com.unisales;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		somaDe0aN(100);
		somaDe0aN(47);
		somaDe0aN(10);
		
		int retorno = calculaOEnezimoNumeroFibbo(11);
		System.out.println("o numero e = " + retorno);
	}
	
	private static int calculaOEnezimoNumeroFibbo(int enesimo) {
		int valorAtual = 1;
		int valorAnterior = 1;
		for(int n = 2; n < enesimo; n++) {
			int aux = valorAtual+valorAnterior;
			valorAnterior= valorAtual;
			valorAtual = aux;
		}
		return valorAtual;
	}

	public static void somaDe0aN(int valorMaximo) {
		int aux = 0;
		for (int i = 0; i <= valorMaximo; i++) {
			aux += i; // aux = aux + i
		}
		System.out.println("a soma de 0 a " + valorMaximo +" e = " + aux);

	}

}
