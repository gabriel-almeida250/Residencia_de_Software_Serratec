package praticaAula02;

public class Conversao {

	public static void main(String[] args) {
		int a =100;
		@SuppressWarnings("unused")
		float b=2.1f;
		@SuppressWarnings("unused")
		int d=0;
		double c = 4.25;
		b = a;
		d = (int)c; //Casting de primitivo, convertendo double em int
		
		b = (float)c;
		b = 4.32f;
	}

}
