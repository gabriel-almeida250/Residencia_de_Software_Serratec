package praticaAula02;

public class Exemplo2Printf {
	public static void main(String[] args) {
		String nome =  "Maria";
		String sobrenome= "Joaquina";
		int idade = 40;
		double altura = 1.85;
		double peso= 76.5;
		System.out.printf("\n%s tem %d anos e altura de %.2f",nome, idade, altura);
		System.out.printf("\n%s %s", nome, sobrenome);
		System.out.printf("\n%s tem %f kilos", nome, peso);

	}
	
}
