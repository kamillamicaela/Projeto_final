package br.com.projetofinal.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.projetofinal.entity.ItemDaVenda;
import br.com.projetofinal.repository.ItemDaVendaRepository;

@Service
public class ItemDaVendaService {

	private ItemDaVendaRepository repository;
	
	public List<ItemDaVenda> buscarItemDaVenda(){
		return repository.findAll();
	}
	
	public String cadastrarItemDaVenda(ItemDaVenda item) {
		repository.save(item);
		return "Registro incluído com sucesso.";
	}
	
	public String alterarItemDaVenda(Integer idItemDaVenda, ItemDaVenda item) {
		ItemDaVenda response = repository.findById(idItemDaVenda).get();
		
		response.setIdItemDaVenda(item.getIdItemDaVenda());
		response.setProduto(item.getProduto());
		response.setQuantidade(item.getQuantidade());
		response.setValorUnitario(item.getValorUnitario());
	
		repository.save(response);
		return "Registro alterado com sucesso.";
		}

	public String excluirItemDaVenda(Integer idItemDaVenda) {
		ItemDaVenda response = repository.findById(idItemDaVenda).get();
		repository.delete(response);
		return "Produto excluído com sucesso.";
		}
}
