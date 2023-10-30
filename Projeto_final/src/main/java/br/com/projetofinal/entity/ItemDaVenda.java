package br.com.projetofinal.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class ItemDaVenda {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idItemDaVenda;
	
	@OneToOne
	private Produto produto;
	
	@OneToOne
	private Venda venda;
	
	@Column(length = 6, nullable = false)
	private int quantidade;
	
	@Column(length = 6, nullable = false)
	private double valorUnitario;
	
	@Column(length = 6, nullable = false)
	private double valorTotalProduto;
	
	public ItemDaVenda () {}
	
	public ItemDaVenda(int idItemDaVenda, Produto produto, Venda venda, int quantidade, double valorUnitario, double valorTotalProduto) {
		this.idItemDaVenda = idItemDaVenda;
		this.produto = produto;
		this.venda = venda;
		this.quantidade = quantidade;
		this.valorUnitario = valorUnitario;
		this.valorTotalProduto = valorTotalProduto;
	}

	public int getIdItemDaVenda() {
		return idItemDaVenda;
	}

	public void setIdItemDaVenda(int idItemDaVenda) {
		this.idItemDaVenda = idItemDaVenda;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	public Venda getVenda() {
		return venda;
	}

	public void setVenda(Venda venda) {
		this.venda = venda;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	public double getValorTotalProduto() {
		return valorTotalProduto;
	}

	public void setValorTotalProduto(double valorTotalProduto) {
		this.valorTotalProduto = valorTotalProduto;
	}
	
}
