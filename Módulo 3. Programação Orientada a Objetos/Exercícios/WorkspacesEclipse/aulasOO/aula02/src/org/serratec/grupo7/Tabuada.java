package org.serratec.grupo7;

import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {
        int resultado = 0, n1;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor desejado: ");
        n1 = sc.nextInt();

        System.out.println("+--Resultado--+");
        for (int contador = 1; contador <= 10; contador++) {
            resultado = contador * n1 ;

            System.out.println("|"+contador + " x " + n1 + " = " + resultado+ "|");

        }
        System.out.println("+-------------+");
    }

}