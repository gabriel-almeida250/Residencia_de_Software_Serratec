package exercicio1;

public abstract class Universidade {
    private String nome;

    public Universidade(String nome) {
        super();
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Universidade [nome=" + nome + "]";
    }

    public String getNome() {
        return nome;
    }
    public abstract void fazerMatricula();
}
