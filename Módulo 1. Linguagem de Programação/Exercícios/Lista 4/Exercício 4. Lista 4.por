programa
{
	
	funcao inicio()
	{
		inteiro numero
		escreva("Digite um número: ")
		leia(numero)
		para(inteiro linha = 1; linha<=numero ; linha++){
			para(inteiro numeroespacos=1; numeroespacos<linha;numeroespacos++){
				escreva(" ")
			}
			para(inteiro numeroesquerda=(numero+1-linha); numeroesquerda>=1 ; numeroesquerda--){
				escreva("*")
			}
			para(inteiro numerodireita=numero-linha; numerodireita>=1; numerodireita--){
				escreva("*")
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
 * @POSICAO-CURSOR = 480; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */