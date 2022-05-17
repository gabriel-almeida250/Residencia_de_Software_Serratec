package exercicios;

public class Atleta implements Olimpiadas {
	private String nome;
	private double peso;
	private Pais pais;
	private String modalidade;
	private static int totalParticipantes;
	
	public Atleta(String nome, double peso, Pais pais) {
		super();
		this.nome = nome;
		this.peso = peso;
		this.pais = pais;
		this.modalidade = getModalidade();
	}
	@Override
	public String toString() {
		return "\nAtleta: " + nome + "\nPeso: " + peso + "\nPais: " + pais + "\nModalidade: " + modalidade;
	}
	public Pais getPais() {
		return pais;
	}
	public String getModalidade() {
		if (peso > 60 && peso < 90) {
			return "Peso médio";
		} else if (peso > 90 && peso <= 150) {
			return "Peso pesado";
		}else if (peso > 0 && peso < 60) {
			return "Peso leve";
		}else {
			return "Peso inválido";
		}
	}
	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}
	public String getNome() {
		return nome;
	}
	public double getPeso() {
		return peso;
	}
	public static int getTotalParticipantes() {
		return totalParticipantes;
	}
	
	@Override
	public String verificarSituacao() {
		if (peso > 60 && peso < 90) {
			totalParticipantes ++;
			return "\nPode participar";
		} else if (peso > 90 && peso <= 150) {
			totalParticipantes ++;
			return "\nPode participar"; 
		}else{
			return "\nNão pode participar";
		}
	}
}