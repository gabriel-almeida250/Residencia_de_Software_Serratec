programa
{
	
	funcao inicio()
	{
		inteiro cont = 1, n1, soma = 0
		escreva("Digite um número: ")
		leia(n1)
		enquanto(cont<=n1){
			escreva(cont,".. ")
			soma += cont
			cont++
		}
		escreva("A soma é : ", soma, "\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 179; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */