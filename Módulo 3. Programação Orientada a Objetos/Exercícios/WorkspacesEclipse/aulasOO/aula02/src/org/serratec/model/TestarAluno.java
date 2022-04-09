package org.serratec.model;

public class TestarAluno {

	public static void main(String[] args) {
		//Criação de uma instância de um objeto
	Aluno aluno = new Aluno();
	aluno.codigoAluno = 10;
	aluno.nome = "Gabriel";
	aluno.telefone = "2020-1545";
	//aluno.email = "gab@gmail.com";
	
	Aluno aluno2 = new Aluno();
	aluno2.codigoAluno = 11;
	aluno2.nome = "Sarah";
	
	System.out.println(aluno.nome);
	System.out.println(aluno.email);
	System.out.println(aluno2.nome);
	
	Aluno aluno3 = aluno;
	System.out.println(aluno3.nome);
	}
}
