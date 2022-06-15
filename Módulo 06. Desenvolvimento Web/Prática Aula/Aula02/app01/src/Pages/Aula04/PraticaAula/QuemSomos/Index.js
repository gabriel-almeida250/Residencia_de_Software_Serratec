import React from "react";
import { useNavigate, useParams } from "react-router-dom";
import { AdicionarLista } from "../../../Aula03/Components/AdicionarLista.js";
import {FirstText, SecondText, Container, AulaButton} from "./style.js"


export const QuemSomos = () => {
  let { nome } = useParams();
  let { idade } = useParams();
  let navigate = useNavigate();

  function handleClick() {
    navigate("/");
  }

  return (
    <>
      {/*<h3>Usuário logado: {nome}</h3>
            <h3>Idade do usuário logado: {idade}</h3>
            <h1>Quem Somos</h1>
            <h2>Aqui você irá descobrir quem somos e o que fazemos</h2>
            <button onClick={handleClick}>Voltar para Home</button> */}
      {/* <Container>
            <h3>Usuário logado: {nome}</h3>
            <h3>Idade do usuário logado: {idade}</h3>
            <h1>Quem Somos</h1>
            <h2>Aqui você irá descobrir quem somos e o que fazemos</h2>
            <AulaButton onClick={handleClick}>Voltar para Home</AulaButton>
            </Container> */}
      <Container>
        <FirstText>Quem somos?</FirstText>
        <SecondText> Somos uma turma de reactJs</SecondText>
        <AdicionarLista />
      </Container>
      <AulaButton onClick={handleClick}>Voltar para home</AulaButton>
    </>
  );
};
