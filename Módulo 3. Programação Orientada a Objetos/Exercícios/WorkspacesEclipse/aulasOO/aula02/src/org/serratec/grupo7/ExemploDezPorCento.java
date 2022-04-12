package org.serratec.grupo7;

import javax.swing.JOptionPane;

public class ExemploDezPorCento {

	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Digite seu nome: ");
		String telefone = JOptionPane.showInputDialog("Digite seu telefone: ");
		String email = JOptionPane.showInputDialog("Digite seu email: ");
		String salario = JOptionPane.showInputDialog("Digite seu salário ");
		
		int salario_nome =  Integer.parseInt(salario);

		double salarioPorCento = salario_nome*0.10;
		double resultado = salario_nome+salarioPorCento;
		
		
		JOptionPane.showInternalMessageDialog(null, String.format("%s\n%s\n%s\n%.2f",nome,telefone,email,resultado));
		
	}
}
