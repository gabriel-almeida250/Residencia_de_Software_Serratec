package exercicio3Atleta;

public class Atleta {
	private String nomeAtleta;
	private int idade;
	private String posicao;

	public Atleta(String nomeAtleta, int idade, String posicao) {
		super();
		this.nomeAtleta = nomeAtleta;
		this.idade = idade;
		this.posicao = posicao;
	}

	@Override
	public String toString() {
		return "\nNome: " + nomeAtleta + "\nIdade: " + idade + "\nPosicao: " + posicao + "\n------------";
	}

	public String getNomeAtleta() {
		return nomeAtleta;
	}

	public void setNomeAtleta(String nomeAtleta) {
		this.nomeAtleta = nomeAtleta;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getPosicao() {
		return posicao;
	}

	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}

}
