package com.spring.resto.resto.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.spring.resto.resto.DTO.MesaDTO;
import com.spring.resto.resto.entity.*;
public interface MesaRepository extends JpaRepository<Mesa,Long>{
	
	@Query(value="SELECT c.token FROM Mesa c WHERE c.id = ?1 ")
	String findMesaToken(Long id );
	
	@Query(value="SELECT c FROM Mesa c WHERE c.token = ?1 ")
	Mesa findMesaByToken(String token );

	@Query(value = "UPDATE Mesa c SET c.estado = 1 WHERE c.id = ?1")
	void tomarMesa(Long id);
	
	@Modifying
	@Query(value = "UPDATE Mesa c SET c.estado = 0 WHERE c.id = :id ")
	void dejarMesa(Long id);
	
}
