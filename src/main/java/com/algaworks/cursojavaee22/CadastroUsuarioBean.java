package com.algaworks.cursojavaee22;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;


@ManagedBean
@ViewScoped
public class CadastroUsuarioBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5010149837379596052L;
	
	private String login;
	private String nome;
	
	
	
	
	public void verificarDisponibilidadeLogin() {
		FacesMessage msg = null;
		System.out.println("Verificando disponibilidade: " + this.login);
		
		
		//simula demora no processamento
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			
		}
		
		if("joao".equalsIgnoreCase(this.login)) {
			msg = new FacesMessage("login já está em uso");
			msg.setSeverity(FacesMessage.SEVERITY_WARN);
		}else {
			msg = new FacesMessage("Login disponível.");
		}
		
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}
	
	public void cadastrar() {
		System.out.println("Login: " + this.login);
		System.out.println("Nome: " + this.nome);
		
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Cadastro efetuado!"));
	}
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

}
