package br.com.projetofinal.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.projetofinal.entity.Produto;
import br.com.projetofinal.repository.ProdutoRepository;


@Service
public class ProdutoService {

	private ProdutoRepository repository;
	
	public List<Produto> buscarProduto(){
		return repository.findAll();
	}
	
	public String cadastrarProduto(Produto produto) {
		repository.save(produto);
		return "Registro incluído com sucesso.";
	}
	
	public String alterarProduto(Integer idProduto, Produto produto) {
		Produto response = repository.findById(idProduto).get();
		
		response.setNome(produto.getNome());
		response.setPreco(produto.getPreco());
		response.setQuantidadeEmEstoque(produto.getQuantidadeEmEstoque());
		
		repository.save(response);
		return "Registro alterado com sucesso.";
		}

	public String excluirProduto(Integer idProduto) {
		Produto response = repository.findById(idProduto).get();
		repository.delete(response);
		return "Registo excluído com sucesso.";
		}
}
