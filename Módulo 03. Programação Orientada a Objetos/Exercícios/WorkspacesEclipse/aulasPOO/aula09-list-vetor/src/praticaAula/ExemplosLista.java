package praticaAula;

import java.util.ArrayList;
import java.util.List;

public class ExemplosLista {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		List lista = new ArrayList<>();
		lista.add("Celular");
		lista.add("Tv 4k");
		lista.add("Kindle");
		lista.add(10);
		System.out.println(lista);
		System.out.println(lista.size());
		System.out.println(lista.remove(0));
		//System.out.println(lista);
		lista.set(0, "Tv 43");
		for (Object object : lista) {
			System.out.println(object);
		}
	}

}
