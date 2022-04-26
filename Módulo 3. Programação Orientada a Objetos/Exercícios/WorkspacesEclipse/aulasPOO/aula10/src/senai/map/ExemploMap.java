package senai.map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class ExemploMap {

	public static void main(String[] args) {
		HashMap<String, String> mapaEstados = new HashMap<>();
		mapaEstados.put("RJ", "Rio de Janeiro");
		mapaEstados.put("SP", "São Paulo");
		mapaEstados.put("MG", "Minas Gerais");
		mapaEstados.put("SC", "Santa Catarina");
		mapaEstados.put("RS", "Rio Grande do Sul");
		
		for (String sigla : mapaEstados.keySet()) {
			System.out.println(sigla);
		}
		for (String nome : mapaEstados.values()) {
			System.out.println(nome);
		}
		for (Map.Entry<String, String> dados : mapaEstados.entrySet()) {
			//System.out.println(dados);
			System.out.println(dados.getKey() + "=====" + dados.getValue());
		}
		TreeMap<String, String> mapaOrdenados = new TreeMap<>(mapaEstados);
		System.out.println("************************");
		System.out.println(mapaOrdenados);
		System.out.println(mapaOrdenados.descendingMap());
		
		
	}

}
