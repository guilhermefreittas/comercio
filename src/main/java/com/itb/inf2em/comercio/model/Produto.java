package com.itb.inf2em.comercio.model;

public class Produto {

	private Long id;
	private String nome;
	private String descricao;
	private String codigoBarras;
	private double preco;
	private boolean status;
	
	//public: Acesso lliberado para todas as classes.
	
	//private: Acesso liberado apenas dentro da própria classe, ou seja, apenas
	//          os métodos da referida classe tem acesso
	
	//Método Setter's - Atribuir dados aos atributos
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public Long getId() {
		return id;
	}
	//nome
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	
	//descricao
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getDescricao() {
		return descricao;
	}
	
	//codigoBarras
	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}
	public String getCodigoBarras() {
		return codigoBarras;
	}
	
	//preco
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public double getPreco() {
		return preco;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	//status

	
	
}
