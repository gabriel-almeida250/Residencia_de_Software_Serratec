package exercicio2Cliente;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesteCliente {

    public static void main(String[] args) {

        ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();

        Scanner sc = new Scanner(System.in);
        int id;
        String nome;
        String telefone;
        int idade;
        System.out.println("Digite o ID do cliente :");
        id = sc.nextInt();
        while (id >= 0) {
            System.out.println("Digite o nome:");
            nome = sc.next();
            System.out.println("Digite a idade:");
            idade = sc.nextInt();
            System.out.println("Digite o telefone:");
            telefone = sc.next();
            Cliente cliente = new Cliente(id, nome, idade, telefone);
            listaClientes.add(cliente);
            System.out.println("Digite o ID do cliente :");
            id = sc.nextInt();
        }
        System.out.println(listaClientes);
        sc.close();
    }
}
