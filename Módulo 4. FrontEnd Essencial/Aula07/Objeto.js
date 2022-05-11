var pessoa = {
    nome: "Gabriel",
    sobrenome: "Almeida",
    idade: 31,
    endereco:{
        rua: "Bataillard",
        numero: 33,
        cidade: "Petrópolis"
    },
    gritar: function(){
        console.log("AAAAAAAAAA....")
    }

}

console.log(pessoa.nome);
console.log(pessoa.sobrenome);
console.log(pessoa.endereco.rua);
console.log(pessoa.endereco.numero);
pessoa.gritar();

var gritarr = pessoa.gritar;

gritarr();