programa
{	/*1 - Escreva um programa que leia 10 números inteiros do teclado e armazena no
vetor. Após isso, imprima os 10 inteiros em ordem inversa ao que foi digitado.
*/
	
	funcao inicio()
	{
		inteiro vetor[10]
		inteiro numero
		para(inteiro contador = 0;contador < 10; contador++){
			escreva("Digite um número: ")
			leia(vetor[contador])
		}
		para(inteiro contador2 = 9;contador2 >= 0; contador2--){
			escreva(vetor[contador2], "..")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 172; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */