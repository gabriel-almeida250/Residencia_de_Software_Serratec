package exercicios;

public class TestarAtleta {

	public static void main(String[] args) {
		Pais pais = new Pais("Brasil");
		Pais pais2 = new Pais("Argentina");
		Atleta atleta = new Atleta("Fulano", 100, pais2);
		Atleta atleta2 = new Atleta("Siclano", 65, pais);
		Atleta atleta3 = new Atleta("Beutrano", 1000, pais2);
		
		System.out.println(atleta);
		System.out.println(atleta2);
		System.out.println(atleta3);
		System.out.println("\nTotal de Participantes: " + Atleta.getTotalParticipantes());
	}

}
