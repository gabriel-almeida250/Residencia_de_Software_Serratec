package model;

import model.interfaces.Conta;

public class ContaCorrente implements Conta {

	@Override
	public void transacao() {
		// TODO Auto-generated method stub

	}
	
	@Override
	public void investimento() {
		System.out.println("Investimento em CBD realizando com sucesso!!");
	}
	
	public static void main(String[] args) {
		Conta conta = new ContaCorrente();
		conta.investimento();
		
	}

}
