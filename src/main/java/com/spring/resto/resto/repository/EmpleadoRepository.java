package com.spring.resto.resto.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.spring.resto.resto.entity.*;

public interface EmpleadoRepository extends JpaRepository<Empleado, Long> {
	@Query(value = "SELECT c FROM Empleado c WHERE c.userName = ?1 ")
	Optional<Empleado> findByUserName(String userName);
}
