package senai.arquivos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Exemplo6Gravacao {

	public static void main(String[] args) {
		BufferedWriter bw;
		try {
			bw = new BufferedWriter(new FileWriter("c:\\exemplos\\exercicio2.txt"));
			bw.append("Serratec-Java");
			bw.append("Ol� Mundo");
			bw.close();
		} catch (IOException e) {
			System.out.println("Arquivo n�o encontrado!");
			e.printStackTrace();
		}

	}

}
