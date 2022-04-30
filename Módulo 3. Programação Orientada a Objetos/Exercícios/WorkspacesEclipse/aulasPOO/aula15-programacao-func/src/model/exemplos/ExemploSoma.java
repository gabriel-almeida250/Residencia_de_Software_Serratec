package model.exemplos;

import java.util.ArrayList;
import java.util.List;

public class ExemploSoma {

	public static void main(String[] args) {
		/*Calculo soma = new Calculo() {
			@Override
			public int operacao(int a, int b) {
				return a + b;
			}
		};*/
		//Método lambda
		//Calculo soma = (a, b) -> a + b;
		//System.out.println("O resultado da soma é: " + soma.operacao(2, 3));
		
		List<String> lista = new ArrayList<>();
		lista.add("TV");
		lista.add("Celular");
		lista.add("Computador");
		
		lista.forEach(a -> System.out.println(a));
		System.out.println("-------------------");
		lista.forEach(System.out::println);
	}

}
