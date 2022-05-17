package exercicio3Atleta;

import java.util.ArrayList;

public class Time {
	private String nomeTime;
	private String tecnico;
	private String diretor;
	private ArrayList<Atleta> atleta;

	public Time(String nomeTime, String tecnico, String diretor, ArrayList<Atleta> atleta) {
		super();
		this.nomeTime = nomeTime;
		this.tecnico = tecnico;
		this.diretor = diretor;
		this.atleta = atleta;
	}

	@Override
	public String toString() {
		return "Time: " + nomeTime + "\n------------" + "\nComissão Técnica:" + "\nTécnico: " + tecnico + ", Diretor: "
				+ diretor + "\n------------" + "\nAtletas: " + atleta;
	}

	public String getNomeTime() {
		return nomeTime;
	}

	public void setNomeTime(String nomeTime) {
		this.nomeTime = nomeTime;
	}

	public String getTecnico() {
		return tecnico;
	}

	public void setTecnico(String tecnico) {
		this.tecnico = tecnico;
	}

	public String getDiretor() {
		return diretor;
	}

	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}

	public ArrayList<Atleta> getAtleta() {
		return atleta;
	}

	public void setAtleta(ArrayList<Atleta> atleta) {
		this.atleta = atleta;
	}
}
