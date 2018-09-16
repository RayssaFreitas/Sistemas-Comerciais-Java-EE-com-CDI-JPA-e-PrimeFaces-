package com.algaworks.cursojavaeeExercicio;

import java.io.Serializable;
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
	private static final long serialVersionUID = 1L;
	private String razaoSocial;
	private String cnpj;
	private String cidadeContrato;
	private Date dataContrato;
	private String modalidade;
	private Double valor;
	private int metodoPagamento;
	private String formaPagamento;
	private List<String> cidades = new ArrayList<String>();
	private List<String> formasDePagamento = new ArrayList<String>();
	private List<String> interesses;
	
	
	public FormularioBean() {
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
	
	
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getCidadeContrato() {
		return cidadeContrato;
	}
	public void setCidadeContrato(String cidadeContrato) {
		this.cidadeContrato = cidadeContrato;
	}
	public String getModalidade() {
		return modalidade;
	}
	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	public int getMetodoPagamento() {
		return metodoPagamento;
	}

	public void setMetodoPagamento(int metodoPagamento) {
		this.metodoPagamento = metodoPagamento;
	}

	public String getFormaPagamento() {
		return formaPagamento;
	}
	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}
	
	public Date getDataContrato() {
		return dataContrato;
	}
	public void setDataContrato(Date dataContrato) {
		this.dataContrato = dataContrato;
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
		System.out.println("Data de Nascimento: " + this.dataContrato);
		
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Perfil atualizado!"));
		System.out.println("Razão social " + razaoSocial);
		System.out.println("CNPJl " + cnpj);
		System.out.println("Cidade " + cidadeContrato);
		System.out.println("Modalidade " + modalidade);
		System.out.println("Data COntrato " + dataContrato);
		System.out.println("Modalidade " + modalidade);
		System.out.println("Valor COntrato " + valor);
		System.out.println("Método de Pagamento " + metodoPagamento);
		System.out.println("Forma de Pagamento " + formaPagamento);
		System.out.println("Interesses:");
		for(String interesse: interesses) {
			System.out.println(interesse);
		}
		
	}
	
	public void formasPagamento() {
		formasDePagamento.clear();
		
		switch (metodoPagamento) {
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
