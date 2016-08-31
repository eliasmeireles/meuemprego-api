INSERT INTO estado (nome) VALUES 
('Acre'), ('Alagoas'), ('Amapá'), ('Amazonas'), ('Bahia'), ('Ceará'), 
('Federal'), ('Santo'), ('Goiás'), ('Maranhão'), ('Mato Grosso'), 
('Minas Gerais'), ('Pará'), ('Paraíba'), ('Paraná'), ('Pernambuco'), 
('Piauí'), ('Rio de Janeiro'), ('Rio Grande do Norte'), ('Rio Grande do Sul'), 
('Rondônia'), ('Roraima'), ('Santa Catarina'), ('São Paulo'), ('Sergipe'), ('Tocantins');

INSERT INTO endereco(id, cep, logradouro, numero, complemento, bairro, cidade, estado_id) VALUES
('43884929-4854-48d6-88ef-9d279fcb5e61', '31.950-50', 'Rua Manoel Luiz de Abreu',
'149', 'Casa', 'Goiânia', 'Belo Horizonte', 12);

INSERT INTO usuario(id, nome, email, data_cadastro, salt, senha, endereco_id) VALUES
('46c24864-ffaa-44ef-8307-7b48cfe5ff72', 'Elias Meireles Ferreira', 'eliasmflilico@gmail.com', '2016-08-12',
'4MW:_E\;;jzzogC9;sNe#,5c>k-8iqfc+:UCKFe0>,_9t:J=,q',
'114431f27ac9c6211d5b505f5e6a3415397452723b4a51327fd1692b37b0ebccab19df26b7426f7725dec4d506b65ba7', '43884929-4854-48d6-88ef-9d279fcb5e61');

INSERT INTO endereco(id, cep, logradouro, numero, complemento, bairro, cidade, estado_id) VALUES
('43884929-48sf-48d6-88ef-9d279fcb5e61', '31.950-50', 'Avenida Afonso Pena',
'1236', 'Apartamento', 'Funcionario', 'Belo Horizonte', 12);

INSERT INTO empresa(id, nome, cnpj, usuario_id, endereco_id) VALUES
('46c24864-ffaa-44ef-8307-7b48cfe5ff72', 'System Plus', '67.346.113/0001-14', '46c24864-ffaa-44ef-8307-7b48cfe5ff72', '43884929-48sf-48d6-88ef-9d279fcb5e61');

/*INSERT INTO curriculo(id, estado_civil, celular, telefone_residencial, objetivo, usuario_id) VALUES
('43884929-4854-48d6-88ef-9d279fcb5e64', 'Solterio', '(31)99999-9999', '(31)3333-3333', 'Java Developer', '46c24864-ffaa-44ef-8307-7b48cfe5ff72');

INSERT INTO curriculo_experiencia(curriculo_id, data_inicio, data_fim, empresa) VALUES 
('43884929-4854-48d6-88ef-9d279fcb5e64', '2002-01-01', '2008-05-09', 'System Plus');

INSERT INTO curriculo_experiencia(curriculo_id, data_inicio, data_fim, empresa) VALUES 
('43884929-4854-48d6-88ef-9d279fcb5e64', '2009-01-01', '2012-05-09', 'System PUp');*/