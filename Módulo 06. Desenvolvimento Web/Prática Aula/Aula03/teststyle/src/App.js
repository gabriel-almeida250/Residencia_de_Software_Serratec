import React,{useState, useEffect} from "react";
import { Root } from "./Routes/Root";
import { Contexto} from "./Context/data";

function App() {


  return (
    <>
    <Contexto>
      <Root/>
      </Contexto>
    </>
  );
}

export default App;
