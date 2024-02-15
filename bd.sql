drop database if exists donnapizza;
create database donnapizza;

use donnapizza;

-- Cliente: id, nome, cpf, sexo, endereço(rua, numero, bairro, cidade, uf), telefone, email

CREATE TABLE IF NOT EXISTS cliente (
    pk_id_cliente SERIAL PRIMARY KEY,
    nome VARCHAR(400) NOT NULL,
    cpf VARCHAR(14) NOT NULL UNIQUE,
    sexo VARCHAR(20) NOT NULL,
    rua VARCHAR(200) NOT NULL,
    numero VARCHAR(10) NOT NULL,
    bairro VARCHAR(100) NOT NULL,
    cidade VARCHAR(100) NOT NULL,
    uf CHAR(2) NOT NULL,
    telefone VARCHAR(15) NOT NULL UNIQUE,
    email VARCHAR(1000) NOT NULL UNIQUE
);

INSERT INTO cliente (nome, cpf, sexo, rua, numero, bairro, cidade, uf, telefone, email) 
VALUES ('João Silva', '123.456.780-10', 'Masculino', 'Rua das Flores', '123', 'Centro', 'São Paulo', 'SP', '(11) 90234-5678', 'joao.siilva@example.com'),
       ('Maria Souza', '987.654.321-00', 'Feminino', 'Avenida Principal', '456', 'Bela Vista', 'Rio de Janeiro', 'RJ', '(21) 98765-4321', 'maria.souza@example.com'),
       ('Pedro Oliveira', '456.789.123-20', 'Masculino', 'Rua das Palmeiras', '789', 'Jardim América', 'Belo Horizonte', 'MG', '(31) 87654-3210', 'pedro.oliveira@example.com'),
       ('Ana Santos', '159.357.852-30', 'Feminino', 'Rua da Praia', '321', 'Copacabana', 'Rio de Janeiro', 'RJ', '(21) 87654-1234', 'ana.santos@example.com'),
       ('Carlos Ferreira', '753.951.846-40', 'Masculino', 'Avenida Central', '654', 'Centro', 'São Paulo', 'SP', '(11) 76543-2109', 'carlos.ferreira@example.com'),
       ('Fernanda Costa', '369.258.147-50', 'Feminino', 'Rua das Pedras', '987', 'Laranjeiras', 'Rio de Janeiro', 'RJ', '(21) 65432-1098', 'fernanda.costa@example.com'),
       ('Lucas Pereira', '852.147.963-60', 'Masculino', 'Avenida da Liberdade', '741', 'Barra da Tijuca', 'Rio de Janeiro', 'RJ', '(21) 54321-0987', 'lucas.pereira@example.com'),
       ('Mariana Oliveira', '753.159.852-70', 'Feminino', 'Rua do Comércio', '852', 'Centro', 'São Paulo', 'SP', '(11) 43210-9876', 'mariana.oliveira@example.com'),
       ('Gustavo Rodrigues', '369.852.741-80', 'Masculino', 'Avenida Paulista', '963', 'Bela Vista', 'São Paulo', 'SP', '(11) 32109-8765', 'gustavo.rodrigues@example.com'),
       ('Laura Lima', '456.789.123-90', 'Feminino', 'Rua das Flores', '258', 'Jardim Botânico', 'Rio de Janeiro', 'RJ', '(21) 21098-7654', 'laura.lima@example.com');


-- Funcionario: id, nome, cpf, data_nascimento, sexo, endereço(rua, numero, bairro, cidade, estado), telefone, email, salario, cargo, carga_horario_semanal, usuario, senha permissao(Adminin ou comum), atividade( Aitvo ou Inativo)

CREATE TABLE IF NOT EXISTS funcionario (
    pk_id_funcionario SERIAL PRIMARY KEY,
    nome VARCHAR(300) NOT NULL,
    cpf VARCHAR(14) NOT NULL UNIQUE,
    data_nascimento DATE NOT NULL,
    sexo VARCHAR(20) NOT NULL,
    rua VARCHAR(200) NOT NULL,
    numero VARCHAR(10) NOT NULL,
    bairro VARCHAR(100) NOT NULL,
    cidade VARCHAR(100) NOT NULL,
    uf CHAR(2) NOT NULL,
    telefone VARCHAR(15) NOT NULL UNIQUE,
    email VARCHAR(1000) NOT NULL UNIQUE,
    salario DOUBLE(10 , 2 ) NOT NULL,
    cargo VARCHAR(50) NOT NULL,
    carga_horaria_semanal INT(2) NOT NULL,
    usuario VARCHAR(100) NOT NULL UNIQUE,
    senha VARCHAR(20) NOT NULL UNIQUE,
    permissao VARCHAR(5) NOT NULL,
    atividade VARCHAR(8) NOT NULL
);

INSERT INTO funcionario (nome, cpf, data_nascimento, sexo, rua, numero, bairro, cidade, uf, telefone, email, salario, cargo, carga_horaria_semanal, usuario, senha, permissao, atividade)  
VALUES  
('Julia Dias', '999-089-092-10', '2006-04-03', 'Feminino', 'Rua verdes', '198', 'Alvorada', 'Pedra Azul', 'MG', '(22) 99822-0989', 'juliadias@gmail.com', 6000.00, 'Admininistrador', 50, 'admin', 'admin', 'Alto', 'Ativo'),
('Carlos Oliveira', '123.456.789-11', '1990-05-15', 'Masculino', 'Rua dos Funcionários', '101', 'Centro', 'São Paulo', 'SP', '(11) 91234-5678', 'carlos.oliveira@example.com', 3000.00, 'Atendente', 40, 'carlos', 'senha103', 'Médio', 'Ativo'),  
('Ana Souza', '987.654.321-12', '1985-08-20', 'Feminino', 'Avenida Principal', '202', 'Bela Vista', 'Rio de Janeiro', 'RJ', '(21) 98765-4321', 'ana.souza@example.com', 3500.00, 'Cozinheiro', 35, 'ana', 'senha56', 'Baixo', 'Ativo'),  
('Pedro Santos', '456.789.123-23', '1988-02-10', 'Masculino', 'Rua das Palmeiras', '303', 'Jardim América', 'Belo Horizonte', 'MG', '(31) 87654-3210', 'pedro.santos@example.com', 2800.00, 'Entregador', 38, 'pedro', 'senha789', 'Baixo', 'Ativo'),  
('Mariana Silva', '159.357.852-34', '1992-11-25', 'Feminino', 'Rua da Praia', '404', 'Copacabana', 'Rio de Janeiro', 'RJ', '(21) 87654-1234', 'mariana.silva@example.com', 3200.00, 'Gerente', 42, 'mariana', 'senhaabc', 'Alto', 'Ativo'),  
('João Pereira', '753.951.846-45', '1983-07-30', 'Masculino', 'Avenida Central', '505', 'Centro', 'São Paulo', 'SP', '(11) 76543-2109', 'joao.pereira@example.com', 3800.00, 'Cozinheiro', 40, 'joao', 'senha456', 'Baixo', 'Ativo'),  
('Fernanda Costa', '369.258.147-56', '1995-04-12', 'Feminino', 'Rua das Pedras', '606', 'Laranjeiras', 'Rio de Janeiro', 'RJ', '(21) 65432-1098', 'fernanda.costa@example.com', 3000.00, 'Entregador', 40, 'fernanda', 'senha709', 'Baixo', 'Ativo'),  
('Lucas Oliveira', '852.147.963-67', '1987-09-05', 'Masculino', 'Avenida da Liberdade', '707', 'Barra da Tijuca', 'Rio de Janeiro', 'RJ', '(21) 54321-0987', 'lucas.oliveira@example.com', 3200.00, 'Cozinheiro', 35, 'lucas', 'senha123', 'Baixo', 'Ativo'),  
('Camila Fernandes', '753.159.852-78', '1990-12-18', 'Feminino', 'Rua do Comércio', '808', 'Centro', 'São Paulo', 'SP', '(11) 43210-9876', 'camila.fernandes@example.com', 3500.00, 'Atendente', 38, 'camila', 'senhabc', 'Médio', 'Ativo'),  
('Gustavo Rodrigues', '369.852.741-89', '1982-03-28', 'Masculino', 'Avenida Paulista', '909', 'Bela Vista', 'São Paulo', 'SP', '(11) 32109-8765', 'gustavo.rodrigues@example.com', 4000.00, 'Gerente', 42, 'gustavo', 'senha79', 'Alto', 'Ativo'),  
('Laura Lima', '456.789.123-90', '1989-06-22', 'Feminino', 'Rua das Flores', '1010', 'Jardim Botânico', 'Rio de Janeiro', 'RJ', '(21) 21098-7654', 'laura.lima@example.com', 3300.00, 'Atendente', 40, 'laura', 'senha13', 'Médio', 'Ativo');


-- Fornecedor: id, nome_empresa, cnpj, endereço(rua, numero, bairro, cidade, estado, pais), telefone, email

CREATE TABLE IF NOT EXISTS fornecedor (
    pk_id_fornecedor SERIAL PRIMARY KEY,
    nome_empresa VARCHAR(500) NOT NULL,
    cnpj VARCHAR(16) NOT NULL UNIQUE,
    rua VARCHAR(200) NOT NULL,
    numero VARCHAR(10) NOT NULL,
    bairro VARCHAR(100) NOT NULL,
    cidade VARCHAR(100) NOT NULL,
    uf CHAR(2) NOT NULL DEFAULT 'XX',
    pais VARCHAR(50) NOT NULL,
    telefone VARCHAR(15) NOT NULL UNIQUE,
    email VARCHAR(1000) NOT NULL UNIQUE
);

INSERT INTO fornecedor (nome_empresa, cnpj, rua, numero, bairro, cidade, uf, pais, telefone, email) 
VALUES 
('Sabor Natural Alimentos Ltda', '12345678901234', 'Rua das Flores', '123', 'Centro', 'São Paulo', 'SP', 'Brasil', '(11) 91234-5678', 'contato@sabornatural.com'),
('Verde Vivo Alimentos S.A.', '98765432109876', 'Avenida Principal', '456', 'Bela Vista', 'Rio de Janeiro', 'RJ', 'Brasil', '(21) 98765-4321', 'contato@verdevivo.com'),
('Feliz Sabor Distribuidora de Alimentos', '45678901234567', 'Rua das Palmeiras', '789', 'Jardim América', 'Belo Horizonte', 'MG', 'Brasil', '(31) 87654-3210', 'contato@felizsabor.com'),
('Elite Gourmet Alimentos', '15935785236914', 'Rua da Praia', '321', 'Copacabana', 'Rio de Janeiro', 'RJ', 'Brasil', '(21) 87654-1234', 'contato@elitegourmet.com'),
('Alimentos Globais Inc.', '75395184630456', 'Avenida Central', '654', 'Centro', 'São Paulo', 'SP', 'Brasil', '(11) 76543-2109', 'contato@alimentosglobais.com'),
('Natureza Saudável Comércio de Alimentos', '36925814759682', 'Rua das Pedras', '987', 'Laranjeiras', 'Rio de Janeiro', 'RJ', 'Brasil', '(21) 65432-1098', 'contato@naturezasaudavel.com'),
('Mundo Gourmet Alimentos', '85214796374859', 'Avenida da Liberdade', '741', 'Barra da Tijuca', 'Rio de Janeiro', 'RJ', 'Brasil', '(21) 54321-0987', 'contato@mundogourmet.com'),
('Colheita Dourada Exportadora de Alimentos', '75315985236914', 'Rua do Comércio', '852', 'Centro', 'São Paulo', 'SP', 'Brasil', '(11) 43210-9876', 'contato@colheitadourada.com'),
('Delícias do Campo Alimentos', '36985274159682', 'Avenida Paulista', '963', 'Bela Vista', 'São Paulo', 'SP', 'Brasil', '(11) 32109-8765', 'contato@deliciasdocampo.com'),
('Terra Fértil Agrícola de Alimentos', '45678912374859', 'Rua das Flores', '258', 'Jardim Botânico', 'Rio de Janeiro', 'RJ', 'Brasil', '(21) 21098-7654', 'contato@terrafertil.com'),
('Nourishing Nature Inc.', '12345608901234', '123 Flower Street', '123', 'Downtown', 'Nova Iorque', 'NY', 'Estados Unidos', '(212) 555-1234', 'contact@nourishingnature.com'),
('GreenLife Foods International', '68765432109876', '456 Main Avenue', '456', 'Downtown', 'Toronto', 'ON', 'Canadá', '(416) 555-5678', 'info@greenlifefoods.com'),
('Happy Harvest Enterprises', '45676901234567', '789 Palm Road', '789', 'Downtown', 'Sydney', NULL, 'Austrália', '(02) 5555-4321', 'info@happyharvest.com'),
('Elite Eats Global', '15935785236934', '321 Beach Boulevard', '321', 'Downtown', 'Los Angeles', 'CA', 'Estados Unidos', '(213) 555-9876', 'info@eliteeats.com'),
('Global Delights Trading Co.', '75595184630456', '654 Central Avenue', '654', 'Downtown', 'Londres', NULL, 'Reino Unido', '(020) 5555-6789', 'info@globaldelights.com'),
('Healthy Planet Imports', '36925813759682', '987 Stone Street', '987', 'Downtown', 'Vancouver', 'BC', 'Canadá', '(604) 555-5432', 'info@healthyplanetimports.com'),
('Worldwide Gourmet Foods', '85214726374859', '741 Liberty Road', '741', 'Downtown', 'Paris', NULL, 'França', '(01) 55-5555-2109', 'info@worldwidegourmet.com'),
('Golden Fields Exports', '75315985636914', '852 Commerce Avenue', '852', 'Downtown', 'Berlim', NULL, 'Alemanha', '(030) 5555-9876', 'info@goldenfields.com'),
('Luxury Taste Culinary', '36985274059682', '963 Park Lane', '963', 'Downtown', 'Tóquio', NULL, 'Japão', '(03) 5555-1098', 'info@luxurytaste.com'),
('Green Valley Agriculture', '45678512374859', '258 Flower Road', '258', 'Downtown', 'Auckland', NULL, 'Nova Zelândia', '(09) 5555-8765', 'info@greenvalleyagriculture.com');


-- Categoria: id, desc(pizza, bebida e doce)

CREATE TABLE IF NOT EXISTS categoria (
    pk_id_categoria SERIAL PRIMARY KEY,
    descricao VARCHAR(20) NOT NULL
);

insert into categoria (descricao)
values 
('Bebida'),
('Doce'),
('Pizza');


-- Produto: id, nome, preço, quant, id_categoria, id_fornecedor

CREATE TABLE produto (
    pk_id_produto SERIAL PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    preco DOUBLE(7,2) NOT NULL,
    quantidade INT NOT NULL,
    fk_categoria BIGINT UNSIGNED NOT NULL,
    fk_fornecedor BIGINT UNSIGNED NOT NULL,
    FOREIGN KEY (fk_categoria)
        REFERENCES categoria (pk_id_categoria),
    FOREIGN KEY (fk_fornecedor)
        REFERENCES fornecedor (pk_id_fornecedor)
);

INSERT INTO produto (nome, preco, quantidade, fk_categoria, fk_fornecedor) 
VALUES 
('Pizza Margherita', 29.99, 50, 3, 1),
('Coca-Cola 2L', 7.99, 100, 1, 2),
('Brigadeiro', 2.50, 60, 2, 3),
('Pizza Vegetariana', 30.99, 30, 3, 4),
('Fanta Laranja 2L', 6.49, 80, 1, 5),
('Bolo de Chocolate', 25.99, 20, 2, 6),
('Pizza Pepperoni', 31.99, 40, 3, 7),
('Guaraná Antarctica 2L', 6.99, 90, 1, 8),
('Beijinho', 2.25, 65, 2, 9),
('Pizza Frango com Catupiry', 33.99, 25, 3, 10),
('Refrigerante Guaraná 2L', 6.99, 75, 1, 11),
('Bolo de Morango', 27.99, 18, 2, 12),
('Pizza Quatro Queijos', 32.99, 35, 3, 13),
('Sprite 2L', 6.49, 85, 1, 14),
('Bombom de Morango', 3.75, 70, 2, 15),
('Pizza Portuguesa', 34.99, 22, 3, 16),
('Água Tônica 500ml', 3.49, 110, 1, 17),
('Cajuzinho', 2.25, 70, 2, 18),
('Pizza Doce de Leite', 38.99, 12, 3, 19),
('Água Mineral 500ml', 2.49, 120, 1, 20);

-- Compra: id, id_fornecedor, id_funcionario, data, desconto, forma_pagamento, valor_liquido, valor_bruto

CREATE TABLE compra (
    pk_id_compra SERIAL PRIMARY KEY,
    fk_fornecedor BIGINT UNSIGNED NOT NULL,
    fk_funcionario BIGINT UNSIGNED NOT NULL,
    data DATE NOT NULL,
    forma_pagamento VARCHAR(20) NOT NULL,
    desconto DOUBLE(5 , 2 ) NOT NULL,
    valor_liquido DOUBLE(10 , 2 ) UNSIGNED NOT NULL,
    valor_bruto DOUBLE(10 , 2 ) UNSIGNED NOT NULL,
    FOREIGN KEY (fk_fornecedor)
        REFERENCES fornecedor (pk_id_fornecedor),
    FOREIGN KEY (fk_funcionario)
        REFERENCES funcionario (pk_id_funcionario)
);

INSERT INTO compra (fk_fornecedor, fk_funcionario, data, forma_pagamento, desconto, valor_liquido, valor_bruto) 
VALUES 
(1, 1, '2024-02-10', 'Cartão de crédito', 5.00, 95.00, 100.00),
(2, 2, '2024-02-11', 'Dinheiro', 0.00, 500.00, 500.00),
(3, 3, '2024-02-12', 'Cartão de Débito', 10.00, 900.00, 1000.00),
(4, 4, '2024-02-13', 'Dinheiro', 0.00, 200.00, 200.00),
(5, 5, '2024-02-14', 'Cartão de Débito', 2.50, 97.50, 100.00),
(6, 6, '2024-02-15', 'Dinheiro', 0.00, 750.00, 750.00),
(7, 7, '2024-02-16', 'Dinheiro', 20.00, 480.00, 500.00),
(8, 8, '2024-02-17', 'Cartão de crédito', 0.00, 150.00, 150.00),
(9, 9, '2024-02-18', 'Cartão de Débito', 15.00, 535.00, 550.00),
(10, 10, '2024-02-19', 'Dinheiro', 8.50, 191.50, 200.00);


-- Item_Compra: id, id_compra, id_produto, quant_produto, preco_custo, desconto, valor_bruto

CREATE TABLE item_compra (
    pk_id_compra SERIAL NOT NULL,
    fk_compra BIGINT UNSIGNED NOT NULL,
    fk_produto BIGINT UNSIGNED NOT NULL,
    data DATE NOT NULL,
    quantidade_produto INT UNSIGNED NOT NULL,
    preco_custo DOUBLE(7 , 2 ) NOT NULL,
    desconto DOUBLE(5 , 2 ) NOT NULL,
    valor_bruto DOUBLE(10 , 2 ) UNSIGNED NOT NULL,
    FOREIGN KEY (fk_compra)
        REFERENCES compra (pk_id_compra),
    FOREIGN KEY (fk_produto)
        REFERENCES produto (pk_id_produto)
);


INSERT INTO item_compra (fk_compra, fk_produto, quantidade_produto, preco_custo, desconto, valor_bruto)
VALUES 
(1, 1, 5, 10.00, 2.00, 50.00),
(2, 2, 3, 15.00, 1.50, 45.00),
(3, 3, 7, 8.00, 0.80,  72.00),
(4, 4, 1, 20.00, 3.00, 100.00),
(5, 5, 2, 5.00, 0.50,  10.00),
(6, 6, 4, 12.00, 2.00, 48.00),
(7, 7, 9, 6.00, 1.20,  96.00),
(8, 8, 8, 3.00, 0.00,  47.00),
(9, 9, 10, 7.00, 1.40, 50.00),
(10, 10, 2, 18.00, 3.00,  97.00);

-- Pedido: id, id_cliente, id_funcionario, data, desconto, forma_pagamento, valor_liquido, valor_bruto

CREATE TABLE pedido (
    pk_id_pedido SERIAL PRIMARY KEY,
    fk_cliente BIGINT UNSIGNED NOT NULL,
    fk_funcionario BIGINT UNSIGNED NOT NULL,
    data DATE NOT NULL,
    forma_pagamento VARCHAR(20) NOT NULL,
    desconto DOUBLE(5 , 2 ) NOT NULL,
    valor_liquido DOUBLE(10 , 2 ) UNSIGNED NOT NULL,
    valor_bruto DOUBLE(10 , 2 ) UNSIGNED NOT NULL,
    FOREIGN KEY (fk_cliente)
        REFERENCES cliente (pk_id_cliente),
    FOREIGN KEY (fk_funcionario)
        REFERENCES funcionario (pk_id_funcionario)
);

INSERT INTO pedido (fk_cliente, fk_funcionario, data, forma_pagamento, desconto, valor_liquido, valor_bruto) 
VALUES 
(1, 1, '2024-02-10', 'Cartão de Crédito', 5.00, 100.00, 95.00),
(2, 2, '2024-02-10', 'Dinheiro', 0.00, 50.00, 50.00),
(3, 3, '2024-02-10', 'Cartão de Débito', 2.50, 75.00, 72.50),
(4, 4, '2024-02-10', 'Cartão de Crédito', 10.00, 120.00, 110.00),
(5, 5, '2024-02-10', 'Dinheiro', 0.00, 80.00, 80.00),
(6, 6, '2024-02-10', 'Cartão de Débito', 3.00, 90.00, 87.00),
(7, 7, '2024-02-10', 'Cartão de Crédito', 7.50, 60.00, 52.50),
(8, 8, '2024-02-10', 'Dinheiro', 0.00, 45.00, 45.00),
(9, 9, '2024-02-10', 'Cartão de Débito', 4.00, 70.00, 66.00),
(10, 10, '2024-02-10', 'Cartão de Crédito', 8.00, 110.00, 102.00);


-- Item_Pedido: id, id_pedido, id_produto, data, quant, precoun, desconto, valor_bruto


CREATE TABLE item_pedido (
    pk_id_pedido SERIAL PRIMARY KEY,
    fk_pedido BIGINT UNSIGNED NOT NULL,
    fk_produto BIGINT UNSIGNED NOT NULL,
    data DATE NOT NULL,
    quantidade INT NOT NULL,
    preco_un DOUBLE(7 , 2 ) NOT NULL,
    desconto DOUBLE(5 , 2 ) NOT NULL,
    valor_bruto DOUBLE(10 , 2 ) NOT NULL,
    FOREIGN KEY (fk_pedido)
        REFERENCES pedido (pk_id_pedido),
    FOREIGN KEY (fk_produto)
        REFERENCES produto (pk_id_produto)
);

INSERT INTO item_pedido (fk_pedido, fk_produto, data, quantidade, preco_un, desconto, valor_bruto) 
VALUES 
(1, 1, '2024-02-10', 2, 14.99, 0.00, 29.98),
(2, 2, '2024-02-10', 1, 7.99, 0.00,  7.99),
(3, 3, '2024-02-10', 3, 2.50, 1.00, 22.50),
(4, 4, '2024-02-10', 1, 34.99, 5.00,  29.99),
(5, 5, '2024-02-10', 2, 2.49, 0.00, 4.98),
(6, 6, '2024-02-10', 1, 25.99, 0.00,  25.99),
(7, 7, '2024-02-10', 2, 31.99, 2.00, 60.98),
(8, 8, '2024-02-10', 1, 6.99, 0.00,  6.99),
(9, 9, '2024-02-10', 3, 2.25, 0.50,  6.75),
(10, 10, '2024-02-10', 1, 33.99, 3.00, 30.99);




