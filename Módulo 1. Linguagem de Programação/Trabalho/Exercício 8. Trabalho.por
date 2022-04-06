programa
{	/*8. Elabora um programa que peça ao usuário que entre com 10 números. Após solicite que o usuário
escolha se quer que sejam impressos os números em ordem crescente ou decrescente e conforme
a escolha do usuário e faça a impressão da série.*/


  inteiro posicao, copia, troca = 0, tam = 10, vet[10]

  funcao inicio() {
    caracter resposta


    para(posicao = 0; posicao < tam; posicao++){
      escreva("\n Digite um número: ")
      leia(vet[posicao])
    }

    // ORDENANDO DO MAIOR PARA O MENOR
    //repita
    faca{
      troca = 0
      para(posicao = 0; posicao < tam - 1; posicao++){
        se(vet[posicao] > vet[posicao+1]){
          copia = vet[posicao]
          vet[posicao] = vet[posicao+1]
          vet[posicao+1] = copia
          troca = 1
        }
      }
    //ate
    }enquanto(troca == 1)

    escreva(" Deseja exibir em ordem (C) crescente ou (D) decrescente: ")
    leia(resposta)
      se(resposta == 'C' ou resposta == 'c'){
          crescente()
      } senao {
          decrescente()
      }
  }

//EXIBE A LISTA EM ORDEM CRESCENTE
  funcao crescente(){
        para(posicao = 0; posicao < tam; posicao++){
              se(posicao == tam-1){
             escreva(vet[posicao])
         }senao{
              escreva(vet[posicao], ",")
            }
      }
  }

  //EXIBE A LISTA EM ORDEM DECRESCENTE
  funcao decrescente(){
      para(posicao = tam-1; posicao >= 0; posicao--){
          se(posicao == 0){
              escreva(vet[posicao])
          }senao{
              escreva(vet[posicao], ",")
            }
    }
   }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 829; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */