package exercicio1Aluno;


import java.util.ArrayList;
import java.util.List;

public class TesteAluno {

    public static void main(String[] args) {
        Aluno a1 = new Aluno("Vinicius", 10, 8);
        Aluno a2 = new Aluno("Cleiton", -5, 9.5);
        Aluno a3 = new Aluno("Marc Spector", 10, 5);

        List<Aluno> alunos = new ArrayList<>();

        alunos.add(a1);
        alunos.add(a2);
        alunos.add(a3);

        try {
            for (Aluno aluno : alunos) {
                System.out.println(aluno.calcularMedia());
            }

        } catch (AlunoException e) {
            System.out.println(e.getMessage());
        }

    }

}
