/*3) Liste os fatoriais de 1 a 10. Deve ser exibido da seguinte maneira:
O Fatorial de 1 é : 1
O Fatorial de 2 é : 2
O Fatorial de 3 é : 6*/
package org.serratec.grupo7;

public class Fatorial {
	int numero;

	/*public static void main(String[] args) {
		int numeroFatorial = 0;
		 int resultado = 0;
		for (int cont = 0; cont <= 10; cont++) {
		        	  
		}

	}*/
	public int fatorial(int numero) {
		if(numero == 0 || numero == 1) {
			return 1;
		}else {
			return numero*fatorial(numero-1);

		}
	}


}

/*para(contador = 1;contador<=numero;contador++){

escreva (fibonacci(contador), " ")*/

/*funcao inteiro fatorial(inteiro numero2){
	se(numero2 == 1){
		retorne 1
	}
	retorne numero2*fatorial(numero2-1)*/

/*inteiro T1 = 0
escreva (T1, "..")
inteiro T2 = 1
escreva(T2, "..")
para(contador = 3;contador<=numero;contador++){
	T3 = T1 + T2
	T1 = T2
	T2 = T3
	escreva (T3, "..")*/