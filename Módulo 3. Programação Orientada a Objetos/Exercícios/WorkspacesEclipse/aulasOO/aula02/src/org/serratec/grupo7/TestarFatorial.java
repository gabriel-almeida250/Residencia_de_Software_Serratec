package org.serratec.grupo7;

public class TestarFatorial {

	public static void main(String[] args) {
		int[] vetorNumeros = new int [10];
		
		Fatorial fatorial1 = new Fatorial();
		fatorial1.numero = 10;
		int resultado = fatorial1.fatorial(fatorial1.numero);
		System.out.println(resultado);
	}
}
//if(conta2.saque(200)) {
