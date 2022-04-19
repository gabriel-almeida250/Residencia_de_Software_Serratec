package org.serratec.enumeradores;

public enum EstadoCivil {
	CASADO('C'), SOLTEIRO('S'), VIUVO('V'), DIVORCIADO('D');
	private char valor;

	private EstadoCivil(char valor) {
		this.valor = valor;
	}

	public char getValor() {
		return valor;
	}
}
