package br.com.senai.model;

public class Veiculo {
	protected String chassi;
	protected String placa;
	protected String cor;
	protected double valorIPVA;
	
	public String getChassi() {
		return chassi;
	}
	public void setChassi(String chassi) {
		this.chassi = chassi;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public double getValorIPVA() {
		return valorIPVA;
	}
	public void setValorIPVA(double valorIPVA) {
		this.valorIPVA = valorIPVA;
	}
	public void adicionarValorIPVA(double valor) {
		valorIPVA += valor;
	}
}
