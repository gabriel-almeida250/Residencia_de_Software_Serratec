import styled from "styled-components";

export const Container = styled.div`
    display: flex;
    flex-direction: column;
    align-items: center;
    justify-content: center;
`

export const FirstText = styled.div`
    background: #338888;
    font-size: 10rem;
    color: red;
`

export const SecondText = styled.div`
    background: blue;
    font-size: 50px;
    color: white;
    border: 1px;
`

export const AulaButton = styled.button`
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