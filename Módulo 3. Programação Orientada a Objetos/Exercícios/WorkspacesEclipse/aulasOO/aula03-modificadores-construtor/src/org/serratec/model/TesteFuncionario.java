package org.serratec.model;

import javax.swing.JOptionPane;

public class TesteFuncionario {

    public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Digite seu nome: ");
		String salario = JOptionPane.showInputDialog("Digite seu sal�rio: ");
		Double salario1 = Double.parseDouble(salario);
    	Funcionario f1 = new Funcionario(nome, salario1);
        JOptionPane.showInternalMessageDialog(null, String.format("Nome: %s\nSal�rio: %.2f\nINSS: %.2f\nVale Transporte: %.2f\nSal�rio L�quido: %.2f",f1.getNome(),f1.getSalario(),f1.calcularINSS(),f1.calcularValeTransporte(),f1.salarioLiquido()));
    }

}
