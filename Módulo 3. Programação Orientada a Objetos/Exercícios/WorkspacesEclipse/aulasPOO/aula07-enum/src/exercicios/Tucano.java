package exercicios;

import java.time.LocalDate;

public class Tucano extends Ave {

    private double peso;

    public Tucano(String nome, LocalDate dataVacinacao, String cor, double peso) {
        super(nome, dataVacinacao, cor);
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Tucano [peso=" + peso + ", cor=" + cor + ", nome=" + nome + ", dataVacinacao=" + dataVacinacao + "]";
    }

    @Override
    public String voar() {
        return null;
    }

    public double getPeso() {
        return peso;
    }

    @Override
    public String emitirSom() {
        return null;
    }
}