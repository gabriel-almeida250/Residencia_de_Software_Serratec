package br.com.senai.model;

import java.util.Arrays;

public class Contato {
    private String nome;
    private Endereco endereco;
    private Telefone[] telefones;

    public Contato(String nome, Telefone[] telefones, Endereco endereco) {
        this.nome = nome;
        this.telefones = telefones;
        this.endereco = endereco;
    }
    

    @Override
	public String toString() {
		return "Contato: " + nome + "\nEndereco: " + endereco + "\nTelefones: " + Arrays.toString(telefones);
	}


	public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Telefone[] getTelefone() {
        return telefones;
    }

    public void setTelefone(Telefone[] telefones) {
        this.telefones = telefones;
    }

    public void mostrarTelefones(Telefone telefone) {

        for (int i = 0; i < telefones.length; i++) {
            if (telefones[i] == null) {
                telefones[i] = telefone;
                break;
            }
        }
    }

    public void listaContato() {
        for (int i = 0; i < telefones.length; i++) {
            System.out.println("Numero do Telefone: "+ telefones[i].getNumero());
        }
    }

}