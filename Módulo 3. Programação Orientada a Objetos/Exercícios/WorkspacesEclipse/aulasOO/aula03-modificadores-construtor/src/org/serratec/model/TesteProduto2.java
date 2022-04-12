package org.serratec.model;

import java.util.Scanner;

public class TesteProduto2 {

	public static void main(String[] args) {
		char resposta = 's';
		Scanner leia = new Scanner(System.in);
		do {
		System.out.println("Digite o nome do produto: ");
		String nome = leia.next();
		
		System.out.println("Resgitre o valor do produto: ");
		double valorProduto = leia.nextInt();
		
		System.out.println("Digite a quantidade: ");
		int quabtidadeProduto = leia.nextInt();
		
		Produto2 p2 = new Produto2(nome, valorProduto, quabtidadeProduto);
		
		System.out.println("Produto: "+p2.getNome());
		System.out.println("Valor: "+p2.getValor());
		System.out.println("Quantidade: "+p2.getQuantidade());
		System.out.println("ICMS: "+p2.calcularIcms());
		
		System.out.println("Quer continuar: (S/N)");
		resposta = leia.next().charAt(0);
		}while (resposta == 's'|| resposta == 'S');
		leia.close();
		if (resposta != 's' || resposta != 'S' ) {
			System.out.println("Saindo do Programa...");
		}
	}
}
