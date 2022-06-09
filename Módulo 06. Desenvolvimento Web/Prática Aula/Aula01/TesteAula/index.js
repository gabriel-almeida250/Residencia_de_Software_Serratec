const Grupo7 ={
    integrante1:{
        nome:"Gabriel",
        idade:22,
        endereco:{
            cidade: "Petrópolis",
            estado: "Rio de janeira"
        }
    },
    
    integrante2:{
        nome: "Vinícim do Barulho",
        idade: 18,
        endereco:{
            cidade: "Petrópolis",
            estado: "Rio de janeiro"
        }
    },

    integrante3:{
        nome: "Cauã",
        idade: 18,
        endereco:{
            cidade: "Petrópolis", 
            estado: "Rio da janeiro"
        }
    },

    integrante4:{
        nome: "Rebeca",
        idade: 23,
        endereco:{
            cidade: "Petrópolis",
            estado: "Rio de janeiro"
        }
    },
    
    integrante5:{
        nome: "Juliana",
        idade: 33,
        endereco:{
            cidade: "Petrópolis",
            estado: "Rio de janeira"
        }
    }
}
console.log(Grupo7.integrante1.nome,
            Grupo7.integrante2.idade, 
            Grupo7.integrante3.endereco.cidade, 
            Grupo7.integrante4.endereco.estado,
            Grupo7.integrante5.nome);

var array = [Grupo7.integrante1.nome,
    Grupo7.integrante2.idade, 
    Grupo7.integrante3.endereco.cidade, 
    Grupo7.integrante4.endereco.estado,
    Grupo7.integrante5.nome];

    console.log(array);

    
var todos = [Grupo7.integrante1, Grupo7.integrante2, Grupo7.integrante3, Grupo7.integrante4, Grupo7.integrante5]



todos.forEach((integrante) => {
    for(var i = 0; i<30; i++){
        console.log(integrante.nome);
    }
});


function executando(){
    console.log("Executou...")
}
//setInterval(executando, 1000)

    // for(var i = 0; i<30; i++){
    //     console.log(Grupo7.integrante1.nome,
    //         Grupo7.integrante2.idade, 
    //         Grupo7.integrante3.endereco.cidade, 
    //         Grupo7.integrante4.endereco.estado,
    //         Grupo7.integrante5.nome)
    // }

    var contador = 0
    // while(contador <= 30){
    //     console.log(Grupo7.integrante1.nome)
    //     contador++
    // }

    var contador2 = 0
    while(contador<todos.length){
       while(contador2<30){
        console.log(todos[contador].nome)   
        contador2++
       }
        contador++
        contador2=0
    }

