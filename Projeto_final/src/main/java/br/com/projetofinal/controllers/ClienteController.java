package br.com.projetofinal.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.projetofinal.entity.Cliente;
import br.com.projetofinal.service.ClienteService;

@RestController
@RequestMapping(value="/cliente")
public class ClienteController {

	@Autowired
	private ClienteService service;

	@GetMapping
	public List<Cliente> buscarCliente(){
		return service.buscarCliente();
	}
	
	@PostMapping
	public String cadastrarCliente(@RequestBody Cliente cliente) {
		String response = service.cadastrarCliente(cliente);
		return response;
	}
	
	@PutMapping(value= "/{idCliente}")
	public String alterarCliente(@PathVariable Integer idCliente, @RequestBody Cliente cliente) {
	String response = service.alterarCliente(idCliente, cliente);
	return response;
	}
	
	@DeleteMapping(value="/{idCliente}")
	public String excluirCliente(@PathVariable Integer idCliente) {
	String response = service.excluirCliente(idCliente);
	return response;
	}
}
