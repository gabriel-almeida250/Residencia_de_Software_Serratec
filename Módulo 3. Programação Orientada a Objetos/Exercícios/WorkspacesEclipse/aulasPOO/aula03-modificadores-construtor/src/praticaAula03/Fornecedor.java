package praticaAula03;

public class Fornecedor {
	private String cnpj;
	private String razaosocial;
	private String telefone;
	//Não pertence aos Objetos que são instanciados, mas pertence a classe 
	private static int contador;
	
	public Fornecedor(String cnpj, String razaosocial, String telefone) {
		this.cnpj =cnpj;
		this.razaosocial = razaosocial;
		this.telefone = telefone;
		contador++;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getRazaosocial() {
		return razaosocial;
	}

	public void setRazaosocial(String razaosocial) {
		this.razaosocial = razaosocial;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public static int getContador() {
		return contador;
	}
	
	
}

/*Criar uma classe com o nome Fornecedor 
atributos:
cnpj
razao social
telefone

Construtor cheio
getter e setter
instanciar um objeto e imprimir os dados*/