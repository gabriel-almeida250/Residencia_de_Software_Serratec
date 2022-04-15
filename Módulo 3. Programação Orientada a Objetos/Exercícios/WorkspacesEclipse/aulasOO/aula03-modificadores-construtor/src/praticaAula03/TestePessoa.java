package praticaAula03;

public class TestePessoa {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		
		p1.setCodigoPessoa(1);
		p1.setNome("Fulano");
		p1.setAltura(1.70);
		p1.setPeso(60);
		System.out.println(p1.getNome());
		System.out.println(p1.resultado());
	}
}
