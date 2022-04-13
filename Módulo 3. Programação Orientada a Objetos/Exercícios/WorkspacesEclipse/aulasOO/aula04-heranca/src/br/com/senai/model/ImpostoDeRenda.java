package br.com.senai.model;

public class ImpostoDeRenda {
    protected String nome;
    protected String telefone;
    protected String email;
    protected double rendimentos;

    public ImpostoDeRenda(String nome, double rendimentos) {
        this.nome = nome;
        this.rendimentos = rendimentos;

    }
    @Override
    public String toString() {
    	return "Nome: " + nome + "\nRendimentos: " + rendimentos;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public double getRendimentos() {
        return rendimentos;
    }

}