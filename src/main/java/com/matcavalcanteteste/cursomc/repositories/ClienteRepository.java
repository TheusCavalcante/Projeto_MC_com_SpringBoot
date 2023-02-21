package com.matcavalcanteteste.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matcavalcanteteste.cursomc.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{
	
	

}
