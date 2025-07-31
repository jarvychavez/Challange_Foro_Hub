package com.challengeForoHub.demo.controller;



import java.util.Optional;
//import com.challengeForoHub.demo.domain.topico.DatosListaTopico;
import com.challengeForoHub.demo.domain.topico.*;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/topicos")
public class TopicoController {

    @Autowired
    private TopicoRepository repository;

    @Transactional
    @PostMapping
    public void registrar(@RequestBody @Valid DatosRegistroTopico datos){
        repository.save(new Topico(datos));
    }

    @GetMapping
    public List<Topico> listar(){
        return repository.findAll();
    }


    @Transactional
    @PutMapping
    public void actualizar(@RequestBody @Valid DatosActualizacionTopico datos){
        var topico = repository.getReferenceById(datos.id());
        topico.actualizarInformaciones(datos);

    }


}
