//var escopo de função
//let escopo de bloco 
//const mesmo comportamento da let

// for (let i = 0; i < 1; i++) {
//     var vard = "Var dentro do FOR!"; // pode ser lido fora do FOR
//     let letd = "Let dentro do FOR!"; // não pode ser lido fora do FOR
// }

// console.log(vard);
// console.log(letd);

// var exibirTexto = function(){
//     if(true){
//         var textoIf = "Var dentro do If";
//         console.log(textoIf)
//     }
// }
// console.log(textoIf)
// exibirTexto();
// var exibirTexto = function(){
//        nome = "Gabriel";
//        console.log(nome);

//        var nome;
//      }
    
//      exibirTexto();
function alterarTitulo(){
    var novoTitulo = prompt("Digite um titulo...");
    var titulo = document.getElementById("titulo");
    titulo.innerHTML = novoTitulo;
}