package com.backexemplo.service;

import com.backexemplo.entity.Pessoa;
import com.backexemplo.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository repository;

    public List<Pessoa> listar() {
        return repository.findAll();
    }

    public Pessoa add(Pessoa p){
        return repository.save(p);
    }

}
