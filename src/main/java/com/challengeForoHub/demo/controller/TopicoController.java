package com.challengeForoHub.demo.controller;




//import com.challengeForoHub.demo.domain.topico.DatosListaTopico;
import com.challengeForoHub.demo.domain.topico.DatosRegistroTopico;
import com.challengeForoHub.demo.domain.topico.Topico;
import com.challengeForoHub.demo.domain.topico.TopicoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/topicos")
public class TopicoController {

    @Autowired
    private TopicoRepository repository;

    @PostMapping
    public void registrar(@RequestBody @Valid DatosRegistroTopico datos){
        repository.save(new Topico(datos));
    }

//    @GetMapping
//    public List<DatosListaTopico> listar() {
//        return repository.findAll().stream().map(DatosListaTopico::new).toList();
//    }


}
