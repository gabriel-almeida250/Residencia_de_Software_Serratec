package model.persistence;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import model.Autor;

public class TesteAutor {

	public static void main(String[] args) {
		Autor a1 = new Autor("Sandro", "22349087");
		Autor a2 = new Autor("Carla", "22351086");
		
		List<Autor> autores = Arrays.asList(a1, a2);
		
		Consumer<Autor> exemploLamba = a -> a.imprimir();
		autores.forEach(exemploLamba);
		System.out.println("--------------");
		Consumer<Autor>exemploMethodReference = Autor::imprimir;
		autores.forEach(exemploMethodReference);
		
		System.out.println("--------Method Reference e uma linha--------");
		autores.forEach(Autor::imprimir);

	}

}
