package org.serratec;

public class ExemploTernario {

	public static void main(String[] args) {
		boolean f = (1 > 5);
		boolean a = !(1 < 2);
		System.out.println(a);

		int dia = 30;
		if (dia < 30) {
			System.out.println("Mês de Fevereiro");
		} else {
			System.out.println("Outro mês");
		}

		System.out.println(dia < 30 ? "Mês de Fevereiro" : "Outro mês");
	}

}
