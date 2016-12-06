package br.com.alura.loja.modelo;

import com.thoughtworks.xstream.XStream;

public class Projeto {
	private String nome;
	private Long id;
	private int anoDeInicio;

	public Projeto( Long id, String nome, int anoDeInicio) {
		super();
		this.nome = nome;
		this.id = id;
		this.anoDeInicio = anoDeInicio;
	}

	public int getAnoDeInicio() {
		return anoDeInicio;
	}

	public void setAnoDeInicio(int anoDeInicio) {
		this.anoDeInicio = anoDeInicio;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public String toXML(){
		 return new XStream().toXML(this);
	}
}
