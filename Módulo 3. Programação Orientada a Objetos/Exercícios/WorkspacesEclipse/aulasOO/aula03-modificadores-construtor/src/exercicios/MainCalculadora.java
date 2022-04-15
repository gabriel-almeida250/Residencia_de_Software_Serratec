package exercicios;

import javax.swing.JOptionPane;

public class MainCalculadora {

	public static void main(String[] args) {
		String resposta = JOptionPane.showInputDialog("Digite qual opera�o voc� quer fazer: \n1 - Somar\n2 - Subtra��o\n3 - Multiplica��o\n4 - Divis�o\n5 - Sair");
		int resp1 = Integer.parseInt(resposta);
		String numero1 = JOptionPane.showInputDialog("Digite o primeiro valor:");
		String numero2 = JOptionPane.showInputDialog("Digite o segundo valor:");
		Double n1 = Double.parseDouble(numero1);
		Double n2 = Double.parseDouble(numero2);
		Calculadora calculadora = new Calculadora(n1, n2);
		switch (resp1) {
		case 1:
			JOptionPane.showMessageDialog(null, calculadora.calculadoraSoma());
			break;
		case 2:
			JOptionPane.showMessageDialog(null, calculadora.calculadoraSubtrair());
		    break;
		case 3:
			JOptionPane.showMessageDialog(null, calculadora.calculadoraMultiplicacao());
			break;
		case 4:
			JOptionPane.showMessageDialog(null, calculadora.calculadoraDivisao());
			break;
		default:
			JOptionPane.showMessageDialog(null, "Saindo do Programa...");
			break;
		}
	}
}
