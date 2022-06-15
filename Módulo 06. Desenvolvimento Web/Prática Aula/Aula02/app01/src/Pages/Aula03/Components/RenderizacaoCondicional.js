import React, { useState } from "react";

export const RenderizacaoCondicional = () =>{

    const [isLogado, setIsLogado] = useState(false)

    function SaudacaoUsuario(){
        return(<h1>Bem-Vindo de Volta!</h1>)
    }

    function SaudacaoVisitante(){
        return(<h1>Por favor, registre-se</h1>)
    }

    function logar(){
        setIsLogado(true)
    }



    function validarLogInLogoff(props){
      if(props){
        return <SaudacaoUsuario/>
      }
        return <SaudacaoVisitante/>
    }


    return(
        <div>
            {validarLogInLogoff(isLogado)}
            <button onClick={() => logar()}>{isLogado ? 'Logoff': 'Login'}</button>
       
        </div>   
    )
}