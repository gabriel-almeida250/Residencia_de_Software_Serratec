import React from "react";
import { useNavigate } from "react-router-dom";


export const Cards = () => {
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
      <div>
        <h1>
            Carro
        </h1>
      </div>
      <button onClick={handleClick}>Voltar para home</button>
    </>
  );
};
