package br.com.senai.model;


public class PessoaJuridica extends ImpostoDeRenda {
    private String cnpj;
    private String inscEstadual;

    public PessoaJuridica(String nome, double rendimentos, String cnpj, String inscEstadual) {
        super(nome, rendimentos);
        this.cnpj = cnpj;
        this.inscEstadual = inscEstadual;

    }
    @Override
    public String toString() {
    	return super.toString() + "\nCnpj: " + cnpj + "\nInsc.Estadual: " + inscEstadual + "\nCalculo IR: " + calculoIR();
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getInscEstadual() {
        return inscEstadual;
    }

    public double calculoIR() {
        double totalRendimento = rendimentos * 0.15;
        return totalRendimento;
    }

}
