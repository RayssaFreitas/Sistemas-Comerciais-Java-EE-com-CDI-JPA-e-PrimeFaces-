package com.algaworks.cursojavaee.controller;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.enterprise.context.Dependent;
//import javax.faces.bean.RequestScoped;		//do JSF
import javax.enterprise.context.RequestScoped;  //do CDI
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.algaworks.cursojavaee.service.CalculadoraPrecoService;

@Named("meuBean")
//@Dependent 			//do CDI - � o padr�o -- assume o escpo de quem  o chama
//@RequestScoped		//dura uma requisi��o HTTP
//@SessionScoped
//@ViewScoped			//N�o existe no CDI
public class PrecoProdutoBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Inject
	private CalculadoraPrecoService calculadoraPrecoService;
	
	@PostConstruct
	public void init() {
		System.out.println("Init ProdutoBean");
	}
	
	public double getPreco() {
		return calculadoraPrecoService.CalculaPreco(12, 44.55);
	}
}
