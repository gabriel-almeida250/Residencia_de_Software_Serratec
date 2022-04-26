package exeptions;

public class Exemplo3Exceptions {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int vetor[] = {10,30,60};
		int a = 30, b = 0, c = 0;
		String nome = null;
		
		try {
			System.out.println("Vetor posição 3" + vetor[3]);
			c = a/b;
		} catch (ArithmeticException e) {
			System.out.println("Erro divisão por zero");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Vetor fora de faixa!!");
		} catch (NullPointerException e) {
			System.out.println("Esqueceu da instância do objeto");
		}
	}

}
