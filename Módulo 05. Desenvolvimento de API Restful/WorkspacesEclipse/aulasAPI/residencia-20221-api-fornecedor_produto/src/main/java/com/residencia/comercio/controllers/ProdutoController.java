package com.residencia.comercio.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.residencia.comercio.entities.Produto;
import com.residencia.comercio.exceptions.NoSuchElementFoundException;
import com.residencia.comercio.services.ProdutoService;

@RestController
@RequestMapping("/produto")

public class ProdutoController {
	@Autowired
	ProdutoService produtoService;

	@GetMapping
	public ResponseEntity<List<Produto>> findAllProduto() {
		List<Produto> produtoList = produtoService.findAllProduto();
		if (produtoList.isEmpty()) {
			throw new NoSuchElementFoundException("Lista Vazia");
		} else {
			return new ResponseEntity<>(produtoList, HttpStatus.OK);
		}
	}

	@GetMapping("/{id}")
	public ResponseEntity<Produto> findProdutoById(@PathVariable Integer id) {
		Produto produto = produtoService.findByIdProduto(id);
		if (null == produto)
			throw new NoSuchElementFoundException("Não foi encontrado Produto com o id " + id);
		else
			return new ResponseEntity<>(produto, HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity<Produto> saveProdutoCompleto(@RequestBody Produto produto) {
		Produto novoProduto = produtoService.saveProduto(produto);
		return new ResponseEntity<>(novoProduto, HttpStatus.CREATED);
	}

	@PutMapping
	public ResponseEntity<Produto> updateProduto(@RequestBody Produto produto) {
		Produto novoProduto = produtoService.updateProduto(produto);
		return new ResponseEntity<>(novoProduto, HttpStatus.OK);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteProduto(@PathVariable Integer id) {
		if (null == produtoService.findByIdProduto(id))
			return new ResponseEntity<>("", HttpStatus.NOT_FOUND);

		produtoService.deleteProduto(id);
		return new ResponseEntity<>("", HttpStatus.OK);
	}

}
