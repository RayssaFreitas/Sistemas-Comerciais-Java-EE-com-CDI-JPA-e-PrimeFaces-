package com.algaworks.cursojavaee212;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;

@ManagedBean
@ViewScoped
public class PerfilUsuarioBean212 implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private List<String> estados = new ArrayList<String>();
	private List<String> cidades = new ArrayList<String>();
	
	private String nome;
	private String estado;
	private String cidade;
	
	public PerfilUsuarioBean212() {
		estados.add("MG");
		estados.add("SP");
		estados.add("RJ");
	}
	
	
	public void carregarCidades() {
		cidades.clear();
		
		if ("MG".equals(estado)) {
			cidades.add("Uberlândia");
			cidades.add("Uberaba");
			cidades.add("Belo Horizonte");
		} else if ("SP".equals(estado)) {
            cidades.add("São Paulo");
            cidades.add("Franca");
            cidades.add("Ribeirão Preto");
        } else if ("RJ".equals(estado)) {
            cidades.add("Rio de Janeiro");
            cidades.add("Niteroi");
        }
	}
	
	public void atualizar() {
		System.out.println("Estado: " + this.estado);
		System.out.println("Cidade " + this.cidade);
		
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Perfil atualizado!"));
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}


	

	public String getCidade() {
		return cidade;
	}


	public void setCidade(String cidade) {
		this.cidade = cidade;
	}


	public List<String> getEstados() {
		return estados;
	}

	public void setEstados(List<String> estados) {
		this.estados = estados;
	}

	public List<String> getCidades() {
		return cidades;
	}

	public void setCidades(List<String> cidades) {
		this.cidades = cidades;
	}
	
	
	
	



	
	

	


	

	
	
	
	

}
