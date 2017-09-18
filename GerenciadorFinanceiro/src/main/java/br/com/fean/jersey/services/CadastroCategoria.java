package br.com.fean.jersey.services;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CadastroCategoria {
	private String nomeCategoria;

	public CadastroCategoria(){}
	
	public CadastroCategoria(String nomeCategoria) {
		super();
		this.nomeCategoria = nomeCategoria;
	}

	public String getNomeCategoria() {
		return nomeCategoria;
	}

	public void setNomeCategoria(String nomeCategoria) {
		this.nomeCategoria = nomeCategoria;
	}
	
	
}
