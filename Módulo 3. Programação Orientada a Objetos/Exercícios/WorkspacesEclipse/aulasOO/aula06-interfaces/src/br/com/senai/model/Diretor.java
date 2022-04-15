package br.com.senai.model;

public class Diretor extends Funcionario {
	private String tipo;
	

	public Diretor(String nome, double salario, String tipo) {
		super(nome, salario);
		this.tipo = tipo;
	}


	@Override
	public String toString() {
		return "Diretor [tipo=" + tipo + ", nome=" + nome + ", salario=" + salario + "]";
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	@Override
	public void calcularAumentoSalario() {
		salario = salario * 1.15;
	}

}
