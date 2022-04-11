package org.serratec.model;

import javax.swing.JOptionPane;

public class ExemploOpitionPane {

	public static void main(String[] args) {
		String numero1 = JOptionPane.showInputDialog("Digite o primeiro valor:");
		String numero2 = JOptionPane.showInputDialog("Digite o segundo valor:");
		
		Double nota1 = Double.parseDouble(numero1);
		Double nota2 = Double.parseDouble(numero2); 
		
		JOptionPane.showInternalMessageDialog(null, (nota1+nota2)/2);
	}
}
