package br.com.senai.model;

public class Clinica extends Plano {
	private String nomeClinica;
	private String cnpj;
	
	public Clinica(String nome, String nomeClinica, String cnpj) {
		super(nome);
		this.nomeClinica = nomeClinica;
		this.cnpj = cnpj;
	}
	
	@Override
	public String toString() {
		
		return super.toString() + "\nNome da Clinica: " + nomeClinica + "\nCnpj: " + cnpj; 
	}

	public String getNomeClinica() {
		return nomeClinica;
	}

	public String getCnpj() {
		return cnpj;
	}
	
	
}
