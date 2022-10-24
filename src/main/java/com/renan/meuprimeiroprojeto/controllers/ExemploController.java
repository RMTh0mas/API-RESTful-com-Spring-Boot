package com.renan.meuprimeiroprojeto.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/meuprimeiroprojeto/exemplo")
public class ExemploController {

    @GetMapping(value = "/{nome}") // Passa um parâmetro via url
    public String exemplo(@PathVariable("nome") String nome){
        return "Olá" + nome;
    }
    
}
