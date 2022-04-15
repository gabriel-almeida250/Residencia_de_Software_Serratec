package br.com.senai.model;

public interface Tributos extends Taxas, ImpostoDeRenda {
	public double calcularICMS();
}
