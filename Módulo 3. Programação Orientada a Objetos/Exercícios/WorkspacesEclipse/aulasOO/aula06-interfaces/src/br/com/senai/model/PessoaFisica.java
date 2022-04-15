package br.com.senai.model;

public class PessoaFisica extends Pessoa implements Tributos {
	private int cpf;

	public PessoaFisica(String nome, String endereco, double rendimentos, int cpf) {
		super(nome, endereco, rendimentos);
		this.cpf = cpf;
	}
	
	@Override
	public String toString() {
		return "PessoaFisica [cpf=" + cpf + ", nome=" + nome + ", endereco=" + endereco + ", rendimentos=" + rendimentos
				+ "]";
	}

	@Override
	public double calcularImpostoDeRenda() {
		return rendimentos * irendaPessoaFisica;
	}

	@Override
	public double calcularICMS() {
		return 0;
	}
}
