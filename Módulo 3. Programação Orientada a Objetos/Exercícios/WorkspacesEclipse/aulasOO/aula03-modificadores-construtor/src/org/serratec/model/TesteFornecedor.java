package org.serratec.model;

public class TesteFornecedor {

	public static void main(String[] args) {
		Fornecedor fornecedor = new Fornecedor( "XX.XXX.XXX/0001-XX.", "Coca Cola Ind�strias Ltda", "+55(24)95458-6234");
		Fornecedor fornecedor2 = new Fornecedor( "XX.XXX.XXX/0002-XX.", "Antartica Ind�strias Ltda", "+55(24)93643-3543");

		System.out.println(fornecedor.getCnpj());
		System.out.println(fornecedor.getTelefone());
		System.out.println(fornecedor.getRazaosocial());
		
		System.out.println(fornecedor2.getRazaosocial());
		
		System.out.println("O n�mero total de fornecedores �: "+ Fornecedor.getContador());
	}
}
