programa
{
	inteiro Q1, Q2, Q3, garrafa_grande 
	real lata, garrafa_media, resultado
	funcao inicio()
	{
		escreva("Qual foi aquantidade de lata de 350 ml que ele comprou? ")
		leia(Q1)
		escreva("Qual foi a quantidade de garrafas de 600 ml ele comprou? ")
		leia(Q2)
		escreva("Qual foi a quantidade de garrafas de 2 litros que ele comprou? ")
		leia(Q3)
		limpa()
		lata = Q1*0.350
		garrafa_media = Q2*0.600
		garrafa_grande = Q3*2
		resultado = lata + garrafa_media + garrafa_grande
		escreva("Ele comprou ", resultado, " litros de Meia-Cola.\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 365; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */