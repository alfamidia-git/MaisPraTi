package com.maisprati.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


import com.maisprati.model.Cliente;
import com.maisprati.repository.ClienteRepository;

@Service
public class ClienteService {

	@Autowired ClienteRepository clienteRepository;
	
	public ResponseEntity<Cliente> criarClienteOuAlterarCliente(Cliente cliente) {
			HttpStatus status = null;
			if(cliente.getNome() == null) {
				return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
			}
			
			if(cliente.getId() != null) {
				status = HttpStatus.OK;
			}else {
				status = HttpStatus.CREATED;
			}
			
			Cliente clienteSalvo = clienteRepository.save(cliente);
			
			return new ResponseEntity<>(clienteSalvo, status);
	}

}
