package com.algaworks.cursojavaeeExercicio;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class ContratoCurso implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3352920790683200279L;
	private String razaoSocial;
	private String cnpj;
	private String cidadeContrato;
	private String modalidade;
	private Date dataContrato;
	private BigDecimal valorDoContrato;
	private int metodoPagamento;
	private String formaPagamento;
	
	public ContratoCurso() {
		
	}
	
	public ContratoCurso(String razaoSocial, String cnpj, String cidadeContrato, String modalidade, Date dataContrato, BigDecimal valorDoContrato) {
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
		this.cidadeContrato = cidadeContrato;
		this.modalidade = modalidade;
		this.dataContrato = dataContrato;
		this.valorDoContrato = valorDoContrato;
		
		
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
	public Date getDataContrato() {
		return dataContrato;
	}
	public void setDataContrato(Date dataContrato) {
		this.dataContrato = dataContrato;
	}
	public BigDecimal getValorDoContrato() {
		return valorDoContrato;
	}
	public void setValorDoContrato(BigDecimal valorDoContrato) {
		this.valorDoContrato = valorDoContrato;
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
	
	
	

}
