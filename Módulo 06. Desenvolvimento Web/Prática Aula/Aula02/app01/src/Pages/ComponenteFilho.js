import React from "react";

export function ComponenteFilho(props) {
    return (
        <>
            <div>
                <span>{props.nome}</span>
            </div>
            <div>
                <span>{props.idade}</span>
            </div>

            <span>{props.nerd ? "Verdadeiro" : "Falso"}</span>
        </>
    );
}