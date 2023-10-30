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

import br.com.projetofinal.entity.Venda;
import br.com.projetofinal.service.VendaService;

@RestController
@RequestMapping(value="/venda")
public class VendaController {

	@Autowired
	private VendaService service;

	@GetMapping
	public List<Venda> buscarVenda(){
		return service.buscarVenda();
	}
	
	@PostMapping
	public String cadastrarVenda(@RequestBody Venda venda) {
		String response = service.cadastrarVenda(venda);
		return response;
	}
	
	@PutMapping(value= "/{idVenda}")
	public String alterarVenda(@PathVariable Integer idVenda, @RequestBody Venda venda) {
	String response = service.alterarVenda(idVenda, venda);
	return response;
	}
	
	@DeleteMapping(value="/{idVenda}")
	public String excluiVenda(@PathVariable Integer idVenda) {
	String response = service.excluirVenda(idVenda);
	return response;
	}
}