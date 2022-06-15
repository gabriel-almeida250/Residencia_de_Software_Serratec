import React from "react";
import { BrowserRouter, Route, Routes } from "react-router-dom";
import { AdicionarLista } from "../ListaDeCompras/AdicionarLista";
import { Home } from "../Home/Index";

export const Root = () => {
    return (
        <>
            <BrowserRouter>
                <Routes>
                    <Route path="/" element={<Home />} />
                    <Route path="/addLista/:nome" element={<AdicionarLista/>} />
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