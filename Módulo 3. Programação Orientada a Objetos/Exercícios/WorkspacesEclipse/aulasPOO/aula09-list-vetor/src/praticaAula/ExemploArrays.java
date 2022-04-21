package praticaAula;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ExemploArrays {

	public static void main(String[] args) {
		List lista = Arrays.asList("Tv 43", "Celular", "Kindle");
		//lista.add("Aparelho de Sol");
		
		if (lista.isEmpty()) {
			System.out.println("Lista vazia");
		}else {
			lista.set(1, "Iphone");
			System.out.println(lista.get(1));
			System.out.println("O elemento da posição 2 é Kindle?" + (lista.contains("Kindle")?"Sim":"Não"));
		}
		Collections.sort(lista);
		System.out.println(lista);
	}

}
