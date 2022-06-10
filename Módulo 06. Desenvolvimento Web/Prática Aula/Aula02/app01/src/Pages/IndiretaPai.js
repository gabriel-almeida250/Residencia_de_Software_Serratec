import React, {useState} from "react";
import {IndiretaFilho} from "./IndiretaFilho"

export const IndiretaPai = () => {
    const [pai, setPai] = useState({
        nome: "?",
        idade: 0,
        nerd: false
    })

    function informacaoDoPai(nome, idade, nerd) {
        setPai({nome: nome, idade: idade, nerd: nerd})
    }

    return (
        <>
            <div>
                <span>{pai.nome}</span>
            </div>
            <div>
                <span>{pai.idade}</span>
            </div>
            <div>
                <span>{pai.nerd ? "Verdadeiro" : "Falso"}</span>
            </div>
            <IndiretaFilho funcaoInformacoes={informacaoDoPai}/>
        </>
    )
}