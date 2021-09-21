package com.entra21.controller;

import com.entra21.controller.dto.TopicoDTO;
import com.entra21.controller.dto.TopicoFORM;
import com.entra21.model.Topico;
import com.entra21.repositories.CursoRepository;
import com.entra21.repositories.TopicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/topico")
public class TopicoController {

    @Autowired
    TopicoRepository topicoRepository;

    @Autowired
    CursoRepository cursoRepository;

    /*
    public List<TopicoDTO> listarTopicos(){
        List<Topico> topicos = topicoRepository.findAll();

        return TopicoDTO.converter(topicos);
    }*/

    @GetMapping
    public List<TopicoDTO> listarTopicos(String nomeCurso) {
        List<Topico> topicos;

        if(nomeCurso == null){
            topicos = topicoRepository.findAll();
        }else {
            topicos = topicoRepository.carregarPorNomeDoCurso(nomeCurso);
        }
        return TopicoDTO.converter(topicos);
    }

    @PostMapping
    public ResponseEntity<TopicoDTO> gravar(@RequestBody @Valid TopicoFORM topicoFORM, UriComponentsBuilder uriComponentsBuilder){
        Topico topico = topicoFORM.converter(cursoRepository);
        topicoRepository.save(topico);

        URI uri = uriComponentsBuilder.path("/topicos/{id}").buildAndExpand(topico.getId()).toUri();
        return ResponseEntity.created(uri).body(new TopicoDTO(topico));
    }
}
