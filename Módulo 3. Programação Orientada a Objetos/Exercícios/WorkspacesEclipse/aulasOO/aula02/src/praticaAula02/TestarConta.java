package praticaAula02;

public class TestarConta {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.numero = 123;
		conta.titular = "Fulano;";
		conta.saldo = 1000.;
		
		conta.depositar(100);
		
		Conta conta2 = new Conta();
		conta2.numero = 234;
		conta2.titular = "Gabriel";
		conta2.saldo = 2000.;
		
		if(conta2.saque(200)) {
			System.out.println("Saque efetuado com sucesso!");
			System.out.println("Seu saldo atual �: "+conta2.saldo);
		}else {
			System.out.println("Saldo insuficiente");
		}
		
	}
}
