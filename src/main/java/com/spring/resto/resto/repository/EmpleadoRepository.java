package com.spring.resto.resto.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.resto.resto.entity.*;

public interface EmpleadoRepository extends JpaRepository<Empleado, Long> {
	//Optional<Empleado> findOneByUsername(String username);
	Optional<Empleado> findByUserName(String userName);
}
