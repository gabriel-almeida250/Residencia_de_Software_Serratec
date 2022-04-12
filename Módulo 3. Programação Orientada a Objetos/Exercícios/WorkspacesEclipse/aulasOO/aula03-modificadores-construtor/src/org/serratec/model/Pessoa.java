package org.serratec.model;

public class Pessoa {
	private int codigoPessoa;
	private String nome;
	private double peso;
	private double altura;

	public int getCodigoPessoa() {
		return codigoPessoa;
	}

	public void setCodigoPessoa(int codigoPessoa) {
		if (codigoPessoa < 0) {
			System.out.println("Código inválido");
			
		}else {
			this.codigoPessoa = codigoPessoa;
		}
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double calcularIMC() {
		double imc = peso/(altura*altura);
		return imc;
	}
	
	public String resultado() {
		String resultado;
		if (calcularIMC() < 18.5) {
			resultado = "Abaixo do peso";
		} else if (calcularIMC() >= 18.5 && calcularIMC() <= 24.9) {
			resultado = "Peso ideal";
		} else {
			resultado = "Acima do peso";
		}
		return resultado;
	}
	
}
