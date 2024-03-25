package com.generation.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helloworld")
public class HelloController {
	
	@GetMapping()
	 public String hello() {
		 return "Hello World "
		 		+ "<br> Comunicação "
		 		+ "<br> Persistência "
		 		+ "<br> Mentalidade de Crescimento "
		 		+ "<br> Orientação ao futuro "
		 		+ "<br> Responsabilidade Pessoal "
		 		+ "<br> Proatividade "
		 		+ "<br> Orientação ao Detalhe "
		 		+ "<br> Trabalho em Equipe"
		 		+ "<br> Pra essa semana meus objetos: Proatividade "
		 		+ "<br> Trabalho em Equipe "
		 		+ "<br> Comunicação";
	 }
}
