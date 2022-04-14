package br.com.senai.model;

public class TesteImovel {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa("454564125", "Fulano", "fulano@gmail.com");
		Pessoa pessoa2 = new Pessoa("4+654+654", "Ranghuj", "Ranghuj@gmail.com");
		//Imovel imovel2 = new Imovel("Apto", 15444, new Pessoa(null, null, null));
		Imovel imovel = new Imovel("Casa", 250000, pessoa);
		
		System.out.println("Imóvel: " + imovel.getTipo() + " - " + "valor: "
		+ imovel.getValor() + " Dono: " + imovel.getDono().getNome());
	}

}
