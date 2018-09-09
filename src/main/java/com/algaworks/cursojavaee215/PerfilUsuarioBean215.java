package com.algaworks.cursojavaee215;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;


@ManagedBean
@ViewScoped
public class PerfilUsuarioBean215 implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5010149837379596052L;
	
	private List<String> paises = new ArrayList<String>();
	
	private String nome;
	private String pais;
	
	
	public PerfilUsuarioBean215() {
		 paises.add("Alemanha");
	        paises.add("Argélia");
	        paises.add("Argentina");
	        paises.add("Bélgica");
	        paises.add("Bolívia");
	        paises.add("Brasil");
	        paises.add("Bulgaria");
	        paises.add("Espanha");
	        paises.add("Estados Unidos");
	}
	
	public List<String> sugerirPaises(String consulta){
		List<String> paisesSugeridos = new ArrayList<String>();
		for(String pais : this.paises) {
			if(pais.toLowerCase().startsWith(consulta.toLowerCase())) {
				paisesSugeridos.add(pais);
			}
		}
		
		return paisesSugeridos;
	}

	public void atualizar() {
		System.out.println("País: " + this.pais);
		
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Perfil Atualizado!"));
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public List<String> getPaises() {
		return paises;
	}

	public void setPaises(List<String> paises) {
		this.paises = paises;
	}
	
	
	
	
	

}
