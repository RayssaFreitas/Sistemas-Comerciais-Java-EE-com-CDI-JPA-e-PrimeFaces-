package com.algaworks.cursojavaee.controller;

import javax.inject.Inject;
import javax.inject.Named;

import com.algaworks.cursojavaee.service.CalculadoraPrecoService;

@Named("meuBean")
public class PrecoProdutoBean {

	@Inject
	private CalculadoraPrecoService calculadoraPrecoService;
	
	public double getPreco() {
		return calculadoraPrecoService.CalculaPreco(12, 44.55);
	}
}
