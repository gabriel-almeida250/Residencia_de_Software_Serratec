function executar(){
    console.log("Executou...")
}

// Executa depois da quantidade de segundos setados
setTimeout(executar, 1000); 

// Executa de 1 em 1 segundo
setInterval(executar, 1000);