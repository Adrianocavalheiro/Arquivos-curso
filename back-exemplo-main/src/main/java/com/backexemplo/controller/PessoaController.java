package com.backexemplo.controller;

import com.backexemplo.entity.Pessoa;
import com.backexemplo.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {

    @Autowired
    private PessoaService service;

    @GetMapping
    public List<Pessoa> listar() {
        return service.listar();
    }

    @PostMapping
    public Pessoa salvar(@RequestBody Pessoa p) {
        return service.add(p);
    }
}
