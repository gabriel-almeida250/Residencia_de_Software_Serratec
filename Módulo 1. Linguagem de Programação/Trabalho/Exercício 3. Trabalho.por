programa
{
	inclua biblioteca Matematica	/*3. Escreva um programa que leia 10 nomes de alunos e duas notas de avaliações para cada aluno.
Calcule e escreva a média de cada aluno, seguido da informação se foi aprovado ou reprovado.
Considere como média para aprovação 6. Dica: Utilize quantos vetores precisar. Ex. Saída: Fulano
de tal P1= 8.0, P2=6.0, Media=7.0, aprovado!*/
	
	cadeia enter
	cadeia alunos [11] 
     real medias [11]  
     real nota1, nota2
	funcao inicio(	)
	{
		para(inteiro indice = 1 ; indice < 11 ; indice++){
			escreva("=====================================\n")
			escreva("| Curso de Tecnologia de Petrópolis |\n")
			escreva("=====================================\n")
			escreva("   Calculadora de médias dos alunos  \n")
			escreva("-------------------------------------\n")
			escreva("Aluno(a) ", indice,": ")
       		leia(alunos[indice])
       		escreva("------------------\n")
       		escreva("Primeira nota: ")
       		leia(nota1)
       		escreva("Segunda nota: ")
       		leia(nota2)
       		escreva("------------------\n")
       		medias[indice] = (nota1 + nota2)/ 2
       		escreva(alunos[indice], " sua primeira e sugunda notas foram: ", nota1, " e ", nota2, "\n")
       		escreva("Média: ", medias[indice], "\n")
       		se(medias[indice] >= 6){
       			escreva("Parabéns, ", alunos[indice],". Você foi aprovado(a)!!\n")
       		}
       		senao{
       			escreva(alunos[indice], "infelizmente você foi reprovado(a).\n")
       		}
       		escreva("----------------------------------------------\n")
       		escreva("Aperte enter para registrar o próximi aluno(a)\n")
       		escreva("----------------------------------------------\n")
       		leia(enter)
       		limpa()
		}
		escreva("Fim do registro")
	} 
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1239; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */