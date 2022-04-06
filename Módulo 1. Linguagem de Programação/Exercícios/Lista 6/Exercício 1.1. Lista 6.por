programa
{
	
	funcao inicio()
	{
		inteiro vetor[5]
		inteiro numero
		para(inteiro contador = 0;contador <= 4; contador++){
			escreva("Digite um número: ")
			leia(vetor[contador])
		}
		inteiro contador2 = 4
		enquanto(contador2 >= 0){
			escreva(vetor[contador2], "..")
			contador2--
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 56; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */