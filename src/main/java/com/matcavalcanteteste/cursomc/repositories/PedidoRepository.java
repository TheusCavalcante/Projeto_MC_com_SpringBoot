package com.matcavalcanteteste.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matcavalcanteteste.cursomc.domain.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Integer>{
	
	

}
