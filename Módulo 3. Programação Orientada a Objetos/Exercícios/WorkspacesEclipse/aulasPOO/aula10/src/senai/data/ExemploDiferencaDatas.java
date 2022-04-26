package senai.data;

import java.time.LocalDate;
import java.time.Period;

public class ExemploDiferencaDatas {

	public static void main(String[] args) {
		LocalDate dataAniversario = LocalDate.of(1975, 06, 14);
		LocalDate hoje = LocalDate.now();
		System.out.println("Dia da semana: " + hoje.getDayOfWeek().name());
		System.out.println("Mês: " + hoje.getMonthValue());
		System.out.println("Ano: " + hoje.getDayOfYear());
		
		Period periodo = Period.between(dataAniversario, hoje);
		System.out.println("Passaram: " + periodo.getYears() + " anos");
		System.out.println(periodo.getMonths());
		System.out.println(periodo.getDays());
	}

}
