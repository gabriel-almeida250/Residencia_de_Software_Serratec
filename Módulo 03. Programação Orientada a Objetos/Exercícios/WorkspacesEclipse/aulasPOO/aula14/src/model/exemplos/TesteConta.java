package model.exemplos;

import model.interfaces.Conta;

public class TesteConta {
	public static void main(String[] args) {
		Conta conta = () -> System.out.println("Transação efetuada com sucesso!!");
		
		Conta conta2 = () -> System.out.println("Transação efeutuada");
		conta.transacao();
		conta2.transacao();
		conta.investimento();
	}
}
