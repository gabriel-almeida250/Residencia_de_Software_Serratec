package praticaAula;

import java.util.ArrayList;
import java.util.List;

public class TestePessoa {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Fulano", "Coxinha@gmail.com", 55);
		Pessoa p2 = new Pessoa("Beutrano", "Beu@gmail.com", 39);
		Pessoa p3 = new Pessoa("Siclano", "si@gmail.com", 18);
		@SuppressWarnings("unused")
		Cliente c1 = new Cliente("Marcio");
		
		
		List<Pessoa> pessoas = new ArrayList<>();
		pessoas.add(p1);
		pessoas.add(p2);
		pessoas.add(p3);
		//pessoas.add(c1);
		
		//pessoas.addAll(pessoas);
		
		for (Pessoa pessoa : pessoas) {
			System.out.println(pessoa);
		}
	}

}
