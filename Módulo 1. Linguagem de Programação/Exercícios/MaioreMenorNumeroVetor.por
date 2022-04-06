programa
{
	
	funcao inicio()
	{
		inteiro numeros[5]
		para(inteiro contador=0; contador < 5; contador++){
			escreva("Digite um número: ")
			leia(numeros[contador])
			
		}
		inteiro menornumero = numeros[0] 
		inteiro maiornumero = numeros[0]
		para(inteiro contador=0; contador < 5; contador++){
			se(numeros[contador] < menornumero){
				menornumero = numeros[contador]	
			}
			se(numeros[contador] > menornumero){
				maiornumero = numeros[contador]	 
			}	
		}
		escreva("O maior número ", maiornumero, "\n")
		escreva("O menor número ", menornumero)
	}

}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 8; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */