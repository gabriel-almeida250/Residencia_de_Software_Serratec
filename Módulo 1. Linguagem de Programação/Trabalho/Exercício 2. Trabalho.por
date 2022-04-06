programa
{	/*2. Programar uma calculadora com as operações: soma, subtração, multiplicação e divisão. Deverá ter
um menu com as opções de operação. Após a escolha da operação deverá permitir a inserção de
dois valores e executar a conta. Deverá apresentar o resultado ao usuário e perguntar se ele deseja
fazer novo cálculo ou se deseja encerrar o programa. Deverá permitir voltar ao menu caso a escolha
seja fazer novo cálculo ou sair caso a escolha seja encerrar o programa.*/

	inclua biblioteca Matematica-->mat 
	funcao inicio()
	{	
		cadeia  resposta 
		real resultado, n1, n2, arredonda
		inteiro resp1
		faca{
			escreva("----------------------------------\n")
			escreva(" Calculadora de Operações Básicas \n")
			escreva("----------------------------------\n")
			escreva("Digite um número: ")
			leia(n1)
			escreva("Outro número: ")
			leia(n2)
			escreva("===============================\n")
			escreva("| Digite [1] para Subtrair    |\n")
			escreva("| Digite [2] para Somar       |\n")
			escreva("| Digite [3] para Multiplicar |\n")
			escreva("| Digite [4] para Dividir     |\n")
			escreva("===============================\n")
			escreva("Operação escolhido: ")
			leia(resp1)
			escolha(resp1){
				caso 1: resultado = n1 - n2
				escreva("O resultado da subrtração de ", n1, " por ", n2," é igual a: ", resultado,"\n")
				pare
				caso 2: resultado = n1 + n2
				escreva("O resultado da soma de ", n1, " por ", n2," é igual a: ", resultado,"\n")
				pare
				caso 3: resultado = n1 * n2
				escreva("O resultado da multiplicação de ", n1, " por ", n2," é igual a: ", resultado,"\n")
				pare
				caso 4: resultado = n1 / n2
				arredonda=mat.arredondar(resultado, 2)
				escreva("O resultado da divisão de ", n1, " por ", n2," é igual a: ", arredonda,"\n")
				pare
				caso contrario: 
				escreva("----------------------------------\n")
				escreva("| Escolha uma operação da lista. |\n")
				escreva("----------------------------------\n")
				pare
		}
		escreva("---------------------------------------\n")
		escreva("Deseja fazer um novo calculo? [Sim/Não] ")
		leia(resposta)	
		
		}enquanto (resposta=="Sim")
		se(resposta=="Não"){
			escreva("Saindo...")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 536; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */