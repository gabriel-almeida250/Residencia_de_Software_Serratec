programa
{

    funcao inicio()
    {
        inteiro numero
        escreva("Digite um número: ")
        leia (numero)

        escreva("O número de digitos do número é :",tamanhoNum(numero))

    }
    funcao inteiro tamanhoNum(inteiro numero1)
        {
            se(numero1<0)
            {
                numero1=numero1*-1
            }
            se(numero1 < 10)
            {
                retorne 1
            }
            senao
            {
                retorne 1+(tamanhoNum(numero1/10))
            }
        }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 192; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {numero1, 13, 38, 7};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */