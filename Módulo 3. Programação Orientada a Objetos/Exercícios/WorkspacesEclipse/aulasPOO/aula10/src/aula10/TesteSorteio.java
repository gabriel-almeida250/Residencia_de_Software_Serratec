package aula10;

public class TesteSorteio {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario("Ana", "Analista de Sistemas", "CPD");
		Funcionario f2 = new Funcionario("Ana Maria", "Advogado", "Jurídico");
		Funcionario f3 = new Funcionario("José", "Engenheiro", "Projetos");
		Funcionario f4 = new Funcionario("Catarina", "Auxiliar", "DP");
		
		Sorteio<Funcionario> sorteio = new Sorteio<Funcionario>();
		sorteio.adicionar(f1);
		sorteio.adicionar(f2);
		sorteio.adicionar(f3);
		sorteio.adicionar(f4);
		
		Funcionario funcionario = sorteio.sortear();
		System.out.println(funcionario);
		
		Sorteio<Integer> sortearNumeros = new Sorteio<Integer>();
		sortearNumeros.adicionar(100);
		sortearNumeros.adicionar(300);
		sortearNumeros.adicionar(400);
		Integer i = sortearNumeros.sortear();
		System.out.println(i);
	}

}
