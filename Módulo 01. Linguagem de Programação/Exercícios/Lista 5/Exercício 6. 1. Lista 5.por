programa
{

    funcao inicio()
    {
        const inteiro tamanho =5
        inteiro meuVetor[tamanho]
        inteiro numero

        escreva("Armazene ",tamanho," elementos no vetor\n")

         para(inteiro numero1=0 ; numero1<tamanho ;numero1++){
             escreva(" Elemento - " + numero1 + " : ")
             leia(numero)
             meuVetor[numero1]=numero
        }
              escreva("Os elementos no vetor são : ")

         para(inteiro numero2=0 ; numero2<tamanho ; numero2++){

             escreva(meuVetor[numero2]," ") }
    }

}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 70; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */