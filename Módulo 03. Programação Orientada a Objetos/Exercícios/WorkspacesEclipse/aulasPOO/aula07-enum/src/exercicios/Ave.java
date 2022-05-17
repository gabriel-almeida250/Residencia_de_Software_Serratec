package exercicios;

import java.time.LocalDate;

public abstract class Ave extends Animal {

    protected String cor;

    public Ave(String nome, LocalDate dataVacinacao, String cor) {
        super(nome, dataVacinacao);
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Ave [cor=" + cor + ", nome=" + nome + ", dataVacinacao=" + dataVacinacao + "]";
    }

    public String getCor() {
        return cor;
    }

    @Override
    public String emitirSom() {
        return null;
    }

    public abstract String voar();
}