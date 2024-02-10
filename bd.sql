drop database if exists pizzaria;
create database pizzaria;

use pizzaria;

-- Cliente: id, nome, cpf, sexo, endereço(rua, numero, bairro, cidade, uf), telefone, email

CREATE TABLE IF NOT EXISTS cliente (
    pk_id_cliente SERIAL PRIMARY KEY,
    cliente_nome VARCHAR(400) NOT NULL,
    cliente_cpf VARCHAR(14) NOT NULL UNIQUE,
    cliente_sexo VARCHAR(20) NOT NULL,
    cliente_rua VARCHAR(200) NOT NULL,
    cliente_numero VARCHAR(10) NOT NULL,
    cliente_bairro VARCHAR(100) NOT NULL,
    cliente_cidade VARCHAR(100) NOT NULL,
    cliente_uf CHAR(2) NOT NULL,
    cliente_telefone VARCHAR(15) NOT NULL UNIQUE,
    cliente_email VARCHAR(1000) NOT NULL UNIQUE
);

-- Funcionario: id, nome, cpf, data_nascimento, sexo, endereço(rua, numero, bairro, cidade, estado), telefone, email, salario, cargo, carga_horario_semanal, usuario, senha permissao(admin ou comum), atividade( Aitvo ou Inativo)

CREATE TABLE IF NOT EXISTS funcionario (
    pk_id_funcionario SERIAL PRIMARY KEY,
    funcionario_nome VARCHAR(300) NOT NULL,
    funcionario_cpf VARCHAR(14) NOT NULL UNIQUE,
    funcionario_data_nascimento VARCHAR(9) NOT NULL,
    funcionario_sexo VARCHAR(20) NOT NULL,
    funcionario_rua VARCHAR(200) NOT NULL,
    funcionario_numero VARCHAR(10) NOT NULL,
    funcionario_bairro VARCHAR(100) NOT NULL,
    funcionario_cidade VARCHAR(100) NOT NULL,
    funcionario_uf CHAR(2) NOT NULL,
    funcionario_telefone VARCHAR(15) NOT NULL UNIQUE,
    funcionario_email VARCHAR(1000) NOT NULL UNIQUE,
    funcionario_salario DOUBLE(10,2) NOT NULL,
    funcionario_cargo VARCHAR(50) NOT NULL,
    funcionario_carga_horaria_semanal INT(2) NOT NULL,
    funcionario_usuario VARCHAR(100) NOT NULL UNIQUE,
    funcionario_senha VARCHAR(20) NOT NULL UNIQUE,
    funcionario_permissao VARCHAR(5) NOT NULL,
    funcionario_atividade VARCHAR(8) NOT NULL
);

-- Fornecedor: id, nome_empresa, cnpj, endereço(rua, numero, bairro, cidade, estado, pais), telefone, email

CREATE TABLE if not exists fornecedor (
    pk_id_fornecedor SERIAL PRIMARY KEY,
    fornecedor_nome_empresa VARCHAR(500) NOT NULL,
    fornecedor_cnpj VARCHAR(16) NOT NULL UNIQUE,
    funcionario_rua VARCHAR(200) NOT NULL,
    fornecedor_numero VARCHAR(10) NOT NULL,
    fornecedor_bairro VARCHAR(100) NOT NULL,
    fornecedor_cidade VARCHAR(100) NOT NULL,
    fornecedor_uf CHAR(2) NOT NULL,
    fornecedor_pais VARCHAR(50) NOT NULL,
    fornecedor_telefone VARCHAR(15) NOT NULL UNIQUE,
    fornecedor_email VARCHAR(1000) NOT NULL UNIQUE
);

-- Categoria: id, desc(pizza, bebida e doce)

CREATE TABLE IF NOT EXISTS categoria (
    pk_id_categoria SERIAL PRIMARY KEY,
    categoria_descricao VARCHAR(20) NOT NULL
);

-- Produto: id, nome, preço, quant, id_categoria, id_fornecedor

CREATE TABLE produto (
    pk_id_produto SERIAL PRIMARY KEY,
    produto_nome VARCHAR(100) NOT NULL,
    produto_preco DOUBLE(7,2) NOT NULL,
    produto_quantidade INT NOT NULL,
    fk_categoria BIGINT UNSIGNED NOT NULL,
    fk_fornecedor BIGINT UNSIGNED NOT NULL,
    FOREIGN KEY (fk_categoria)
        REFERENCES categoria (pk_id_categoria),
    FOREIGN KEY (fk_fornecedor)
        REFERENCES fornecedor (pk_id_fornecedor)
);

-- Pedido: id, id_cliente, id_funcionario, data, desconto, forma_pagamento, total

CREATE TABLE pedido (
    pk_id_pedido SERIAL PRIMARY KEY,
    fk_cliente BIGINT UNSIGNED NOT NULL,
    fk_funcionario BIGINT UNSIGNED NOT NULL,
    pedido_data DATE NOT NULL,
    pedido_forma_pagamento VARCHAR(20) NOT NULL,
    pedido_desconto DOUBLE(5 , 2 ) NOT NULL,
    pedido_valor_liquido DOUBLE(10 , 2 ) NOT NULL,
    pedido_valor_total DOUBLE(10 , 2 ) NOT NULL,
    FOREIGN KEY (fk_cliente)
        REFERENCES cliente (pk_id_cliente),
    FOREIGN KEY (fk_funcionario)
        REFERENCES funcionario (pk_id_funcionario)
);

-- Item_Pedido: id, id_pedido, id_produto, data, quant, precoun, desconto, valortotal


CREATE TABLE item_pedido (
    pk_id_item_pedido SERIAL PRIMARY KEY,
    fk_pedido BIGINT UNSIGNED NOT NULL,
    fk_produto BIGINT UNSIGNED NOT NULL,
    item_pedido_data DATE NOT NULL,
    item_pedido_quantidade INT NOT NULL,
    item_pedido_preco_un DOUBLE(7 , 2 ) NOT NULL,
    item_pedido_desconto DOUBLE(5 , 2 ) NOT NULL,
    item_pedido_valor_liquido DOUBLE(10 , 2 ) NOT NULL,
    item_pedido_valor_total DOUBLE(10 , 2 ) NOT NULL,
    FOREIGN KEY (fk_pedido)
        REFERENCES pedido (pk_id_pedido),
    FOREIGN KEY (fk_produto)
        REFERENCES produto (pk_id_produto)
);





