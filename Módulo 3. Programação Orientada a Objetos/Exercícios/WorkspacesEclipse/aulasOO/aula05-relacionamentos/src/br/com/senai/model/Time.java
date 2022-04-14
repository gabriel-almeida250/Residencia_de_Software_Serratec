package br.com.senai.model;

public class Time {
	private String nomeTime;
	private String Tecnico;
	private Atleta[] atletas;
	public Time(String nomeTime, String Tecnico, Atleta[] atletas) {
		super();
		this.nomeTime = nomeTime;
		this.Tecnico = Tecnico;
		this.atletas = atletas;
	}
	public String getNomeTime() {
		return nomeTime;
	}
	public String getTecnico() {
		return Tecnico;
	}
	public Atleta[] getAtletas() {
		return atletas;
	}
	public void setNomeTime(String nomeTime) {
		this.nomeTime = nomeTime;
	}
	public void setTecnico(String Tecnico) {
		this.Tecnico = Tecnico;
	}
	public void setAtletas(Atleta[] atletas) {
		this.atletas = atletas;
	}
	
	public void inserirAtletas(Atleta atleta) {
		for (int i = 0; i < this.atletas.length; i++) {
			if (atletas[i] == null) {
					atletas[i] = atleta;
				break;
			}
		}
	}
	
	public void listaTime() {
		for (int i = 0; i < atletas.length; i++) {
			System.out.println("Nome do Atleta: " + atletas[i].getNome());
		}
	}
}
