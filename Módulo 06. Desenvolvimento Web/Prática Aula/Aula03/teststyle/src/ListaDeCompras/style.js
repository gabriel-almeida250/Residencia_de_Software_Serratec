import styled from "styled-components";


export const ContainerPai = styled.div`
    gap: 200px;
`
export const Titulo = styled.h1`
    text-align: center;
`

export const Container = styled.div`
    display: flex;
    justify-content: center;
    flex-wrap: wrap;
    gap: 30px;
`
export const ContainerSpam = styled.span`
    display: flex;
    justify-content: center;
    background-color: beige;
    border: 10px solid #333;
    height:  300px;
    width: 300px;
    
`
export const ContainerBotao = styled.div`
    display: flex;
    justify-content: center;
    margin-bottom: 20px;
`

export const Botao = styled.button`
      cursor: pointer;
     background: transparent;
     font-size: 1rem;
        color: #c793e1;
     border: 2px solid #c79;
        border-radius: 0.4rem;
        margin-top: 1rem;
    &:hover{
        background-color: #c793e1;
        color: #fff;
    }
`