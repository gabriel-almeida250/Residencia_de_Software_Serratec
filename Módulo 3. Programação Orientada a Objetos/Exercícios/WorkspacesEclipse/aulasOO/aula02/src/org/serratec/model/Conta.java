package org.serratec.model;

public class Conta {
	String titular;
	int numero;
	double saldo;

	// Método sem retorno
	public void depositar(double valor) {
		this.saldo += valor;
		System.out.println("Seu saldo atual é: " + saldo);
	}

	// Método com retorno
	public boolean saque(double valor) {
		if (saldo < valor) {
			return false;
		} else {
			saldo -= valor;
			return true;
		}
	}
}
