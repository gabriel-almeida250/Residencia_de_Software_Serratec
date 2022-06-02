package com.residencia.comercio.controllers;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.residencia.comercio.dtos.ProdutoDTO;
import com.residencia.comercio.entities.Produto;
import com.residencia.comercio.exceptions.NoSuchElementFoundException;
import com.residencia.comercio.services.ProdutoService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/produto") 
@Tag(name = "Produtos", description = "Endpoints")

@Validated
public class ProdutoController {
	@Autowired
	ProdutoService produtoService;

	@GetMapping
	@Operation(summary = "Listar todos os Produtos.")
	public ResponseEntity<List<Produto>> findAllProduto() {
		List<Produto> produtoList = produtoService.findAllProduto();
		if (produtoList.isEmpty()) {
			throw new NoSuchElementFoundException("Lista Vazia");
		} else {
			return new ResponseEntity<>(produtoList, HttpStatus.OK);
		}
	}



	@GetMapping("/{id}")
	@Operation(summary = "Listar um Produto pelo ID.")
	public ResponseEntity<Produto> findProdutoById(@PathVariable Integer id) {
		Produto produto = produtoService.findByIdProduto(id);
		if (null == produto)
			throw new NoSuchElementFoundException("Não foi encontrado Produto com o id " + id);
		else
			return new ResponseEntity<>(produto, HttpStatus.OK);
	}
	
	@GetMapping("/query")
	public ResponseEntity<Produto> findByIdQuery(
			@RequestParam
			@NotBlank(message = "O sku deve ser preenchido.")
			String sku){
		return new ResponseEntity<>(null, HttpStatus.CONTINUE);
	}
	
	@GetMapping("/request")
	public ResponseEntity<Produto> findByIdRequest(
			@RequestParam
			@NotBlank(message = "O id deve ser preenchido.")
			Integer id){
		return new ResponseEntity<>(null, HttpStatus.CONTINUE);
	}
	
	@GetMapping("/dto/{id}")
	@Operation(summary = "Listar um Produto pelo ID através de DTO.")
	public ResponseEntity<ProdutoDTO> findProdutoDTOById(@PathVariable Integer id) {
		ProdutoDTO produtoDTO = produtoService.findProdutoDTOById(id);
		return new ResponseEntity<>(produtoDTO, HttpStatus.OK);
	}

	@PostMapping
	@Operation(summary = "Atualizar um Produto.")
	public ResponseEntity<Produto> saveProduto(@Valid @RequestBody Produto produto) {
		Produto novoProduto = produtoService.saveProduto(produto);
		return new ResponseEntity<>(novoProduto, HttpStatus.CREATED);
	}
	
	@PostMapping("/dto")
	@Operation(summary = "Atualizar um Produto.")
	public ResponseEntity<ProdutoDTO> saveProdutoDTO(@Validated @RequestBody ProdutoDTO produtoDTO) {
		ProdutoDTO novoProdutoDTO = produtoService.saveProdutoDTO(produtoDTO);
		return new ResponseEntity<>(novoProdutoDTO, HttpStatus.CREATED);
	}

	@PutMapping
	public ResponseEntity<Produto> updateProduto(@Validated @RequestBody Produto produto) {
		Produto novoProduto = produtoService.updateProduto(produto);
		return new ResponseEntity<>(novoProduto, HttpStatus.OK);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteProduto(@PathVariable Integer id) {
		if (null == produtoService.findByIdProduto(id))
			return new ResponseEntity<>("nao existe esse id", HttpStatus.NOT_FOUND);

		produtoService.deleteProduto(id);
		return new ResponseEntity<>("", HttpStatus.OK);
	}
}
