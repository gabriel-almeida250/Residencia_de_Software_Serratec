import React from "react";

export function IndiretaFilho(props){
    return(
        <>
        <h3>Filho</h3>
        <button onClick={() => props.funcaoInformacoes('Carlos', 55, true)}>Enviar Informações</button>
        </>
    )
}