DROP DATABASE IF EXISTS meu_emprego_esta_aqui;
CREATE DATABASE meu_emprego_esta_aqui;
USE meu_emprego_esta_aqui;


CREATE TABLE estado(
	id INT NOT NULL AUTO_INCREMENT UNIQUE,
    nome VARCHAR(50) NOT NULL UNIQUE
);

ALTER TABLE estado ADD CONSTRAINT pk_estados PRIMARY KEY (id);

CREATE TABLE endereco(
	id CHAR(36) UNIQUE NOT NULL,
    cep CHAR(9) NOT NULL,
    logradouro VARCHAR(150) NOT NULL,
    numero CHAR(50) NOT NULL,
	complemento CHAR(50),
    bairro VARCHAR(100) NOT NULL,
    cidade VARCHAR(100) NOT NULL,
    estado_id INT NOT NULL
);

ALTER TABLE endereco ADD CONSTRAINT pk_endereco PRIMARY KEY (id);
ALTER TABLE endereco ADD CONSTRAINT fk_endereco_estado_id FOREIGN KEY(estado_id) REFERENCES estado(id);

CREATE TABLE usuario(
	id CHAR(36) UNIQUE NOT NULL,
	nome VARCHAR(150) NOT NULL,
	email VARCHAR(150) UNIQUE NOT NULL,
    data_cadastro DATE NOT NULL,
	data_de_atualizacao DATE,
	salt char(50) not null,
	token char(96),
	senha varchar(96) NOT NULL,
	endereco_id CHAR(36) NOT NULL
);

ALTER TABLE usuario ADD CONSTRAINT pk_usuario PRIMARY KEY (id);
ALTER TABLE usuario ADD CONSTRAINT fk_usuario_endereco_id FOREIGN KEY (endereco_id) REFERENCES endereco(id);

CREATE TABLE empresa(
	id CHAR(36) UNIQUE NOT NULL,
	nome VARCHAR(150) NOT NULL,
	cnpj CHAR(18) UNIQUE NOT NULL,
    data_cadastro DATE,
	usuario_id CHAR(36) NOT NULL,
	endereco_id CHAR(36) NOT NULL
);

ALTER TABLE empresa ADD CONSTRAINT pk_empresa PRIMARY KEY (id);
ALTER TABLE empresa ADD CONSTRAINT fk_empresa_usuario_id FOREIGN KEY(usuario_id) REFERENCES usuario(id);
ALTER TABLE empresa ADD CONSTRAINT fk_empresa_endereco_id FOREIGN KEY(endereco_id) REFERENCES endereco(id);


CREATE TABLE curriculo (
	id CHAR(36) UNIQUE NOT NULL,
	estado_civil CHAR(30) NOT NULL,
	celular CHAR(14),
	telefone_residencial CHAR(13),
	objetivo VARCHAR(100),
    data_cadastro DATE,
    data_de_atualizacao DATE,
	usuario_id CHAR(36) UNIQUE NOT NULL
);

ALTER TABLE curriculo ADD CONSTRAINT pk_curriculo PRIMARY KEY (id);
ALTER TABLE curriculo ADD CONSTRAINT fk_curriculo_usuario_id FOREIGN KEY (usuario_id) REFERENCES usuario(id);

CREATE TABLE sobre_mim (
	id CHAR(36) UNIQUE NOT NULL,
	usuario_id CHAR(36) UNIQUE,
	sobre_mim TEXT CHARACTER SET latin1 COLLATE latin1_general_cs
);

ALTER TABLE sobre_mim ADD CONSTRAINT pk_sobre_mim PRIMARY KEY (id);
ALTER TABLE sobre_mim ADD CONSTRAINT fk_sobre_mim_usuario_id FOREIGN KEY (usuario_id) REFERENCES usuario(id);

CREATE TABLE curriculo_experiencia(
	curriculo_id CHAR(36) NOT NULL,
	data_inicio DATE NOT NULL,
	data_fim DATE NOT NULL,
	funcao VARCHAR(100) NOT NULL,
	empresa VARCHAR(100) NOT NULL
);

ALTER TABLE curriculo_experiencia ADD CONSTRAINT fk_curriculo_experiencia_curriculo_id FOREIGN KEY(curriculo_id) REFERENCES curriculo(id);

CREATE TABLE curriculo_formacao(
	curriculo_id CHAR(36) NOT NULL,
	formacao CHAR(100) NOT NULL,
	instituicao CHAR(100) NOT NULL,
	data_inicio DATE NOT NULL,
	data_fim DATE NOT NULL
);

ALTER TABLE curriculo_formacao ADD CONSTRAINT fk_curriculo_formacao_curriculo_id FOREIGN KEY(curriculo_id) REFERENCES curriculo(id);

CREATE TABLE curriculo_informacoes_adicionais(
	curriculo_id CHAR(36) NOT NULL,
	conhecimento VARCHAR(100) NOT NULL
);

ALTER TABLE curriculo_informacoes_adicionais ADD CONSTRAINT fk_curriculo_informacoes_adicionais_curriculo_id FOREIGN KEY(curriculo_id) REFERENCES curriculo(id);
