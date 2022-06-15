import React from "react";
import { Link } from "react-router-dom";
import carro from "./images/animals.png"

export const Home = () =>{

    return(
        <>
            <h1>Bem vindo</h1>
            <button>
            <Link to={`/cards`}>Botão</Link>
            </button>
           <img src={carro}/>
        </>
    )
}