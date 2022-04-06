programa
{
	inteiro  anos, meses, tempo, dias
	funcao inicio()
	{
	
		escreva("A quantos dias a empresa está sem acidentes: ")
		leia(tempo)
		anos = tempo/365
		meses = (tempo%365) / 30
		dias = (tempo % 365) % 30
		se (anos >= 1 e meses >= 1 e dias >= 1){
			 escreva("A fábrica está sem acidentes a ", anos, " ano(s), ", meses, " mes(es) e ", dias, " dia(s) sem acidentes \n")
		}
		senao se (anos >= 1 e meses >= 1 e dias == 0){
		 	escreva("A fábrica está sem acidentes a ", anos, " anos(s) e ", meses, " mes(es) sem acidentes \n")
		} 	
		senao se (anos == 0 e dias >= 1 e meses >= 1){
			escreva("A fábrica está sem acidentes a ", meses, " mes(es) e ", dias, " dia(s) sem acidentes \n")
		}
		senao se (anos >= 1 e dias >= 1 e meses==0){
			escreva("A fábrica está sem acidentes a ", anos, " ano(s) e ", dias, " dia(s) sem acidentes \n")
		}
		senao se (anos == 0 e meses == 0 e dias >= 1){
			escreva("A fábrica está sem acidentes a ", dias, " dia(s) sem acidentes \n")
		}
		senao se (anos == 0 e meses >= 1 e dias == 0){
			escreva("A fábrica está sem acidentes a ", meses, " mes(es) sem acidentes \n")
		}
		senao se (anos >= 1 e meses == 0 e dias == 0){
			escreva("A fábrica está sem acidentes a ", anos, " ano(s) sem acidentes \n")
		}	
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 159; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */