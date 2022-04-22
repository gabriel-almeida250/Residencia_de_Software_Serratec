package exercicio2Cliente;

import java.util.ArrayList;
import java.util.Scanner;

public class TesteCliente {
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Cliente cliente = new Cliente();
	ArrayList<Cliente> listaCliente = new ArrayList<Cliente>();
	 do {
			System.out.println("Digite seu id:");
			int id = sc.nextInt();
			System.out.println("Digite seu nome: ");
			String nome = sc.next();
			System.out.println("Digite sua idade: ");
			String idade = sc.next();
			System.out.println("Digite seu telefone: ");
			String telefone = sc.next();
			cliente.setId(id);
			cliente.setIdade(idade);
			cliente.setNome(nome);
			cliente.setTelefone(telefone);
			listaCliente.add(new Cliente());
	 }while(cliente.getId() > 0);

	 

	for (Cliente clientes : listaCliente) {
		System.out.println(clientes);
	}
	}
}
