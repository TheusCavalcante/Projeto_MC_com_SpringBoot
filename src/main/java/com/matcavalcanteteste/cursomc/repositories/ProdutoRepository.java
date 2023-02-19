package com.matcavalcanteteste.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matcavalcanteteste.cursomc.domain.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer>{
	
	

}
