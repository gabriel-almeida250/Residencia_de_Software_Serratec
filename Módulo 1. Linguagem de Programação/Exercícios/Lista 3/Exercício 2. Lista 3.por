programa
{
	inteiro angulo1, angulo2, angulo3
	funcao inicio()
	{
		escreva("Escreva ângulo 1: ")
		leia(angulo1)
		escreva("Escreva ângulo 2: ")
		leia(angulo2)
		escreva("Escreva ângulo 3: ")
		leia(angulo3)
		se(angulo1 < angulo2 + angulo3 e angulo2 < angulo1 + angulo3 e angulo3 < angulo1 + angulo2){
			se(angulo1 == angulo2 ou angulo2 == angulo3 ou angulo3 == angulo1)
				escreva("Esse triângulo é isósceles  \n")
		
			senao 
			
				se (angulo1 == angulo2 e angulo3 == angulo1)
				escreva("Esse triangulo é equilátero")
		
				senao
					escreva("Esse é um triângulo escaleno")
			}			
		senao
			escreva("Esses ângulos não podem formar um triâmgulo")
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 590; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */