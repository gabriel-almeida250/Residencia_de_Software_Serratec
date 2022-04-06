programa
{ 	/*2 - Escreva um programa que armazene X números em um vetor e calcule o valor
médio do vetor*/
	
	funcao inicio()
	{
		inteiro resultado = 0
		inteiro mediavetor=0
		inteiro vetor [10]
		inteiro numero
		para(inteiro contador = 0; contador <= 9; contador++){
			escreva("Digite um numero: ")
			leia(vetor[contador]) 
			mediavetor += vetor[contador]
			resultado=mediavetor/10	
			}
			escreva(resultado)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 12; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */