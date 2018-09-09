package com.algaworks.cursojavaee214;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;

@ManagedBean
@ViewScoped
public class PerfilUsuarioBean214 implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private String nome;
	private List<String> interesses;
	
	
	
	public void atualizar() {
		for(String interesse: interesses) {
			System.out.println("Interesse: " + interesse);
		}
		
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Perfil atualizado!"));
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public List<String> getInteresses() {
		return interesses;
	}


	public void setInteresses(List<String> interesses) {
		this.interesses = interesses;
	}



	
	


	
	
	
	
	



	
	

	


	

	
	
	
	

}
