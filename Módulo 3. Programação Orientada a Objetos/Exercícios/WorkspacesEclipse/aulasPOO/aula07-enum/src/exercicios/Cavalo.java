package exercicios;

import java.time.LocalDate;

public class Cavalo extends Mamifero implements AnimalCompeticao {

    private String marcaFerradura;

    public Cavalo(String nome, LocalDate dataVacinacao, String raca, String marcaFerradura) {
        super(nome, dataVacinacao, raca);
        this.marcaFerradura = marcaFerradura;
    }

    @Override
    public String toString() {
        return "Cavalo: " + marcaFerradura + "Raça: " + raca + "Nome: " + nome + "Data da vacinacao: "
                + dataVacinacao;
    }

    public String getMarcaFerradura() {
        return marcaFerradura;
    }


    @Override
    public void trocarFerradura() {

    }

    @Override
    public void viajar() {

    }

    @Override
    public void amamentar() {

    }
}