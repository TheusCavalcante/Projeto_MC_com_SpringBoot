package com.matcavalcanteteste.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matcavalcanteteste.cursomc.domain.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer>{
	
	

}
