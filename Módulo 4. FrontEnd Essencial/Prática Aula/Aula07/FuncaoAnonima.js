function olaMundo(){
    return "Olá, Mundo"
}

var texto = olaMundo();

// console.log(texto)

var texto = function(){
    return "Olá Mundo"
}

// console.log(texto());

function exibirTexto(func){
    console.log(func());
}

exibirTexto(texto);
