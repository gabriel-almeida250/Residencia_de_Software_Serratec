programa
{
	cadeia alunos [6] 
     real medias [6]  
     real nota1, nota2
	funcao inicio()
	{
		real resultado
		para(inteiro indice = 1 ; indice < 6 ; indice++){
		escreva("Aluno(a) ", indice,": ")
       	leia(alunos[indice])
       	escreva("------------------\n")
       	escreva("Primeira nota: ")
       	leia(nota1)
       	escreva("Segunda nota: ")
       	leia(nota2)
		medias[indice]=(nota1+nota2)/ 2
		resultado = medias[indice]
		escreva("Média: ", resultado, "\n")
		aprovado(resultado)
		se(aprovado(resultado)==verdadeiro){
			escreva("Você foi aprovado.\n")
		}
		senao{
			escreva("Você foi reprovado.\n")
		}
		}
		
	}
	funcao logico aprovado(real resultado){
		se(resultado >= 7){
			retorne verdadeiro
		}
		senao{
			retorne falso
		}
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 763; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {alunos, 3, 8, 6}-{medias, 4, 10, 6};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */