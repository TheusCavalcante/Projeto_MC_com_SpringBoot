package com.matcavalcanteteste.cursomc.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/categorias")
public class CatergoriaResource {
	
	@GetMapping
	public String listar() {
		return "rest está funcionando";
	}

}
