programa
{//2 - Escreva um programa que armazene X números em um vetor e calcule o valor médio do vetor.


    funcao inicio()
    {
        inteiro vetorRecebe[5]
         inteiro nums
         real mediaVetor = 0

        para(inteiro contador = 0 ; contador < 5; contador++){
        escreva("Digite um número: ")
        leia(nums)
        vetorRecebe[contador] = nums
        mediaVetor += vetorRecebe[contador]
        }
        escreva("A média do Vetor é: " + mediaVetor / 5)
    }

}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 492; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */