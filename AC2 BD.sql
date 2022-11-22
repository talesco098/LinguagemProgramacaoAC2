drop database if exists AC2;
create database AC2;
use AC2;

create table cadastro(
	id			int				primary key 	auto_increment,
	cpf			varchar(60),
    nome		varchar(60),
    telefone	varchar(60),
    cidade		varchar(60),
    uf			varchar(60),
    email		varchar(60)
);

INSERT INTO cadastro (id,cpf,nome,telefone,cidade,uf,email) VALUES 
	(null,"50398831882","Guilherme","15988111419","Sorocaba","SP","guilherme.garciaortega@gmail.com");
    
SELECT nome, telefone, cidade, uf, email FROM cadastro WHERE cpf = 123456;