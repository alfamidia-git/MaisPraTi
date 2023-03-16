package com.maisprati.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maisprati.model.Cliente;
import com.maisprati.service.ClienteService;

@RestController
@RequestMapping("/cliente")
public class ClienteRest {
	
	@Autowired ClienteService clienteService;
	
	
	@PostMapping("/criar") //LOCALHOST:8080/CLIENTE/CRIAR
	public ResponseEntity<Cliente> criarCliente(@RequestBody Cliente cliente) {
		return clienteService.criarClienteOuAlterarCliente(cliente);
	}
	
	@PutMapping("/atualizar")
	public ResponseEntity<Cliente> atualizarCliente(@RequestBody Cliente cliente) {
		return clienteService.criarClienteOuAlterarCliente(cliente);
	}

}
