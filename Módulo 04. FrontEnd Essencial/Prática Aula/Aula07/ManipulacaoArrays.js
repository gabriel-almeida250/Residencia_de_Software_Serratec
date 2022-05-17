const frutas = [];
console.log(frutas.length);

frutas.push("Laranja", "Banana", "Maça");

console.log(frutas.length);
console.log(frutas.join(" | "));
frutas.pop("Banana");
console.log(frutas.join(" | "));
frutas.shift();
console.log(frutas.join(" | "));
frutas.push("Uva", "Goiaba", "Manga", "Kiwi");
console.log(frutas.join(" | "));


var elemento = frutas.indexOf("Uva");
console.log(elemento);
console.log(frutas[elemento]);
console.log(frutas.join(" | "));


var elemento2 = frutas.find(e => e === "Goiaba");
console.log(elemento2)
console.log(elemento2 = frutas.find(e => e === "Goiaba"));

var elemeto3 = frutas.find(function(e){
    return e === "Kiwi";
})
