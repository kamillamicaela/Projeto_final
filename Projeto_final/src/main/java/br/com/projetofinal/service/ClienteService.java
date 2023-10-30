package br.com.projetofinal.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.projetofinal.entity.Cliente;
import br.com.projetofinal.repository.ClienteRepository;

@Service
public class ClienteService {
	
	private ClienteRepository repository;
	
	public List<Cliente> buscarCliente(){
		return repository.findAll();
	}
	
	public String cadastrarCliente(Cliente cliente) {
		repository.save(cliente);
		return "Registro incluído com sucesso.";
	}
	
	public String alterarCliente(Integer idCliente, Cliente cliente) {
		Cliente response = repository.findById(idCliente).get();
		
		response.setNome(cliente.getNome());
		response.setCpf(cliente.getCpf());
		response.setEmail(cliente.getEmail());
		response.setEndereco(cliente.getEndereco());
		
		repository.save(response);
		return "Registro alterado com sucesso.";
		}

		public String excluirCliente(Integer idCliente) {
			Cliente response = repository.findById(idCliente).get();
			repository.delete(response);
			return "Registro excluído com sucesso.";
		}
}
