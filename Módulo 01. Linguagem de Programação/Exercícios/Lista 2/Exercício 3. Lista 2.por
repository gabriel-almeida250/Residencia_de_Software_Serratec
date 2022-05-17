programa
{
	inclua biblioteca Matematica-->mat
	real arredonda, arredonda2  
	real arrecadacao, poupanca, porcentagem 
	inteiro broa, pao
	funcao inicio()
	{ 
		escreva("Broas vendidas: ")
		leia(broa)
		escreva("Pães vendidos: ")
		leia(pao)
		arrecadacao = (broa * 0.12) + (pao * 1.50)
		arredonda2 = mat.arredondar(arrecadacao, 2)
		escreva("Broas e Pãos arrecadaram juntos: ", arredonda2," R$.\n")
		escreva("Quantos % que você quer guadar na poupança: ")
		leia(porcentagem)
		poupanca = arrecadacao * (porcentagem/100)
		arredonda = mat.arredondar(poupanca, 2)
		escreva("Quantidade para guardar na poupança? ", arredonda," R$\n")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 640; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */