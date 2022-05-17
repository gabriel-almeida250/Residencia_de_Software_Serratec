package senai.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestePessoa {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Gabriel", "314541365", 22);
		Pessoa p2 = new Pessoa("Fulano", "23134353", 17);
		Pessoa p3 = new Pessoa("Siclano", "31231313", 18);
		
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		pessoas.add(p1);
		pessoas.add(p2);
		pessoas.add(p3);
		
		Collections.sort(pessoas);
		System.out.println(pessoas);

	}

}
