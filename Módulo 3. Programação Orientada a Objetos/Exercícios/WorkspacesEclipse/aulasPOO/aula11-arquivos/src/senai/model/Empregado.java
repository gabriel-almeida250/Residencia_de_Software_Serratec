package senai.model;

import java.util.Objects;

public class Empregado {
    private String nome;
    private String profissao;
    public Empregado(String nome, String profissao) {
        super();
        this.nome = nome;
        this.profissao = profissao;
    }
    @Override
    public String toString() {
        return "Empregado [nome=" + nome + ", profissao=" + profissao + "]";
    }
    public String getNome() {
        return nome;
    }
    public String getProfissao() {
        return profissao;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Empregado))
            return false;
        Empregado other = (Empregado) obj;
        return Objects.equals(nome, other.nome);
    }

}