package praticaAula02;

import java.util.Scanner;

public class ExemploLeitura {

	public static void main(String[] args) {
		int a, b;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor:");
		a = sc.nextInt();
		
		System.out.println("Digite o segundo valor");
		b = sc.nextInt();
		
		System.out.println("O resultado da soma é:");
		System.out.println(a+b);
		
		sc.close();
				
	}

}
