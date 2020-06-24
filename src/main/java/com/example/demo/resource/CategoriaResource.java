package com.example.demo.resource;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Contato;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource {
	
	@GetMapping
	public List<Contato> listar() {
		Contato contato1 = new Contato(1, "Joao","99999999","joao@yyahoo.com");
		Contato contato2 = new Contato(2, "Maria","88888888","maria@yyahoo.com");
		Contato contato3 = new Contato(3, "Marta","86679883","marta@yyahoo.com");
		Contato contato4 = new Contato(4, "Camila","54326549","camila@yyahoo.com");
		
		List<Contato> contatos = new ArrayList<>();
		contatos.add(contato1);
		contatos.add(contato2);
		contatos.add(contato3);
		contatos.add(contato4);
		
		return contatos;
	}

}
