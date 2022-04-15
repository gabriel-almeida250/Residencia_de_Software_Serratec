package praticaAula05;

public class TesteTime {

	public static void main(String[] args) {
		Atleta atleta1 = new Atleta("Diego Alves", 30, "Goleiro");
		Atleta atleta2 = new Atleta("Isla", 35, "Lateral");
		Atleta atleta3 = new Atleta("Bruno Henrique", 28, "Atacante");
		
		Time time = new Time("Flamengo", "Paulo Souza", new Atleta[3]);
		
		time.inserirAtletas(atleta1);
		time.inserirAtletas(atleta2);
		time.inserirAtletas(atleta3);

		System.out.println("Time: " + time.getNomeTime());
		time.listaTime();
		
	}

}
