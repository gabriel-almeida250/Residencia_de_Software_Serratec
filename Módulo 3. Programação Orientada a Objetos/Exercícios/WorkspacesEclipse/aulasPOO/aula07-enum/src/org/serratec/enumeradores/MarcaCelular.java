package org.serratec.enumeradores;

public class MarcaCelular {
	private int tamanho;
	private String modelo;
	private Marca marca;

	public MarcaCelular(int tamanho, String modelo, Marca marca) {
		this.tamanho = tamanho;
		this.modelo = modelo;
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "MarcaCelular [tamanho=" + tamanho + ", modelo=" + modelo + ", marca=" + marca + "]";
	}

	public int getTamanho() {
		return tamanho;
	}

	public String getModelo() {
		return modelo;
	}

	public Marca getMarca() {
		return marca;
	}
}
