package org.serratec.enumeradores;

public enum Setor {
	RH(10), COMPRAS(20), FATURAMENTO(30), CPD(40), DP(50);
	
	private int sala;

	private Setor(int sala) {
		this.sala = sala;
	}

	public int getSala() {
		return sala;
	}
}
