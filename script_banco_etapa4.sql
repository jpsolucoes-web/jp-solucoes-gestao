-- Projeto: JP Soluções 
-- Script Estrutural e de Povoamento (Etapa 4)

CREATE DATABASE IF NOT EXISTS banco_jp_solucoes;
USE banco_jp_solucoes;

CREATE TABLE contratos (
    id_contrato INT AUTO_INCREMENT PRIMARY KEY,
    nome_cliente VARCHAR(100) NOT NULL,
    bacen VARCHAR(50) NOT NULL,
    rating VARCHAR(50) NOT NULL,
    valor_contrato DECIMAL(10, 2) NOT NULL
);

-- Povoamento Inicial Obrigatório (DML)
INSERT INTO contratos (nome_cliente, bacen, rating, valor_contrato) VALUES 
('Adriano Martins', 'Baixado', 'AA', 12000.00),
('Comercial Agricola CCPRAN', 'Ativo - Jud', 'AAA', 1090000.00),
('Neguinho Terraplenagem', 'Baixado', 'A', 2995.00),
('Larissa Alves do Amaral', 'Ativo - Adm', 'BBB', 7075.00);