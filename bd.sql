drop database if exists pizzaria;
create database pizzaria;

use pizzaria;

-- Cliente: id, nome, cpf, data_nascimento, endereço(rua, numero, bairro, cidade, estado), telefone, email


create table if not exists cliente (

id int not null auto_increment primary key,
nome varchar(100) not null,
cpf varchar(14) not null,

);

insert into cliente values (null, 'Thainá');