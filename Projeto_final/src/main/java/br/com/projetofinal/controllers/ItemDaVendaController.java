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

import br.com.projetofinal.entity.ItemDaVenda;
import br.com.projetofinal.service.ItemDaVendaService;

@RestController
@RequestMapping(value="/itemDaVenda")
public class ItemDaVendaController {

	@Autowired
	private ItemDaVendaService service;

	@GetMapping
	public List<ItemDaVenda> buscarItemDaVenda(){
		return service.buscarItemDaVenda();
	}
	
	@PostMapping
	public String cadastrarItemDaVenda(@RequestBody ItemDaVenda item) {
		String response = service.cadastrarItemDaVenda(item);
		return response;
	}
	
	@PutMapping(value= "/{idItemDaVenda}")
	public String alterarItemDaVenda(@PathVariable Integer idItemDaVenda, @RequestBody ItemDaVenda item) {
	String response = service.alterarItemDaVenda(idItemDaVenda, item);
	return response;
	}
	
	@DeleteMapping(value="/{idItemDaVenda}")
	public String excluiItemDaVenda(@PathVariable Integer idItemDaVenda) {
	String response = service.excluirItemDaVenda(idItemDaVenda);
	return response;
	}
}
