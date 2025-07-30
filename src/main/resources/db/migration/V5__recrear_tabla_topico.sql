DROP TABLE IF EXISTS topico;

CREATE TABLE topico (
    id BIGINT NOT NULL AUTO_INCREMENT,
    titulo VARCHAR(255) NOT NULL,
    mensaje TEXT NOT NULL,
    nombre_curso VARCHAR(255) NOT NULL,
    id_usuario BIGINT NOT NULL,
    fecha_creacion DATETIME NOT NULL,
    status BOOLEAN NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (id_usuario) REFERENCES usuarios(id)
);
