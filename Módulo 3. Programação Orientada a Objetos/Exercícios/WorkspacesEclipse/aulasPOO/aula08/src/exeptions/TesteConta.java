package exeptions;

public class TesteConta {

	public static void main(String[] args) {
		Conta cc = new ContaCorrente("123", "Fulano", 1000);
		
		try {
			cc.deposito(10000);
			cc.saque(2000);
		} catch (ContaException e) {
			System.out.println(e.getMessage());
		}
	}
}
