package praticaAula05;

public class TesteImovel {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa("454564125", "Fulano", "fulano@gmail.com");
		Pessoa pessoa2 = new Pessoa("4+654+654", "Ranghuj", "Ranghuj@gmail.com");
		//Imovel imovel2 = new Imovel("Apto", 15444, new Pessoa(null, null, null));
		Imovel imovel = new Imovel("Casa", 250000, pessoa);
		Imovel imovel2 = new Imovel("sdfhsd", 250000, pessoa2);

		
		System.out.println("Imóvel: " + imovel.getTipo() + " - " + "valor: "
		+ imovel.getValor() + " Dono: " + imovel.getDono().getNome());
		
		System.out.println("Imóvel: " + imovel2.getTipo() + " - " + "valor: "
		+ imovel2.getValor() + " Dono: " + imovel2.getDono().getNome());
	}

}
