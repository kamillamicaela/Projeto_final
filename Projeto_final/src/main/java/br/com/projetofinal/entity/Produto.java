package br.com.projetofinal.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idProduto;
	
	@Column(length = 11, nullable = false)
	private String nome;
	
	@Column(nullable = false)
	private double preco;
	
	@Column(length = 6, nullable = false)
	private int quantidadeEmEstoque;

	public Produto() {}
	
	public Produto(int idProduto, String nome, double preco, int quantidadeEmEstoque) {
		super();
		this.idProduto = idProduto;
		this.nome = nome;
		this.preco = preco;
		this.quantidadeEmEstoque = quantidadeEmEstoque;
	}

	public int getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidadeEmEstoque() {
		return quantidadeEmEstoque;
	}

	public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
		this.quantidadeEmEstoque = quantidadeEmEstoque;
	}
	
}
