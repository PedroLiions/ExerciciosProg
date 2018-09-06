create database Paises;
use paises;
CREATE TABLE Pais(
	id INT(11) UNSIGNED NOT NULL AUTO_INCREMENT,
    nome VARCHAR(100) NOT NULL,
    populacao BIGINT(11) NOT NULL,
    area NUMERIC(15, 2) NOT NULL,
    
    PRIMARY KEY(id)
); 