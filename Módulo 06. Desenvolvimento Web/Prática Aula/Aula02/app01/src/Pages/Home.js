import React, { useState } from "react";
import { Link } from "react-router-dom";

export const Home = () =>{

    const [usuario] = useState ({
        nome: "Gabriel",
        idade: 22
    })

    return(
        <>
            <h1>Home</h1>
            <Link to={`/quemsomos/${usuario.nome}/${usuario.idade}`}>Conheça quem somos</Link>
        </>
    )
}