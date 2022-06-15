import React, { useEffect, useState } from "react";

export const Mostrar = (props) => {
  useEffect (()=> {
    document.title = `${props.nome}`
  })
  return (
    <>
      <label>{props.nome}</label>
    </>
  );
};