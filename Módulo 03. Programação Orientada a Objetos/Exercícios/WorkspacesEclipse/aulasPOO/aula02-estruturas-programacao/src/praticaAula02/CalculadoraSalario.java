package praticaAula02;

public class CalculadoraSalario {
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		String nome = "Jorge";
		double salario = 2000.;
		
		if (salario<=5839.45) {
			salario = salario * 0.89;
		}else if (salario >= 2919.73) {
			salario=salario*0.9;
		}else if (salario <= 1751.82) {
			salario = salario*0.91;
		}else {
			salario = salario*0.92;
		}
		System.out.println("Sal?rio: "+salario);
	}
}