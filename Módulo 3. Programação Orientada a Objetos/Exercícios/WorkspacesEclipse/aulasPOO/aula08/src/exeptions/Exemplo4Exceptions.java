package exeptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exemplo4Exceptions {

	public static void main(String[] args) throws IOException{
		FileReader fr = null;
		try {
			 fr = new FileReader("C://ca//teste.txt");
			System.out.println("Arquivo encontrado!");
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado!");
			e.printStackTrace();
		}finally {
			fr.close();
			System.out.println("Sempre entra aqui!");
		}
	}

}
