programa
{
	inclua biblioteca Matematica-->mat
	real n1, n2, resp1, resp2, resp3, resp4
	real arredonda
	funcao inicio()
	{
		escreva("Digite um número: ")
		leia(n1)
		limpa()
		escreva("Digite outro número: ")
		leia(n2)
		limpa()
		escreva("\n")
		resp1 = n1 + n2
		escreva("A soma entre ", n1," e ", n2," é igual a: ", resp1,"\n")
		resp2 = n1 - n2
		escreva("A subtração entre ", n1," e ", n2," é igual a: ", resp2,"\n")
		resp3 = n1 / n2
		arredonda = mat.arredondar(resp3,2)
		escreva("A divisão entre ", n1," e ", n2," é igual a: ", arredonda,"\n")
		resp4 = n1 * n2
		escreva("A divisão entre ", n1," e ", n2," é igual a: ", resp4, "\n")	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 176; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */