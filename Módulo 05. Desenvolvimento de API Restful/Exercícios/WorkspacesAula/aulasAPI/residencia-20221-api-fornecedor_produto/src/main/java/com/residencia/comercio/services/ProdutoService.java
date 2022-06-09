package com.residencia.comercio.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.residencia.comercio.dtos.CategoriaDTO;
import com.residencia.comercio.dtos.FornecedorDTO;
import com.residencia.comercio.dtos.ProdutoDTO;
import com.residencia.comercio.entities.Categoria;
import com.residencia.comercio.entities.Fornecedor;
import com.residencia.comercio.entities.Produto;
import com.residencia.comercio.repositories.ProdutoRepository;

@Service
public class ProdutoService {

	@Autowired
	ProdutoRepository produtoRepository;
	
	@Autowired
	CategoriaService categoriaService;
	
	@Autowired
	FornecedorService fornecedorService;

	public List<Produto> findAllProduto() {
		return produtoRepository.findAll();
	}

	public Produto findByIdProduto(Integer id) {
		return produtoRepository.findById(id).isPresent() ? produtoRepository.findById(id).get() : null;
	}

	public ProdutoDTO findProdutoDTOById(Integer id) {
		Produto produto = produtoRepository.findById(id).isPresent() ? produtoRepository.findById(id).get() : null;

		ProdutoDTO produtoDTO = new ProdutoDTO();
		if (null != produto) {
			produtoDTO = converterEntidadeParaDto(produto);
		}
		return produtoDTO;
	}

	public Produto saveProduto(Produto produto) {
		return produtoRepository.save(produto);
	}
	
	public ProdutoDTO saveProdutoDTO(ProdutoDTO produtoDTO) {
		Produto produto = convertDTOToEntidade(produtoDTO);
		Produto produtoNovo = produtoRepository.save(produto);
		return converterEntidadeParaDto(produtoNovo);
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
	
	private Produto convertDTOToEntidade(ProdutoDTO produtoDTO) {
		
		Produto produto = new Produto();

		produto.setIdProduto(produtoDTO.getIdProduto());
		produto.setNomeProduto(produtoDTO.getNomeProduto());
		produto.setSku(produtoDTO.getSku());
		Categoria categoria = categoriaService.findCategoriaById(produtoDTO.getCategoriaDTO().getIdCategoria());
		produto.setCategoria(categoria);
		Fornecedor fornecedor = fornecedorService.findFornecedorById(produtoDTO.getFornecedorDTO().getIdFornecedor());
		produto.setFornecedor(fornecedor);

		return produto;
	}

	private ProdutoDTO converterEntidadeParaDto(Produto produto) {
		
		ProdutoDTO produtoDTO = new ProdutoDTO();
		produtoDTO.setIdProduto(produto.getIdProduto());
		produtoDTO.setNomeProduto(produto.getNomeProduto());
		produtoDTO.setSku(produto.getSku());
		CategoriaDTO categoriaDTO = categoriaService.findCategoriaDTOById(produto.getCategoria().getIdCategoria());
		produtoDTO.setCategoriaDTO(categoriaDTO);
		FornecedorDTO fornecedorDTO = fornecedorService.findFornecedorDTOById(produto.getFornecedor().getIdFornecedor());
		produtoDTO.setFornecedorDTO(fornecedorDTO);

		return produtoDTO;
	}
}
