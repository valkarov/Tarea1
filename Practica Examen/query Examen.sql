CREATE DATABASE examen_evento;
USE examen_evento;

CREATE TABLE evento(
	id_evento INT primary KEY NOT NULL auto_increment,
    artista VARCHAR(120) NOT NULL,
    capacidad INT NOT NULL,
    costo INT NOT NULL,
    fecha VARCHAR(120) NOT NULL,
    lugar VARCHAR(120) NOT NULL
);

INSERT INTO evento (id_evento, artista, capacidad, costo, fecha, lugar)
VALUES (2, "Bad Bunny", 50, 5000, "30-06-2022", "Estadio Nacional");

SELECT * FROM evento;