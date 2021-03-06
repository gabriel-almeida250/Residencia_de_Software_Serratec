import React from "react";
import { BrowserRouter, Route, Routes } from "react-router-dom";
import { AdicionarLista } from "../Pages/Aula03/ListaDeCompras/AdicionarLista";

import { Cards } from "../Pages/Aula04/Exercicio/Cards/Index";
import { Home } from "../Pages/Aula04/Exercicio/Home/Index";
import { NotFound } from"../Pages/Aula04/Exercicio/NotFound/Index";

export const Root = () => {
    return (
        <>
            <BrowserRouter>
                <Routes>
                    <Route path="/" element={<AdicionarLista/>} />
                </Routes>
            </BrowserRouter>
            {/* <BrowserRouter>
                <Routes>
                    <Route path="/" element={<Home />} />
                    <Route path="*" element={<NotFound/>}></Route>
                    <Route path="/quemsomos/:nome/:idade" element={<QuemSomos />} />
                </Routes>
            </BrowserRouter> */}
            {/* <BrowserRouter>
                <Routes>
                    <Route path="/" element={<Home />} />
                    <Route path="/cards" element={<Cards />} />
                    <Route path="*" element={<NotFound/>} />
                </Routes>
            </BrowserRouter> */}
        </>
    )
}