package senai.arquivos;

import java.io.File;
import java.util.Scanner;

public class Exemplo3Arquivos {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o arquivo ou diretório");
		String nome = sc.next();
		File file = new File(nome);
		if (file.exists()) {
			if (file.isFile()) {
				System.out.printf("O arquivo (%2) existe - e otamanho %d bytes",
				file.getName(), file.length());
			}else {
				System.out.println("O conteúdo da pasta é:");
				for (String item : file.list()) {
					System.out.println(item);
				}
			}
		}else {
			System.out.println("Arquivo ou diretório não encontrado!");
			
		}
	}
}
