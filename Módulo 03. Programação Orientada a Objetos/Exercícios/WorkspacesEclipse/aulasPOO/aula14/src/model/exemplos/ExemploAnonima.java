package model.exemplos;

import javax.swing.JButton;

public class ExemploAnonima {

	public static void main(String[] args) {
		JButton jButton = new JButton();
		jButton.addActionListener(e -> System.out.println("Teste"));

	}

}
