programa
{	// 7 - Escreva uma função que multiplica duas matrizes.
	
	funcao inicio()
	{
		inteiro matriz1[3][3]
		inteiro numero
		//Controla a matriz 1
		escreva("Digite os números da primerira matriz: \n")
		escreva("======================\n")
		para(inteiro linha1=0;linha1<3;linha1++){
			para(inteiro coluna1=0;coluna1<3;coluna1++){
				escreva("Digite um número: ")
				leia(matriz1[linha1][coluna1])	
			}
		}
		escreva("======================\n")
		escreva("\n")	
		//Imprimindo a primeira matriz
		escreva("Resultado primeira matriz: \n")
		escreva("========\n")
		para(inteiro linha1=0;linha1<3;linha1++){
			para(inteiro coluna1=0;coluna1<3;coluna1++){
				escreva(matriz1[linha1][coluna1], " ")
			}
			escreva("\n")
		}
		//Fim da matriz 1
		escreva("========\n")
		escreva("\n")	
		inteiro matriz2[3][3]
		inteiro numero2
		//Controla a matriz 2
		escreva("Digite os números da segunda matriz: \n")
		escreva("======================\n")
		para(inteiro linha2=0;linha2<3;linha2++){
			para(inteiro coluna2=0;coluna2<3;coluna2++){
				escreva("Digite um número: ")
				leia(matriz2[linha2][coluna2])	
			}
		}	
		escreva("======================\n")
		escreva("\n")	
		//Imprimir a segunda matriz 
		escreva("Segunda matriz: \n")
		escreva("========\n")
		para(inteiro linha2=0;linha2<3;linha2++){
			para(inteiro coluna2=0;coluna2<3;coluna2++){
				escreva(matriz1[linha2][coluna2], " ")
			}
			escreva("\n")
		}
		escreva("========\n")
		escreva("\n")	
		inteiro matriz3[3][3]
		escreva("O resultado da multiplicação de duas matrizes é igual a: \n")	
		escreva("========\n")
		//Controla a matriz 3
		para(inteiro linha3=0;linha3<3;linha3++){
			para(inteiro coluna3=0;coluna3<3;coluna3++){
				inteiro temp = 0
				para(inteiro i = 0; i<3;i++){
					 temp += matriz1[linha3][i]*matriz2[i][coluna3]
				}
				matriz3[linha3][coluna3]= temp
	 		}
		}
		para(inteiro linha3=0;linha3<3;linha3++){
			para(inteiro coluna3=0;coluna3<3;coluna3++){
				escreva(matriz3[linha3][coluna3], " ")
			}
			escreva("\n")
		}
		escreva("========\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 66; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */