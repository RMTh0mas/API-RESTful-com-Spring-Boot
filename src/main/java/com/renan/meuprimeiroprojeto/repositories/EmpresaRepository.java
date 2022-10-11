package com.renan.meuprimeiroprojeto.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.renan.meuprimeiroprojeto.entities.Empresa;

public interface EmpresaRepository extends JpaRepository<Empresa, Long>{
    
    Empresa findByCnpj(String cnpj);

}