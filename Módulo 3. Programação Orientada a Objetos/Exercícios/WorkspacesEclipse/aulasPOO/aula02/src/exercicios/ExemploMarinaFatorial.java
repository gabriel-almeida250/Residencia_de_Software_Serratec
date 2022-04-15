package exercicios;

import java.util.Scanner;

public class ExemploMarinaFatorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Qual o maior número da lista de fatoriais que você quer exibir? ");
        int maiorNumero = sc.nextInt();
        
        int[] vetorFatoriais = new int[maiorNumero];
        
        for(int i = 0; i < maiorNumero; i++) {
            vetorFatoriais[i] = calcFatorial((i+1)); 
        }
        
        for(int i = 0; i < maiorNumero; i++) {
            System.out.printf("O fatorial de %d �: %d%n", (i+1), vetorFatoriais[i]);
        }
        
        sc.close();

    }
    
    public static int calcFatorial(int i) {
        if(i == 0) {
            return 1;
        }else {
            return i * calcFatorial(i-1);
        }
        
    }

}