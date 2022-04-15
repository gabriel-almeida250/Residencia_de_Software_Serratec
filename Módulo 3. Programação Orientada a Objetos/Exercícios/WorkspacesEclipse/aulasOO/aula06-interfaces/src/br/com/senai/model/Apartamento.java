package br.com.senai.model;

public class Apartamento extends Imovel {
	private int andar;
	private int numero;
	public Apartamento(String local, double valor, int andar, int numero) {
		super(local, valor);
		this.andar = andar;
		this.numero = numero;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "andar" + andar + "n" + numero;
	}
	public int getAndar() {
		return andar;
	}
	public void setAndar(int andar) {
		this.andar = andar;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
}
