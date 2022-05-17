package praticaAula06;

public class Poupanca implements Conta {
	private double saldo;
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

}
