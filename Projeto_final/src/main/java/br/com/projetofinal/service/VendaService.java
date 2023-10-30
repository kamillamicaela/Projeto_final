package br.com.projetofinal.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.projetofinal.entity.Venda;
import br.com.projetofinal.repository.VendaRepository;

@Service
public class VendaService {
	
	private VendaRepository repository;
	
	public List<Venda> buscarVenda(){
		return repository.findAll();
	}
	
	public String cadastrarVenda(Venda venda) {
		repository.save(venda);
		return "Registro incluído com sucesso.";
	}
	
	public String alterarVenda(Integer idVenda, Venda venda) {
		Venda response = repository.findById(idVenda).get();
		
		response.setIdVenda(venda.getIdVenda());
		response.setData(venda.getData());
		response.setCliente(venda.getCliente());
		
		repository.save(response);
		return "Registro alterado com sucesso.";
		}

	public String excluirVenda(Integer idVenda) {
		Venda response = repository.findById(idVenda).get();
		repository.delete(response);
		return "Registo excluído com sucesso.";
		}

}
