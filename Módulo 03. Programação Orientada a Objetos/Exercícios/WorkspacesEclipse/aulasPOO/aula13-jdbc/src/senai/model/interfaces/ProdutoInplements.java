package senai.model.interfaces;

import java.util.List;

import senai.model.Produto;

public interface ProdutoInplements extends CrudGenerico<Produto> {
	
	public List<Produto> buscarPorNome(String nome);
}
