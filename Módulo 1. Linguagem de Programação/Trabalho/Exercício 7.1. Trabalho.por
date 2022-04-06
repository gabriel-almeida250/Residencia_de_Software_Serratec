//Elabora um programa que solicita ao usuário a quantidade de números primos que ele quer que 
//seja impresso. Após imprima na tela a quantidade de números primos escolhida. Ex. Entrada 4
//Saída 1 2 3 5
programa{

inteiro numeroInformado,quantidade=0, contador=1
    funcao inicio()
    {

        escreva("Digite um numero : ")
        leia (numeroInformado)

        faca{

            se(ePrimo(contador) == verdadeiro){
                escreva("\nO número " + contador+ " é primo")
                quantidade++
            }
            contador++
                //contador continua somando até a quantidade chegar no numeroInformado
        }enquanto(quantidade < numeroInformado)
    }

    funcao logico ePrimo(inteiro num) 
    {
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
 * @POSICAO-CURSOR = 892; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */