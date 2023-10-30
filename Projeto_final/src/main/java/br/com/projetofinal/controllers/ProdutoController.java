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

import br.com.projetofinal.entity.Produto;
import br.com.projetofinal.service.ProdutoService;

@RestController
@RequestMapping(value="/produto")
public class ProdutoController {

	@Autowired
	private ProdutoService service;

	@GetMapping
	public List<Produto> buscarProduto(){
		return service.buscarProduto();
	}
	
	@PostMapping
	public String cadastrarProduto(@RequestBody Produto produto) {
		String response = service.cadastrarProduto(produto);
		return response;
	}
	
	@PutMapping(value= "/{idProduto}")
	public String alterarProduto(@PathVariable Integer idProduto, @RequestBody Produto produto) {
	String response = service.alterarProduto(idProduto, produto);
	return response;
	}
	
	@DeleteMapping(value="/{idProduto}")
	public String excluiProduto(@PathVariable Integer idProduto) {
	String response = service.excluirProduto(idProduto);
	return response;
	}
}
