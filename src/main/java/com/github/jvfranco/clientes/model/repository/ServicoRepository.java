package com.github.jvfranco.clientes.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.jvfranco.clientes.model.entity.Servico;

public interface ServicoRepository extends JpaRepository<Servico, Integer> {

}
