package com.algaworks.cursojavaee216;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;


@ManagedBean
@ViewScoped
public class PerfilUsuarioBean216 implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2123728557892386384L;
	
	public static final List<Pais> PAISES = new ArrayList<Pais>();
	
	static {
		PAISES.add(new Pais(1, "Alemanha"));
        PAISES.add(new Pais(2, "Argélia"));
        PAISES.add(new Pais(3, "Argentina"));
        PAISES.add(new Pais(4, "Bélgica"));
        PAISES.add(new Pais(5, "Bolívia"));
        PAISES.add(new Pais(6, "Brasil"));
        PAISES.add(new Pais(7, "Bulgaria"));
        PAISES.add(new Pais(8, "Espanha"));
        PAISES.add(new Pais(9, "Estados Unidos"));
	}
	
	private String nome;
	private Pais pais;
	
	public void atualizar() {
		if(pais == null) {
			adicionarMensagem("Perfil Atualizado sem pais");
		}else {
			adicionarMensagem("Perfil Atualizado com pais " + pais.getNome() + " (" + pais.getCodigo() + ")");
		}
	}
	
	private void adicionarMensagem(String mensagem) {
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(mensagem));
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	
	public  List<Pais> sugerirPaises(String consulta){
		
		  List<Pais> paisesSugeridos = new ArrayList<Pais>();
	        
	        for (Pais pais : PAISES) {
	            if (pais.getNome().toLowerCase().startsWith(consulta.toLowerCase())) {
	                paisesSugeridos.add(pais);
	            }
	        }
	        
	        return paisesSugeridos;
		
	}
	
	
	

}
