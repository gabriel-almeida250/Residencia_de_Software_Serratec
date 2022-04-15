package br.com.senai.model;

public class ContaCorrente implements Conta {
	private double saldo;
	private double taxa;
	@Override
	public void saque(double valor) {
		if (saldo >= valor) {
			saldo = saldo - valor;
		}
	}

	@Override
	public void deposito(double valor) {
		saldo += valor;

	}

	public double getTaxa() {
		return taxa;
	}

	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}

}
