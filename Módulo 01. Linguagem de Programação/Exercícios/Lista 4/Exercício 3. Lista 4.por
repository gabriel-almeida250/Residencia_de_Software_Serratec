programa
{
	
	funcao inicio()
	{
		inteiro numero
		escreva("Digite um número: ")
		leia(numero)
		para(inteiro contador=1; contador <= numero; contador++){
			para(inteiro contador2=numero; contador2 >= contador; contador2--){
				escreva(" ")
		}
		para(inteiro contador3=1; contador3 <= contador; contador3++){
			escreva(contador3)		
		}
		se(contador != 0){
			para(inteiro contador3=contador-1; contador3 >= 1; contador3--){
				escreva(contador3)
			}
		
		}
		escreva("\n")
	     }
	}

}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 206; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */