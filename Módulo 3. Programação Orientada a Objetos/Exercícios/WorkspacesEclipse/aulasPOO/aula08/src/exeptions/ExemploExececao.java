package exeptions;

import java.util.Scanner;

public class ExemploExececao {
	
	//throws - Passar o erro adiante
	public static int divisao(int i, int j) throws ArithmeticException {
		return i/j;
			//throw new ArithmeticException("Erro divisão por zero!");
	}
	public static void main(String[] args) {
		int a, b;
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Digite o primeiro nº");
			a = sc.nextInt();
			
			System.out.println("Digite o segundo nº");
			b = sc.nextInt();	
			
			System.out.println("O resultadoé: " + divisao(a, b));
		} catch (ArithmeticException e) {
			System.out.println("Erro de divisão de  zero");	
			System.out.println(e.getMessage());
		}
		
	}
}
