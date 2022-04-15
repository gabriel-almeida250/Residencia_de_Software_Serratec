package praticaAula02;

public class ExemploSwitch {
	public static void main(String[] args) {
		int avaliacao = 5;
		
		switch (avaliacao) {
		case 5:
			System.out.println("Excelente");
			break;
		case 4:
			System.out.println("Bom");
		    break;
		case 3:
			System.out.println("Regular");
		    break;
		case 2:
			System.out.println("Ruim");
			break;
		case 1:
			System.out.println("Péssimo");
			break;
			
		default:
			System.out.println("Sem Resposta");
			break;
		}
	}
}
