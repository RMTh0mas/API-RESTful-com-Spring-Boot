package com.renan.meuprimeiroprojeto;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.util.SystemPropertyUtils;
import com.renan.meuprimeiroprojeto.entities.Empresa;
import com.renan.meuprimeiroprojeto.repositories.EmpresaRepository;
import com.renan.meuprimeiroprojeto.services.ExemploService;

@SpringBootApplication
public class Aplication {

    @Autowired
    private ExemploService service;

    public static void main(String[] args) {
        SpringApplication.run(Aplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(){
        return args -> {
            this.service.testarServico();
        };
    }

}
