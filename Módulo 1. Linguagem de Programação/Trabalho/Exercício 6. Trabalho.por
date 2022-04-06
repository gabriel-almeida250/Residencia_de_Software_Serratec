programa
{	/*2. Programar uma calculadora com as operações: soma, subtração, multiplicação e divisão. Deverá ter
um menu com as opções de operação. Após a escolha da operação deverá permitir a inserção de
dois valores e executar a conta. Deverá apresentar o resultado ao usuário e perguntar se ele deseja
fazer novo cálculo ou se deseja encerrar o programa. Deverá permitir voltar ao menu caso a escolha
seja fazer novo cálculo ou sair caso a escolha seja encerrar o programa.*/
	
	funcao inicio()
	{
		inteiro numero1, numero2, resultado = 0
		escreva("Digite um número: ")
		leia(numero1)
		escreva("Digite outro número: ")
		leia(numero2)
		se(numero2 > numero1){
			escreva("Os numeros pares entre os números  ", numero1, " e ", numero2, " são: ")
			para(inteiro contador = numero1+1; contador <= numero2-1; contador++){
				se(contador % 2 == 0){
					escreva(contador, "..")
					resultado += contador
				}
			}
			escreva("\n")
			escreva("O resultado da soma deles é igual a: ")
			escreva(resultado)
		}
		senao se (numero2 < numero1){
			escreva("Os numeros pares entre os números  ", numero1, " e ", numero2, " são: ")
			para(inteiro contador = numero1-1; contador >= numero2+1; contador--){
				se(contador % 2 == 0){
					escreva(contador, "..")
					resultado += contador
				}
			}
			escreva("\n")
			escreva("O resultado da soma deles é igual a: ")
			escreva(resultado)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 478; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */