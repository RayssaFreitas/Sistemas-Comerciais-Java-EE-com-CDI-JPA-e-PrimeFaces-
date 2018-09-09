package com.algaworks.cursojavaee211;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;

@ManagedBean
@ViewScoped
public class PerfilUsuarioBean211 implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public static List<Interesse11> INTERESSES = new ArrayList<Interesse11>();
	
	static {
		INTERESSES.add(new Interesse11("Esportes", "esportes"));
		INTERESSES.add(new Interesse11("Computação", "computacao"));
		INTERESSES.add(new Interesse11("Cinema", "cinema"));
		INTERESSES.add(new Interesse11("Leitura", "leitura"));
	}
	
	private String nome;
	private String profissao;
	private Interesse11 interesse;
	
	
	public void atualizar() {
		System.out.println("Profissão: " + this.profissao);
		System.out.println("Interesse " + this.interesse.getDescricao());
		
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Perfil atualizado!"));
	}
	
	public List<Interesse11>  getInteresses() {
		return INTERESSES;
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

	public Interesse11 getInteresse() {
		return interesse;
	}

	public void setInteresse(Interesse11 interesse) {
		this.interesse = interesse;
	}
	
	

	


	

	
	
	
	

}
