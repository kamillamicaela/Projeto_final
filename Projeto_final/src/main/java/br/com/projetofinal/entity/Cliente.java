package br.com.projetofinal.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idCliente;
	
	@Column(length = 40, nullable = false)
	String nome, email, endereco;
	
	@Column(length = 11, nullable = false, unique = true )
	String cpf;
	
	public Cliente () {}
	
	public Cliente(int idCliente, String nome, String cpf, String email, String endereco) {
		this.idCliente = idCliente;
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.endereco = endereco;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	
	
	
}
