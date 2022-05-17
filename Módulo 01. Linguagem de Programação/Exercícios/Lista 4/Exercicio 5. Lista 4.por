programa
{
	
	funcao inicio()
	{
		inteiro numero, resto=0, numero2
		escreva("Escreva um número: ")
		leia(numero)
		numero2 = numero
		enquanto(numero>0){
			resto = resto*10
			resto += numero%10
			numero = numero/10
		}
		se(resto == numero2){
			escreva("É um palindromo. ")
		}senao{
			escreva("Não é um palindromo.")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 94; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */