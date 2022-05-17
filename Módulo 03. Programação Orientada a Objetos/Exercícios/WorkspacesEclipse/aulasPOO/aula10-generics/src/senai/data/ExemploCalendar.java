package senai.data;

import java.util.Calendar;

public class ExemploCalendar {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Calendar dataDeHoje = Calendar.getInstance();
		System.out.println(dataDeHoje);
		int ano = dataDeHoje.get(Calendar.YEAR);
		int mes = dataDeHoje.get(Calendar.MONTH);
		int dia = dataDeHoje.get(Calendar.DAY_OF_MONTH);
		int hora = dataDeHoje.get(Calendar.HOUR);
		int minuto = dataDeHoje.get(Calendar.MINUTE);
	}

}
