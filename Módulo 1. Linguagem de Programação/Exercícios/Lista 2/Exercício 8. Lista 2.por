programa
{
	inclua biblioteca Matematica-->mat 
	real um_real, um_centavos, cinco_centavos, dez_centavos, cinquenta_centavos, vintecinco_centavos 
	real Q1, Q2, Q3, Q4, Q5, Q6
	real resultado, arredonda
	funcao inicio()
	{
	
		escreva("Quantas moedas de 1 centavos ele colocou? ")
		leia(um_centavos)
		escreva("Quantas moedas de 5 centavos ele colocou? ")
		leia(cinco_centavos)
		escreva("Quantas moedas de 10 centavos ele colocou? ")
		leia(dez_centavos)
		escreva("Quantas moedas de 25 centavos ele colocou? ")
		leia(vintecinco_centavos)
		escreva("Quantas moedas de 50 centavos ele colocou? ")
		leia(cinquenta_centavos)
		escreva("Quantas moedas de 1 real ele colocou? ")
		leia(um_real)
		Q1 = um_centavos*0.01
		Q2 = cinco_centavos*0.05
		Q3 = dez_centavos*0.10
		Q4 = vintecinco_centavos*0.25
		Q5 = cinquenta_centavos*0.50
		Q6 = um_real*1
		resultado = Q1 + Q2 + Q3 + Q4 + Q5 + Q6
		arredonda = mat.arredondar(resultado, 2)
		limpa()
		escreva("Total guardado: ", arredonda, " R$")
		
}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 175; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */