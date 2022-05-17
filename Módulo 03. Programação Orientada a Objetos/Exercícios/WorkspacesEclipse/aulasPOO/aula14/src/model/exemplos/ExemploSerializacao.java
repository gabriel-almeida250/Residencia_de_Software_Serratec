package model.exemplos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import model.Fornecedor;

public class ExemploSerializacao {
	
	public static void main(String[] args) {
		Fornecedor f1 = new Fornecedor("13213213123", "Empresa XPTO", "xpto@gmail.com",1.0);
		Fornecedor f2 = new Fornecedor("46546546546", "Empresa ABC", "abc@gmail.com",3.0);
		Fornecedor f3 = new Fornecedor("46546546546", "Empresa ABC", "abc@gmail.com",3.0);

		Set<Fornecedor> fornecedores = new HashSet<>();
		fornecedores.add(f1);
		fornecedores.add(f2);
		fornecedores.add(f3);
		try {
			FileOutputStream arquivoGravar = new FileOutputStream("c:\\Exemplos\\fornecedor.dat");
			ObjectOutputStream gravarObjeto = new ObjectOutputStream(arquivoGravar);
			gravarObjeto.writeObject(fornecedores);
			gravarObjeto.flush();
			gravarObjeto.close();
			arquivoGravar.close();
		} catch (Exception e) {
			System.out.println("Não foi possível gravar o Objeto!");
			e.printStackTrace();
		}
		System.out.println("Leitura do objeto criado");
		
		try {
			FileInputStream caminho = new FileInputStream("c:\\Exemplos\\fornecedor.dat");
			ObjectInputStream lerObjeto = new ObjectInputStream(caminho);
			System.out.println(lerObjeto.readObject());
			lerObjeto.close();
			caminho.close();
		} catch (Exception e) {
			System.out.println("Erro ao ler arquivo");
		}
	}
}
