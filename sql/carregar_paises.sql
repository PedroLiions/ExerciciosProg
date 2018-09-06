use Paises;

INSERT INTO Pais VALUES (1, 'China', 1372470000, 9596961);
INSERT INTO Pais VALUES (2, 'Russia', 146606730, 17098246);
INSERT INTO Pais VALUES (3, 'Brasil', 207660929, 8515767);
INSERT INTO Pais VALUES (4, 'India', 1278160000, 3287590);

SELECT *, MAX(populacao)
FROM Pais
GROUP BY id;

select id, nome, area from pais;

/* Maior área */
select * from Pais ORDER BY populacao desc limit 1;

/* Menos área */
select * from Pais ORDER BY area asc limit 1;
