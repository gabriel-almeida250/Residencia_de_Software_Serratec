create table produto (codigo_produto srial PRIMARY KEY,
					  nome varchar(30) UNIQUE NOT NULL,
					  descricao text,
					  preco numeric CHECK (preco > 0) NOT NULL,
					  quantidade_estoque SMALLINT DEFAULT 0);