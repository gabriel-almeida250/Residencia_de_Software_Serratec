package exercicios;

import java.time.LocalDate;

public class CachorroDomestico extends Mamifero implements AnimalDomestico {

    private boolean cadastro;

    public CachorroDomestico(String nome, LocalDate dataVacinacao, String raca, boolean cadastro) {
        super(nome, dataVacinacao, raca);
        this.cadastro = cadastro;
    }

    @Override
    public String toString() {
        return "CachorroDomestico: " + cadastro + "Raça: " + raca + "Nome: " + nome + "Data da vacinação: "
                + dataVacinacao;
    }

    public boolean isCadastro() {
        return cadastro;
    }

    @Override
    public void amamentar() {

    }

    @Override
    public boolean levarVeterinario() {
        return false;
    }

    @Override
    public boolean alimentar() {
        return false;
    }

    @Override
    public String emitirSom() {
        return null;
    }

}