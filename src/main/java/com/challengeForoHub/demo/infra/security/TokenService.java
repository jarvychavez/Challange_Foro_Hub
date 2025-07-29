package com.challengeForoHub.demo.infra.security;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import com.challengeForoHub.demo.domain.usuario.Usuario;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;


@Service
public class TokenService {

    public String generarToken(Usuario usuario){
        try {
            var algoritmo = Algorithm.HMAC256("12345678");
            return JWT.create()
                    .withIssuer("API Voll.med")
                    .withSubject(usuario.getUsername())
                    .withExpiresAt(fechaExpiracion())
                    .sign(algoritmo);
        } catch (JWTCreationException exception){
           throw new RuntimeException("Error al generar el token JWT", exception);
        }
    }

    private Instant fechaExpiracion() {
        ZoneId zonaGuadalajara = ZoneId.of("America/Mexico_City");
        return LocalDateTime.now().plusHours(2).atZone(zonaGuadalajara).toInstant();
    }
}
