package senai.datahora;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ExemploDataHora {

	public static void main(String[] args) {
		LocalTime hora = LocalTime.now();
		System.out.println(hora);
		System.out.println(LocalTime.of(22, 00));
		
		LocalDateTime dataHora = LocalDateTime.of(2022, 4, 1, 22, 00);
		System.out.println(dataHora);
		System.out.println(LocalDateTime.now());
		DateTimeFormatter dft = DateTimeFormatter.ofPattern("YYYYMMDD");
		System.out.println(dataHora.format(dft));
	}
}
