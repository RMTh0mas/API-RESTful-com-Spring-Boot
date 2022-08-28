package com.renan.meuprimeiroprojeto;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Aplication {

    @Value("${paginacao.qtde_por_pagina}")
    private int qtdPorPagina;

    @Bean
    public CommandLineRunner commandLineRunner(){
        return args -> {
            System.out.println("### Quantidade de elementos por página =" + this.qtdPorPagina);
        };
    }

}
