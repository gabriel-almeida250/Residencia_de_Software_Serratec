programa
{
	inclua biblioteca Matematica-->mat
	cadeia resp1
	real resultado, n1, n2, arredonda
	funcao inicio()
	{
		escreva("Digite um número: ")
		leia(n1)
		escreva("outro número: ")
		leia(n2)
		escreva("Você quer Subtrair (-), Somar (+), Multiplicar (x) ou Dividir (/). Qual você escolher: ")
		leia(resp1)
		se(resp1=="-"){
			resultado = n1 - n2
			escreva("Resultado: \n", resultado)
		} senao se (resp1=="+"){
			resultado = n1 + n2
			escreva("Resultado: \n", resultado)
		} senao se (resp1=="x"){
			resultado = n1 * n2
			escreva("Resultado: \n", resultado)
		} senao se (resp1=="/"){
			resultado = n1 / n2
			arredonda=mat.arredondar(resultado, 2)
			escreva("Resultado: \n", arredonda)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 535; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */