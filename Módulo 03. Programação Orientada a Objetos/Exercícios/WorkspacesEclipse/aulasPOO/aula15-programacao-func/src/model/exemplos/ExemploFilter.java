package model.exemplos;

import java.util.Arrays;
import java.util.List;

import model.Aluno;

public class ExemploFilter {

	public static void main(String[] args) {
		Aluno a1 = new Aluno(1, "Gabriel", "gabriel@gmail.com", 46);
		Aluno a2 = new Aluno(2, "José", "jose@gmail.com", 32);
		Aluno a3 = new Aluno(3, "Silvana", "silvana@gmail.com", 18);
		Aluno a4 = new Aluno(4, "Thais", "thais@gmail.com", 55);
		Aluno a5 = new Aluno(5, "Marcelo", "marcelo@gmail.com", 23);

		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5);
		System.out.println("---Filtro por Idade---");
		alunos.stream().filter(a -> a.getIdade() > 30).forEach(a -> System.out.println(a));
		System.out.println("---Filtro por Nome---");
		alunos.stream().filter(a -> a.getNome().contains("S")).forEach(a -> System.out.println(a));
		
		System.out.println("---Ignorar o primeiro elemento---");
		alunos.stream().skip(1).forEach(a -> System.out.println(a));
		
		System.out.println("---limitar o resultado---");
		alunos.stream().limit(1).forEach(a -> System.out.println(a));
	}

}
