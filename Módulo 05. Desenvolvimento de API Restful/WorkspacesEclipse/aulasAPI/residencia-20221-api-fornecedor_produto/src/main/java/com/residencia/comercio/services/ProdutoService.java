package com.residencia.comercio.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.residencia.comercio.entities.Produto;
import com.residencia.comercio.repositories.ProdutoRepository;

@Service
public class ProdutoService {

	@Autowired
	ProdutoRepository produtoRepository;

	public List<Produto> findAllProduto() {
		return produtoRepository.findAll();
	}
	
	public Produto findByIdProduto(Integer id) {
		return produtoRepository.findById(id).isPresent() ?
				produtoRepository.findById(id).get() : null;
	}
	
	public Produto saveProduto(Produto produto) {
		return produtoRepository.save(produto);
	}
	
	public Produto updateProduto(Produto produto) {
		return produtoRepository.save(produto);
	}
	
	public void deleteProduto(Integer id) {
		Produto inst = produtoRepository.findById(id).get();
		produtoRepository.delete(inst);
	}
	
	public void deleteProduto(Produto produto) {
		produtoRepository.delete(produto);
	}

}
