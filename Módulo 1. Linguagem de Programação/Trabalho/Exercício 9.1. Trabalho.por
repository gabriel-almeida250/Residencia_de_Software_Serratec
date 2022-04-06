
programa
{
    inclua biblioteca Matematica --> mat

    funcao inicio()
    {
        real x1 = 0.0, x2 = 0.0 , a , b , c , delta
        escreva("informe o valor de a: ")
        leia(a)
        escreva("informe o valor de b: ")
        leia(b)
        escreva("informe o valor de c: ")
        leia(c)

        // calculando delta 
       delta=(b*b)-(4*a*c)
       se(delta<0){
           escreva("Delta não admite valores negativos\n")
       } 
       // calculando as raízes
       senao {
           x1=(-b + mat.raiz(delta, 2))/2*a
           x2=(-b - mat.raiz(delta, 2))/2*a
       }
       se(b>0 e c>0){
           escreva(a,"x² + ",b,"x +",c)
       }senao se (b<0 e c<0){
           escreva(a,"x²",b,"x",c)
       }senao se(b>0 e c<0){
           escreva(a,"x² +",b,"x",c)
       }senao {
           escreva(a,"x²",b,"x +",c)
       escreva("x1 = " , x1 , "x2 = ", x2)
       } 
    } 
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 289; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */