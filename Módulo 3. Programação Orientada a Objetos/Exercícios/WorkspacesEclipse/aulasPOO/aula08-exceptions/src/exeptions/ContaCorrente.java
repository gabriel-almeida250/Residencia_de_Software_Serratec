package exeptions;

public class ContaCorrente implements Conta {
	private String numeroConta;
	private String titular;
	private double saldo;
	public ContaCorrente(String numeroConta, String titular, double saldo) {
		super();
		this.numeroConta = numeroConta;
		this.titular = titular;
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "ContaCorrente [numeroConta=" + numeroConta + ", titular=" + titular + ", saldo=" + saldo + "]";
	}

	public String getNumeroConta() {
		return numeroConta;
	}

	public String getTitular() {
		return titular;
	}

	public double getSaldo() {
		return saldo;
	}

	@Override
	public boolean saque(double valor) {
		if (saldo < valor) {
			throw new ContaException("Saldo Insuficiente!");
		}
		return true;
	}

	@Override
	public boolean deposito(double valor) {
		if (valor > 1000) {
			throw new ContaException("Deposito acima do permitido!");
		}
		saldo += valor;
		return true;
	}

}
