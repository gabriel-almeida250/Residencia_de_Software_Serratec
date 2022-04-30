package teste;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import pacote_exception.CpfTamanhoException;
import pacote_exception.IdadeException;

public class TesteFuncionario {

	public static void main(String[] args) {
		Set<Funcionario> listaFuncionario = new HashSet<>();
		Funcionario funcionario = null;
		try {
			Scanner sc = new Scanner(new InputStreamReader(new FileInputStream("c:\\Exemplos\\funcionario.txt"), "UTF-8"));
			while (sc.hasNextLine()) {
				String linha = sc.nextLine();
				if (!linha.isEmpty()) {
					String[] dadoslinha = linha.split(";");
					String nome = dadoslinha[1], cpf = dadoslinha[2], dataNascimento = dadoslinha[3];
					Double 
					funcionario = new Funcionario(nome, cpf, LocalDate.parse(dataNascimento), null, null);
				}
				listaFuncionario.add(funcionario);
			}
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (CpfTamanhoException e) {
			e.printStackTrace();
		} catch (IdadeException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

}
