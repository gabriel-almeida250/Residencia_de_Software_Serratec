import React from "react";
import containerbatata from "./style"


export const ListaDeCompras = (props) =>{

    return(
        <>
        <h1>Lista de compras:</h1>
        <containeraipim>
            {props.lista.map(res =>(
                    <containerbatata>{res}</containerbatata>
            ))}
            </containeraipim>
            <button>
            <Link to={`/`}>Botão</Link>
            </button>
        </>
    )
}