programa
{
	cadeia escolha1
	inteiro litros, aditiva, comum 
	funcao inicio()
	{
		escreva("Quantos litros de gasolina você deseja: ")
		leia(litros)
		limpa()
		escreva("Quero, ", litros, " litros.\n")
		escreva("Comum ou Aditiva? ")
		leia(escolha1)
		limpa()
		escreva(escolha1, "\n")
		limpa()
		se (escolha1=="Comum"){
			comum = litros * 6.596
			escreva("Você vai pagar ", comum, " R$\n")
		}
		senao se (escolha1=="Aditiva"){ 
			aditiva = litros * 6.734
			escreva("Você vai pagar ", aditiva, " R$\n")
		}
	}	
		
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 207; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */