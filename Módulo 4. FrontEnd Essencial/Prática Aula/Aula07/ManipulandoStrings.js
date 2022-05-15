var palavra = "Catapora";
console.log(palavra[1]);
console.log(palavra.length);

var novaPalavra = palavra.replace("pora", "pimba");
console.log(novaPalavra);

var nomeCompleto = "Gabriel Almeida";
var primeiroNome = nomeCompleto.split(' ', 2)[0];
var segundoNome = nomeCompleto.split(' ', 2)[1];
console.log(primeiroNome);
console.log(segundoNome);

// var novaPalavra2 = palavra.split();
// console.log(novaPalavra2)

var textoInteiro = "10";
var nInteiro = parseInt(textoInteiro);
console.log(textoInteiro);
console.log(nInteiro);

var textoFloat = "10.1"
var nFloat = parseFloat(textoFloat);
console.log(textoFloat);
console.log(nFloat);

var milNumber = 1000;
var texto = milNumber.toFixed(2);
console.log(texto)
console.log(milNumber.toFixed(2));

var palavras = ["Arroz", "Feijão"];
palavras.push("Milho");
palavras[5] = "Ketchup";
console.log(palavras);