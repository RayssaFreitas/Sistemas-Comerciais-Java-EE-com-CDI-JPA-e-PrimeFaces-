package com.algaworks.cursojavaee210;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;

@ManagedBean
@ViewScoped
public class PerfilUsuarioBean210 implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String nome;
	private String profissao;
	
	public void atualizar() {
		System.out.println("Sobre: " + this.profissao);
		
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Perfil atualizado!"));
	}
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getProfissao() {
		return profissao;
	}


	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}


	
	
	

}
