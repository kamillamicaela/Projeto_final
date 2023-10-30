package br.com.projetofinal.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Venda {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idVenda;
	
	private LocalDate data;
	
	@OneToOne
	private Cliente	cliente;
	
	private double ValorTotal;

	public Venda () {}
	


	public Venda(int idVenda, LocalDate data, Cliente cliente, double valorTotal) {
		this.idVenda = idVenda;
		this.data = data;
		this.cliente = cliente;
		ValorTotal = valorTotal;
	}



	public int getIdVenda() {
		return idVenda;
	}

	public void setIdVenda(int idVenda) {
		this.idVenda = idVenda;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}



	public double getValorTotal() {
		return ValorTotal;
	}

	public void setValorTotal(double valorTotal) {
		ValorTotal = valorTotal;
	}
	
}
