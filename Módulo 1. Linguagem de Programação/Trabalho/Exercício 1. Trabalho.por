programa
{	/*1. Leia dois valores e efetue a divisão do primeiro pelo segundo. O segundo valor não pode ser ZERO
ou negativo, caso isso ocorra você deve informar ao usuário que o segundo número deve ser maior
do que ZERO e solicitar um novo valor. Deverá imprimir o resultado. Ao final deve perguntar se
deseja calcular outra divisão e caso sua resposta seja positiva limpe a tela e solicite novos valores.*/

	inclua biblioteca Matematica-->mat
	funcao inicio()
	{
		cadeia resposta
		real N1, N2, N3, resultado, arredonda
		faca{
		escreva("Digite um número: ")
		leia(N1)
		escreva("Digite outro número: ")
		leia(N2)
		se(N2 <= 0 ){
			escreva("O segundo valor não pode ser Zero ou negativo. \n")
			escreva("Digite o segundo valor novamente: ")
			leia(N2)
			resultado = N1/N2
			arredonda=mat.arredondar(resultado, 2)
			escreva(arredonda, "\n")
		}
		 senao se (N2 > 0){
			resultado = N1/N2
			arredonda=mat.arredondar(resultado, 2)
			escreva(arredonda, "\n")
		}
		escreva("Deseja fazer um novo calculo [S/N]: \n")
		leia(resposta)
		limpa()
		}enquanto(resposta=="S")	
		
		se(resposta=="N"){
			escreva("Saindo do programa...")
		}
			
		
		
		
		
			
		
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 745; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */