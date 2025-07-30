package com.challengeForoHub.demo.domain.topico;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record DatosRegistroTopico(
        @NotNull Long idUsuario,
        @NotBlank @Size(min = 7) String mensaje,
        @NotBlank String nombreCurso,
        @NotBlank String titulo
) {
}

