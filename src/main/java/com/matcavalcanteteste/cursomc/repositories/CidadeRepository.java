package com.matcavalcanteteste.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matcavalcanteteste.cursomc.domain.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Integer>{
	
	

}
