programa
{

    funcao inicio()
    {
        inteiro ano
        logico bis

        escreva( " Digite o ano: ")
        leia(ano)

        bissexto(ano)

        se (bissexto(ano)==verdadeiro){
            escreva(" O ano " +ano+ " é bissexto")
        }senao{
            escreva(" O ano " +ano+ " não é bissexto")
        }


    }funcao logico bissexto(inteiro ano)
    {
        se(ano % 4 == 0 e ano % 100 != 0 ou ano % 400 == 0)
        {
            retorne verdadeiro
        }senao
        {
            retorne falso
        }
    }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 181; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */