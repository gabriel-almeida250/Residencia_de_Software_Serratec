package com.residencia.comercio.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.residencia.comercio.dtos.EstoqueProdutoDTO;
import com.residencia.comercio.entities.Estoque;
import com.residencia.comercio.entities.Produto;
import com.residencia.comercio.repositories.EstoqueRepository;

@Service
public class EstoqueService {

	@Autowired
	EstoqueRepository estoqueRepository;
	
	@Autowired
	ProdutoService produtoService;
	
	public List<Estoque> findAllEstoque() {
		return estoqueRepository.findAll();
	}

	public Estoque findEstoqueById(Integer id) {
		return estoqueRepository.findById(id).isPresent() ? estoqueRepository.findById(id).get() : null;
	}
	
	public List<EstoqueProdutoDTO> findAllEstoqueProduto() {
		List<Estoque> listaEstoque = estoqueRepository.findAll();
		List<EstoqueProdutoDTO> listEstProdDTO = new ArrayList<>();
		if (!listaEstoque.isEmpty()) {
			for (Estoque estoque : listaEstoque) {
				EstoqueProdutoDTO estProdDTO = new EstoqueProdutoDTO();
				estProdDTO.setIdEstoque(estoque.getIdEstoque());
				estProdDTO.setQuantidade(estoque.getQuantidade());
				
				if (estoque.getProduto() != null) {
					estProdDTO.setNomeProduto(estoque.getProduto().getNomeProduto());
				}else if(null == estoque.getProduto()){
				} else {
					estProdDTO.setNomeProduto(null);
				}
				listEstProdDTO.add(estProdDTO);
			}
		} 
			return listEstProdDTO;
	}
}
