package com.spring.resto.resto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.resto.resto.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente,Long> {

}
