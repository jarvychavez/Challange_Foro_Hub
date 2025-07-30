CREATE TABLE topico (
    id BIGINT NOT NULL AUTO_INCREMENT,
    titulo VARCHAR(255) NOT NULL,
    mensaje TEXT NOT NULL,
    nombreCurso VARCHAR(255) NOT NULL,
    idAutor BIGINT NOT NULL,
    fechaCreacion DATETIME NOT NULL,
    status BOOLEAN NOT NULL,

    PRIMARY KEY (id),
    FOREIGN KEY (idAutor) REFERENCES usuarios(id)
);
