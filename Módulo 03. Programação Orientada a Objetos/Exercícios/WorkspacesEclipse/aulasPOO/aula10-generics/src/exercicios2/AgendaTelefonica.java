package exercicios2;

import java.util.HashMap;
import java.util.Map;

public class AgendaTelefonica {
	private Map<String, String> colecao = new HashMap<>();

	public void inserir(String nome, String numero) {
		colecao.put(nome, numero);
	}
	
	public void buscarNumero(String nome) {
		System.out.println("O número de " + nome + " é " + colecao.get(nome));
	}
	public void remover(String nome) {
		colecao.remove(nome);
	}
	public int tamanho() {
		return colecao.size();
	}
	public void mostrarContatos() {
		for (Map.Entry<String, String> dados : colecao.entrySet()) {
			//System.out.println(dados);
			System.out.println(dados.getKey() + ";" + dados.getValue());
		}
	}
}
