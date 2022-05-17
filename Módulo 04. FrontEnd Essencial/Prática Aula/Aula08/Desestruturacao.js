var pessoa ={
    nome: "Gabriel",
    sobrenome: "Almeida",
    idade: 22,
    endereco:{
        rua: "Rua Bataillard",
        numero: 33,
        cidade: "Petrópolis"
    },
    gritar: function(){
        console.log("AAAAAAAAAA...")
    }
}
//Exemplo 1
// const {nome, gritar, endereco} = pessoa;
// const {cidade} = endereco;

// console.log(cidade);
// console.log(nome);
// gritar();

//Exemplo 2
// const {cidade} = pessoa.endereco;
// console.log(cidade)

//Arrays
const nomes = ["Gabriel", "Fulano", "Beutrano", "Siclano"];
const [primeiro, segundo] = nomes;
console.log(nomes);
console.log(primeiro);
console.log(segundo);
console.log(nomes[3]);

//ARRAY

//Spread
// const meuArray = [1, 2, 3]
// const meuArray2 = [6, 7, 8]
// const meuArray3 = [...meuArray, 4, 5, ...meuArray2]

// console.log(meuArray);
// console.log(meuArray2);
//console.log(meuArray3);

//REST
// const meuArray = [1, 2, 3, 4, 5]

// const[primeiro, ...banana] = meuArray

// console.log(primeiro);
// console.log(banana);


//SPREAD OBJETOS
// var pessoa = {
//     nome: "Abner",
//     sobrenome: "Joia",
//     idade: 31,
//     endereco:{
//         rua: "Rua mosela",
//         numero: 120,
//         cidade: "Petropolis"
//     },
//     gritar: function(){
//         console.log("AAAAAAAAA....")
//     }
// }

//const pessoa2 = {...pessoa, sobrenome: "Silva"}
// const pessoa3 = {...pessoa, endereco:{...pessoa.endereco, cidade: "Rio de Janeiro"}}
// const pessoa4 = {...pessoa, idade:18, endereco:{...pessoa.endereco, cidade: "Rio de Janeiro"}, sobrenome: "Silva"}
// console.log(pessoa3);

//REST OBJETOS
var pessoa = {
    nome: "Abner",
    sobrenome: "Joia",
    idade: 31,
    endereco:{
        rua: "Rua mosela",
        numero: 120,
        cidade: "Petropolis"
    },
    gritar: function(){
        console.log("AAAAAAAAA....")
    }
}

const {nome, endereco, ...restoPessoa} = pessoa;
const {cidade, ...restoEndereco} = endereco;
console.log(nome)
console.log(restoPessoa)
console.log(cidade)
console.log(restoEndereco)