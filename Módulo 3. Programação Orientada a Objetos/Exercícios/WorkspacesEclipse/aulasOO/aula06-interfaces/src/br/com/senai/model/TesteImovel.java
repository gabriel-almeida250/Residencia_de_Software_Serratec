package br.com.senai.model;

public class TesteImovel {

	public static void main(String[] args) {
		Imovel casa = new Casa("Centro", 2546152,true);
		@SuppressWarnings("unused")
		Imovel apto = new Apartamento("Bingen", 321321, 4, 23);
		
		Proprietario p1 = new Proprietario("Fulano", casa);
		
		System.out.println("Proprietário: " + p1.getNome());
		System.out.println(p1);
	}

}
