package praticaAula;

public class TestarFuncionario {

	public static void main(String[] args) {
		Funcionario [] f = new Funcionario[3];
		f[0] = new Funcionario("Fulano", "Gerente TI", 1000);
		f[1] = new Funcionario("Beutrano", "Diretor TI", 8000);
		f[2] = new Funcionario("Siclano", "Auxiliar TI", 9000);

		for (Funcionario funcionario : f) {
			System.out.println(funcionario + "Salário com abono" + funcionario.abonoSalario(100));
		}
		/*for (int i = 0; i < f.length; i++) {
			System.out.println(f[i]);
		}*/
	}
}