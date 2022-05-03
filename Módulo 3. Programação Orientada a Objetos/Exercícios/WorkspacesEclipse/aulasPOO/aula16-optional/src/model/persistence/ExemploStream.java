package model.persistence;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import model.Funcionario;

public class ExemploStream {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Funcionario f1 = new Funcionario(1, "Gabriel", "DP", 4600.);
		Funcionario f2 = new Funcionario(2, "José", "RH", 3200.);
		Funcionario f3 = new Funcionario(3, "Silvana", "CPD", 1800.);
		Funcionario f4 = new Funcionario(4, "Thais", "CPD", 5500.);
		Funcionario f5 = new Funcionario(5, "Marcelo", "FINANCEIRO", 2300.);

		List<Funcionario> funcionarios = Arrays.asList(f1, f2, f3, f4, f5);
		boolean achou = funcionarios.stream().allMatch(f -> f.getSetor().equals("DP"));

		List<String> nomes = funcionarios.stream().sorted(Comparator.comparing(Funcionario::getNome).reversed())
				.map(Funcionario::getNome).collect(Collectors.toList());
		System.out.println(nomes);
		
		funcionarios.stream().filter(f -> f.getSalario() >= 3000).forEach(f -> System.out.println(f));
		System.out.println("---------------");
		funcionarios.stream().filter(f -> f.getSalario() >= 3000).forEach(System.out::println);
		
		System.out.println("--------Maior Salário--------");
		Optional<Double> maiorSalario = funcionarios.stream().map(Funcionario::getSalario).max(Comparator.naturalOrder());
		System.out.println("Maior Salário: " + maiorSalario.get());
		
		System.out.println("---------Média Salário---------");
		Double media = funcionarios.stream().mapToDouble(Funcionario::getSalario).average().orElse(0);
		System.out.println("Média Salarial: " + media);
	}

}
