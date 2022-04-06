programa
{	/*7. Elabora um programa que solicita ao usuário a quantidade de números primos que ele quer que
seja impresso. Após imprima na tela a quantidade de números primos escolhida. Ex. Entrada 4
Saída 1 2 3 5*/

    inteiro numeroInformado
    funcao inicio()
    {

        escreva("Digite um numero : ")
        leia (numeroInformado)


        para(inteiro contador=1; contador<=numeroInformado; contador++){
            se(ePrimo(contador) == verdadeiro){
                escreva("\nO número " + contador+ " é primo")
            }
        }

    }

    funcao logico ePrimo(inteiro num) {
        para(inteiro posicao = 2; posicao < num; posicao++)
            se(num % posicao == 0) {
                retorne falso
            }
        retorne verdadeiro
    }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 11; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */