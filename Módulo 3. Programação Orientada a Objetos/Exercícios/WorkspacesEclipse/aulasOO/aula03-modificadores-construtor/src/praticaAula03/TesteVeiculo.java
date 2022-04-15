package praticaAula03;

import java.util.Scanner;

public class TesteVeiculo {

	public static void main(String[] args) {
		char resposta = 's';
		Scanner sc = new Scanner(System.in);
		do {
			Veiculo v1 = new Veiculo();
			System.out.println("Digite a placa:");
			v1.placa = sc.next();
			System.out.println("Digite o combustível:");
			v1.tipoCombustivel = sc.next();
			System.out.println("Digite o valor do veículo:");
			v1.valor = sc.nextDouble();
			System.out.println("O valor do ipva2022 é:" + v1.calcularIPVA());
			System.out.println("Deseja continuar (S/s)");
			resposta = sc.next().charAt(0);
		} while (resposta == 'S' || resposta == 's');
		sc.close();
	}

}
/*
 * package org.serratec.model;
 * 
 * import java.util.Scanner;
 * 
 * public class TesteVeiculo {
 * 
 * public static void main(String[] args) { char resposta = 's'; do { Veiculo v1
 * = new Veiculo(); Scanner sc = new Scanner(System.in);
 * System.out.println("Digite a placa:"); v1.placa = sc.next();
 * System.out.println("Digite o combustível:"); v1.tipoCombustivel = sc.next();
 * System.out.println("Digite o valor do veículo:"); v1.valor = sc.nextDouble();
 * System.out.println("O valor do ipva 2022 é:" + v1.calcularIPVA());
 * System.out.println("Deseja continuar (S/s)"); resposta = sc.next().charAt(0);
 * } while (resposta == 'S' || resposta == 's'); }
 * 
 * }
 */
