package com.nelioalves.cursomc.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nelioalves.cursomc.domain.Categorias;

@RestController
public class CategoriaResource {

	/*@RequestMapping(value = "/categorias", method = RequestMethod.GET)
	public String listar() {
		return "REST FUNCIONANDO......................................";
	}*/
	
	@RequestMapping(value = "/categorias", method = RequestMethod.GET)
	public List<Categorias> listar(){
		Categorias cat1 = new Categorias(1, "Informática");
		Categorias cat2 = new Categorias(2, "Escritório");
		
		List<Categorias> lista = new ArrayList<Categorias>();
		lista.add(cat1);
		lista.add(cat2);
		
		
		return lista;		
	}
	
}
