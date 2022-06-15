import React from "react";
import { ContainerPai ,Titulo , Container, ContainerSpam, ContainerBotao,   Botao } from "./style";
import { useNavigate } from "react-router-dom";


export const ListaDeCompras = (props) =>{

    var navigate = useNavigate();
  
    function handleClick(){
        navigate("/")
    }

    return(
        <ContainerPai>
        <Titulo>Lista de compras:</Titulo>
        <Container>
            {props.lista.map(res =>(
                    <ContainerSpam>{res}</ContainerSpam>
            ))}
            </Container>
            <ContainerBotao>
            <Botao onClick={handleClick}>Voltar para home</Botao>
            </ContainerBotao>
        </ContainerPai>
        
    )
}