package exercicios;

import java.time.LocalDate;

public abstract class Mamifero extends Animal {

    protected String raca;

    public Mamifero(String nome, LocalDate dataVacinacao, String raca) {
        super(nome, dataVacinacao);
        this.raca = raca;
    }

    @Override
    public String toString() {
        return "Mamifero: " + raca + "\nNome=" + nome + "Data da vacinacao: " + dataVacinacao;
    }

    public String getRaca() {
        return raca;
    }

    @Override
    public String emitirSom() {
        return null;
    }

    public abstract void amamentar();
}