DROP TABLE IF EXISTS topico;

CREATE TABLE topico (
    id BIGINT NOT NULL AUTO_INCREMENT,
    titulo VARCHAR(255) NOT NULL,
    mensaje TEXT NOT NULL,
    nombreCurso VARCHAR(255) NOT NULL,
    idUsuario BIGINT NOT NULL,
    fechaCreacion DATETIME NOT NULL,
    status BOOLEAN NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (idUsuario) REFERENCES usuarios(id)
);
