programa
{
    inteiro idade
    cadeia pedf
    cadeia gestante
    funcao inicio()
    {
        escreva("Você tem quantos anos?: ")
        leia(idade)

        se(idade >= 60)
        {
            escreva("\nFila Preferencial.")
        }
        senao
        {
            escreva("Você é deficiente físico?: ")
            leia(pedf)
            
            se(pedf == "sim" ou pedf == "Sim" ou pedf == "s" ou pedf == "S")
            {
                escreva("\nFila Preferencial.")
            }
            senao
            {
                escreva("Você é mulher gestante?: ")
                leia(gestante)
                
                se(gestante == "sim" ou gestante == "Sim" ou gestante == "s" ou gestante == "S")
                {
                    escreva("\nFila Preferencial.")
                }
                senao
                {
                    escreva("\nFila Normal.")
                }
            }
        }
    }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 961; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */