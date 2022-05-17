package praticaAula02;

public class ExemploTernario {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		boolean f = (1 > 5);
		boolean a = !(1 < 2);

		int dia = 30;
		System.out.println(dia < 30 ? "Mês de Fevereiro" : "Outro mês");
	}

}
