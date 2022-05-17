programa
{
	inclua biblioteca Matematica-->mat 
	real litros, reias, arredonda 
	cadeia tipo 
	funcao inicio()
	{
		escreva("O preço da comum está 6.59 R$ e da aditivada está 6.73 \n")
		escreva("Quantos reias de gasolina você deseja? ")
		leia(reias)
		escreva("Qual você quer? Comum ou aditivada ")
		escreva("\n")
		leia(tipo)
		limpa()
		se (tipo=="Comum"){
			litros = reias/6.59
			arredonda = mat.arredondar(litros, 2)
			escreva("Colocando ", reias, " R$ de gasolina comum você vai ter mais ", arredonda, " litros no tanque.\n")  
		}
		senao se (tipo=="Aditivada"){ 
			litros = reias/6.73
			arredonda = mat.arredondar(litros, 2)
			escreva("Colocando ", reias, " R$ de gasolina aditivada você vai ter mais ", arredonda, " litros no tanque.\n")
		}	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 0; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */