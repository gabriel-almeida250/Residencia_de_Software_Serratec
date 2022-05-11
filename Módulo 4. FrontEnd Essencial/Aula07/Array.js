const numeros = [1,2,3,10,11];
const nomes = ['Gabriel', 'Fulano', 'Beutrano'];

console.log(numeros)
console.log(numeros[1])

const numeros2 = [1, 2, 3, [3.1, 3.2, 3.3], 10, 11]
console.log(numeros2)
console.log(numeros2[3])
console.log(numeros2[3][0])

const pessoas = [{nome: "Gabriel", idade: 22, bandas:["Guns n' Roses", "Red Hot", "Nirvana"]}, {nome: "Fulano", idade: 33, bandas:["Turma do Pagode", "Sorriso Maroto"]}];

console.log(pessoas);
console.log(pessoas[1].nome);
console.log(pessoas[1].bandas[1]);