package praticaAula;

import java.util.Arrays;
import java.util.List;

public class ExemploDifrençasArrayListOf {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		String[] carros = {"Gol", "Fusca", "Fiesta"};
		List listaCarros = Arrays.asList(carros);
		
		listaCarros.set(1, "Fox");
		carros[2] = "Ka";
		
		for (Object object : listaCarros) {
			System.out.println(object);
		}
		System.out.println("-------------------");
		String[] cores = {"Vermelho", "Azul", "Amarelo"};
		List lista = List.of(cores);
		cores[0] = "Preto";
		System.out.println(lista);

	}

}
