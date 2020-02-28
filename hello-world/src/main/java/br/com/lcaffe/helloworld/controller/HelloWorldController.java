package br.com.lcaffe.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RequestBody;
import br.com.lcaffe.helloworld.model.Cliente;
import org.springframework.http.HttpStatus;

@RestController
@RequestMapping(value="/hello", produces=MediaType.APPLICATION_JSON_VALUE)
public class HelloWorldController {

	@GetMapping
	public String saudacao() {
		return "Hello World";
	}
	
   @PostMapping
    @ResponseStatus(value = HttpStatus.CREATED)
    public void adiciona(@RequestBody Cliente cliente) {
	System.out.println("Cliente enviado...");
    }
	
	
}
