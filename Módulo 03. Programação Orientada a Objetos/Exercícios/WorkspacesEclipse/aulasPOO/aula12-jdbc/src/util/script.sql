create table cliente(codigo serial primary key, 
					 nome vachar(50),
					 telefone varchar(11),
					 email varchar(30));

insert into cliente (nome, telefone, email)values("João", "22541000","joao@gamail.com")
insert into cliente (nome, telefone, email)values ("Maria", "22485027", "maria@gmail.com");
