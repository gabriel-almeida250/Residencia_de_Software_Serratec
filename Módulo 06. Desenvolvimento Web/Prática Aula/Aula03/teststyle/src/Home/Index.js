import React, { useEffect, useState, useContext } from "react";
import { Link } from "react-router-dom";
import carro from "./images/animals.png"
import { DataContext } from "../Context/data";


export const Home = () =>{

    // const [produto, setUsuario] = useState({
    //     nomeProduto:"",
    //     preco:""
    // })

    // useEffect (() => {
    //     const getUsuario = async () =>{
    //         const response = await api.get("/categoria/produto/dto/12")
    //         console.log(response.data);
    //         setUsuario(response.data)
    //     }
    //     getUsuario()
    // },[])

    const {nome, handleSetNome} = useContext(DataContext)

    return(
        <>
            <h1>Bem vindo</h1>
            Nome:
            <input type="text" placeholder="Digite seu nome" value={nome || ""} onChange={((e) => handleSetNome(e))}/>
            <button>
            <Link to={`/addLista/${nome}`}>Botão</Link>
            </button>
           <img src={carro}/>
        </>
    )
}