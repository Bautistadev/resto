package com.spring.resto.resto.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.spring.resto.resto.entity.Cliente;


public interface ClienteRepository extends JpaRepository<Cliente,Long> {
	
}
