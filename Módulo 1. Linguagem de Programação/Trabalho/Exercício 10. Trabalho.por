programa
{	/*10. Desenvolva um programa que some duas matrizes modelo Amxn + Amxn = Amxn. Solicite que o
usuário escolha os números de entrada de ambas as matrizes e apresente como resultado as duas
matrizes de entrada e a matriz resultado, pode ser uma em baixo da outra. Identifique cada matriz
ao apresentar o resultado.*/
	
	funcao inicio()
	{
		inteiro matriz1[3][3]
		inteiro matriz2[3][3]
		inteiro matriz3[3][3]
		//Controla a matriz 1
		inteiro numero
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
		//Controla a matriz 2
		inteiro numero2
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
				escreva(matriz2[linha2][coluna2], " ")
			}
			escreva("\n")
		}
		//Fim matriz 2
		escreva("========\n")
		escreva("\n")	
		//Rusultado da soma da matriz 1 e da matriz 2
		inteiro numero3
		para(inteiro linha3=0;linha3<3;linha3++){
			para(inteiro coluna3=0;coluna3<3;coluna3++){
				matriz3[linha3][coluna3] = matriz1[linha3][coluna3] + matriz2[linha3][coluna3] 
			}
		}	
		//Imprimir a terceira matriz 
		escreva("O resultado da soma de duas matrizes é igual a: \n")	
		escreva("========\n")
		para(inteiro linha3=0;linha3<3;linha3++){
			para(inteiro coluna3=0;coluna3<3;coluna3++){
				escreva(matriz3[linha3][coluna3], " ")
			}
			escreva("\n")
		}
		//Fim matriz 3
		escreva("========\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1801; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {matriz1, 9, 10, 7}-{matriz2, 10, 10, 7}-{matriz3, 11, 10, 7}-{linha1, 16, 15, 6}-{linha1, 27, 15, 6};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */