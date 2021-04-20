package com.github.jvfranco.clientes.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.jvfranco.clientes.model.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
