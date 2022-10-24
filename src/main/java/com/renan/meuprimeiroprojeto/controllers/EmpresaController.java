package com.renan.meuprimeiroprojeto.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.renan.meuprimeiroprojeto.dtos.EmpresaDto;

@RestController
@RequestMapping("/meuprimeiroprojeto/empresas")
public class EmpresaController {

    @PostMapping
    public ResponseEntity<EmpresaDto> cadastrar(@RequestBody EmpresaDto empresaDto){
        empresaDto.setId(1L);
        return ResponseEntity.ok(empresaDto);
    }

}
