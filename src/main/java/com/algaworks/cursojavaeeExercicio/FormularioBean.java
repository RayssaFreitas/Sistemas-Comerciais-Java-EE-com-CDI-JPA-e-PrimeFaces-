package com.algaworks.cursojavaeeExercicio;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@ViewScoped
public class FormularioBean implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7382004971074349542L;
	private List<String> cidades = new ArrayList<String>();
	private List<String> formasDePagamento = new ArrayList<String>();
	private List<String> interesses;
	
	private List<ContratoCurso> contratosCursos = new ArrayList<ContratoCurso>();
	private ContratoCurso contratoCurso = new ContratoCurso();
	
	public FormularioBean() {
		carregaCidades();
	}
	
	public void carregaCidades() {
		cidades.add("Alemanha");
		cidades.add("Argélia");
		cidades.add("Argentina");
		cidades.add("Bélgica");
		cidades.add("Bolívia");
		cidades.add("Brasil");
		cidades.add("Bulgaria");
		cidades.add("Espanha");
		cidades.add("Estados Unidos");
	}
	
	public List<String> sugerirCidades(String consulta){
		List<String> cidadesSugeridos = new ArrayList<String>();
		for(String cidade : this.cidades) {
			if(cidade.toLowerCase().startsWith(consulta.toLowerCase())) {
				cidadesSugeridos.add(cidade);
			}
		}
		
		return cidadesSugeridos;
	}
	

	public Date  getDataHoje() {
		return new Date();
	}
	
	public List<String> getFormasDePagamento() {
		return formasDePagamento;
	}

	public void setFormasDePagamento(List<String> formasDePagamento) {
		this.formasDePagamento = formasDePagamento;
	}

	public List<String> getCidades() {
		return cidades;
	}

	public void setCidades(List<String> cidades) {
		this.cidades = cidades;
	}
	
	public List<String> getInteresses() {
		return interesses;
	}
 	public void setInteresses(List<String> interesses) {
		this.interesses = interesses;
	}

	public void atualizar() {
		contratosCursos.add(contratoCurso);
		contratoCurso = new ContratoCurso();
	}
	
	public List<ContratoCurso> getContratosCursos() {
		return contratosCursos;
	}

	public void setContratosCursos(List<ContratoCurso> contratosCursos) {
		this.contratosCursos = contratosCursos;
	}

	public ContratoCurso getContratoCurso() {
		return contratoCurso;
	}

	public void setContratoCurso(ContratoCurso contratoCurso) {
		this.contratoCurso = contratoCurso;
	}

	public void formasPagamento() {
		formasDePagamento.clear();
		
		switch (contratoCurso.getMetodoPagamento()) {
		case 1:
			formasDePagamento.add("À vista");
			formasDePagamento.add("1X");
			formasDePagamento.add("2X");
			formasDePagamento.add("3X");
			formasDePagamento.add("4X");
			formasDePagamento.add("5X");
			formasDePagamento.add("6X");
			break;
		case 2:
			formasDePagamento.add("À vista");
			formasDePagamento.add("Entrada + 30 dias");
			break;
		case 3:
			formasDePagamento.add("À vista");
			break;
		default:
			break;
		}
	}

}
