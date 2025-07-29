package com.challengeForoHub.demo.controller;

import com.challengeForoHub.demo.domain.topico.DatosRegistroTopico;
import com.challengeForoHub.demo.domain.topico.Topico;
import com.challengeForoHub.demo.domain.topico.TopicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/topicos")
public class TopicoController {

    @Autowired
    private TopicoRepository repository;

    @PostMapping
    public void registrar(@RequestBody DatosRegistroTopico datos){
        repository.save(new Topico(datos));
    }

}
