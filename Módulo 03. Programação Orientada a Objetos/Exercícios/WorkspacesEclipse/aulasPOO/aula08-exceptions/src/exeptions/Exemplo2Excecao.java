package exeptions;

public class Exemplo2Excecao {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		String fraseInicial = null;
		String fraseFinal = null;
		
		try {
			fraseFinal = fraseInicial.toUpperCase();
			System.out.println("Resultado: " + fraseFinal);
		} catch (NullPointerException e) {
			System.out.println("Falha ao converter!");
			e.printStackTrace();
		}
	}

}
