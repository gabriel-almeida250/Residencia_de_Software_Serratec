programa
{
	real angulo1, angulo2, angulo3
	funcao inicio()
	{
		escreva("Escreva ângulo 1: ")
		leia(angulo1)
		escreva("Escreva ângulo 2: ")
		leia(angulo2)
		escreva("Escreva ângulo 3: ")
		leia(angulo3)
		se(angulo1 < angulo2 + angulo3 e angulo2 < angulo1 + angulo3 e angulo3 < angulo1 + angulo2){
			escreva("Esses ângulos podem formar um triangulo")
		}
		senao{
			escreva("Esses ângulos não podem formar um triângulo")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 410; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */