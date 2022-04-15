package exercicios;

public class Pais {
	private String nomePais;

	public Pais(String nomePais) {
		super();
		this.nomePais = nomePais;
	}

	@Override
	public String toString() {
		return  nomePais ;
	}

	public String getNomePais() {
		return nomePais;
	}

}
