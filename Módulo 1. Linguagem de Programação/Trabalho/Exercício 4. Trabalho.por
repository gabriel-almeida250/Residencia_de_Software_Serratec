programa
{	/*4. Faça um programa que mostre um menu contendo 2 opções: 1. Fibonacci 2. Fatorial. Ao escolher o
numero 1 solicite que o usuário escolha a quantidade de números da série de Fibonacci ele quer
imprimir e execute a função recursivamente. Ao escolher a opção 2 solicite ao usuário que escolha
o número que deseja para o cálculo do Fatorial e execute a função recursivamente.*/
	
	cadeia n1
	inteiro contador, T3, numero,  resultado, numeroFatorial
	funcao inicio()
	{
		escreva("        Escolha uma das opções abaixo:      \n")
		escreva("============================================\n")
		escreva("|   Digite 1 para senquência de Fibonacci  |\n")
		escreva("============================================\n")
		escreva("|Digite 2 descobrir o fatorial de um número|\n")
		escreva("============================================\n")
		escreva("Escolha: ")
		leia(n1)
		limpa()
		se (n1 == "1"){
			escreva("=========================================\n")
			escreva("|Você escolheu a senquência de Fibonacci|\n")
			escreva("=========================================\n")
			escreva("Escolha até onde vai a sequência: ")
			leia (numero)
			escreva("=========================================\n")
			inteiro T1 = 0
			escreva (T1, "..")
			inteiro T2 = 1
			escreva(T2, "..")
			para(contador = 3;contador<=numero;contador++){
				T3 = T1 + T2
				T1 = T2
				T2 = T3
				escreva (T3, "..")	
			}
			escreva("\n")
			escreva("=========================================\n")
		} 
		senao se (n1 == "2"){
		escreva("=================================================\n")
		escreva("|Você escolheu descobrir o fatorial de um número|\n")
		escreva("=================================================\n")
		escreva("Qual número você quer saber o fatorial: ")
		leia(numeroFatorial)
		limpa()
		resultado = fatorial(numeroFatorial)
		escreva("=================================================\n")	
		escreva ("|      O fatorial de ", numeroFatorial, " é igual a: ", resultado, "      |\n")
		escreva("=================================================\n")
		}
			
	}
	funcao inteiro fatorial(inteiro numero2){
		se(numero2 == 1){
			retorne 1
		}
		retorne numero2*fatorial(numero2-1)
	}
}
	

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 2046; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */