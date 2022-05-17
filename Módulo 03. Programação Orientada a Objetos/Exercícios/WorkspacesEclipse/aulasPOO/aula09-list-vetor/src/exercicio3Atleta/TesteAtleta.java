package exercicio3Atleta;

import java.util.ArrayList;

public class TesteAtleta {

	public static void main(String[] args) {
		ArrayList<Atleta> listaAtleta = new ArrayList<Atleta>();

		listaAtleta.add(new Atleta("Kyrie Erving", 30, "PG"));
		listaAtleta.add(new Atleta("Michael Jordan", 59, "SG"));
		listaAtleta.add(new Atleta("Jimmy Butler", 32, "SF"));
		listaAtleta.add(new Atleta("Lebron James", 37, "PF"));
		listaAtleta.add(new Atleta("Nikola Jokic", 27, "C"));

		Time time1 = new Time("Flamengo Basquete", "Paulo Souza", "Gabriel", listaAtleta);
		System.out.println(time1);
	}
}
