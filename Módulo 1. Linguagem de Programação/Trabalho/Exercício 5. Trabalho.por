programa
{	/*5. Desenvolva um programa no qual o usuário informa 10 números e programa responde qual é o
menor, o maior e a média dos valores.*/

	inteiro numero, maior, menor
	real media, soma
	funcao inicio()
	{
		inteiro contador = 1
		soma = 0.0
		enquanto (contador <= 10){
			escreva("Digite o ", contador, "°. Valor: ")
			leia(numero)
			se(contador == 1){
				menor = numero
			}
			senao se (numero < menor){
				menor = numero
			}
			se(contador == 1){
				maior = numero
			}
			senao se (numero > maior){
				maior = numero
			}
			soma += + numero
			media = soma/10
			contador++	
		}
		escreva ("A soma dos valores é: ", soma, "\n")
		escreva ("A média dos valores é? ", media, "\n")
          escreva ("Qual foi o menor número da soma? ", menor, "\n")
          escreva ("Maior número? ", maior,"\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 193; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */