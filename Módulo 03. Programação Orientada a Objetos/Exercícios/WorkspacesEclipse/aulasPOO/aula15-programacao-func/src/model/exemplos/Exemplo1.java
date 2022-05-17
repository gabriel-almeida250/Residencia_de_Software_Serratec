package model.exemplos;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import model.Aluno;

@SuppressWarnings("unused")
public class Exemplo1 {

	public static void main(String[] args) {
		Aluno a1 = new Aluno(1, "Gabriel", "gabriel@gmail.com", 46);
		Aluno a2 = new Aluno(2, "José", "jose@gmail.com", 32);
		Aluno a3 = new Aluno(3, "Silvana", "silvana@gmail.com", 18);
		Aluno a4 = new Aluno(4, "Thais", "thais@gmail.com", 55);
		Aluno a5 = new Aluno(5, "Marcelo", "marcelo@gmail.com", 23);

		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5);
		//Método usando lambda.
		//alunos.forEach(a -> System.out.println(a));
		//Método já usado antes
		/*ExibeDados exibeDados = new ExibeDados();
		alunos.forEach(exibeDados);*/
		
		//Classe Anônima
		/*
		Consumer<Aluno> alunoConsumer = new Consumer<Aluno>() {

			@Override
			public void accept(Aluno t) {
				System.out.println(t);
				
			}
			
		};
		alunos.forEach(alunoConsumer);
		*/
		alunos.forEach(a ->{
			System.out.println(a.getNome());
			System.out.println(a.getIdade());
		});
		System.out.println("Imprimindo com Method Reference!");
		alunos.forEach(System.out::println);
	}
}
