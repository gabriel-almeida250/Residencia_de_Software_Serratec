import React, {useState, useEffect} from "react";
import {ComponenteFilho} from "./ComponenteFilho";

export const ComponentePai = () => {
    const [processes , setProcesses] = useState("Inicial");

    function handleSetProcess(e) {
        setProcesses(...processes, e.target.value);
      }

    return (
      <>
        <label>
          Nome: {processes}{" "}
        </label>
        <div>
          <input
            type="text"
            value={processes}
            onClick={(e) => handleSetProcess(e)}
          ></input>
          <button
            onClick={(e) => handleSetProcess(e)}
            >
            Clique aqui
          </button>
        </div>
      </>
    );
  };
