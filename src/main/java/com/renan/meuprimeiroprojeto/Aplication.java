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

import com.renan.meuprimeiroprojeto.Utils.SenhaUtils;
import com.renan.meuprimeiroprojeto.entities.Empresa;
import com.renan.meuprimeiroprojeto.repositories.EmpresaRepository;

@SpringBootApplication
public class Aplication {

    @Autowired
    private EmpresaRepository empresaRepository;

    public static void main(String[] args) {
        SpringApplication.run(Aplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(){
        return args -> {
            Empresa empresa = new Empresa();
            empresa.setRazaoSocial("Kaiba Corp");
            empresa.setCnpj("74645215000104");

            this.empresaRepository.save(empresa);

            List<Empresa> empresas = empresaRepository.findAll();
            empresas.forEach(System.out::println);

            Empresa empresaCnpj = empresaRepository.findByCnpj("746452150000104");
            System.out.println("Empresa por CNPJ" + empresaCnpj);

            empresas = empresaRepository.findAll();
            System.out.println("Empresas " + empresas.size()); 


        };
    }

}
