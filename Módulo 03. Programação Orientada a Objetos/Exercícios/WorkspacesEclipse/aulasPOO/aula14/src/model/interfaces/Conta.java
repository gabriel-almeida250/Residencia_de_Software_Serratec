package model.interfaces;
@FunctionalInterface
public interface Conta {
	public void transacao();
	
	default void investimento() {
		System.out.println("Investimento realizado com sucesso!");
	}
}
