package com.challengeForoHub.demo.domain.topico;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Table(name = "topico")
@Entity(name = "Topico")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Topico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;

    private String mensaje;

    @Column(name = "nombre_curso")
    private String nombreCurso;

    @Column(name = "id_usuario")
    private Long idUsuario;

    @Column(name = "fecha_creacion")
    private LocalDateTime fechaCreacion;

    private boolean status;

    public Topico(DatosRegistroTopico datos) {
        this.titulo = datos.titulo();
        this.mensaje = datos.mensaje();
        this.nombreCurso = datos.nombreCurso();
        this.idUsuario = Long.valueOf(datos.idUsuario());
        this.fechaCreacion = LocalDateTime.now();
        this.status = true;
    }

}
