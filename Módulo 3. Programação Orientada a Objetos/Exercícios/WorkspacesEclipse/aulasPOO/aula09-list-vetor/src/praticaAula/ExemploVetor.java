package praticaAula;

import java.util.Iterator;

@SuppressWarnings("unused")
public class ExemploVetor {

	public static void main(String[] args) {
		//String[] vetor = {"Celular", "Tv", "Blu-ray"};
		//vetor[2] = "Aparelho de Som";
		
		String[][] funcionario = {{"Ana Maria", "anam@gmail.com"},
								  {"João", "joao@gmail.com"},
								  {"Carla", "carla@uol.com.br"}};
		
		for (int linha = 0; linha < funcionario.length; linha++) {
			for (int coluna = 0; coluna < funcionario[linha].length; coluna++) {
				System.out.println(funcionario[linha][coluna]);
			}
		}
	}
}
