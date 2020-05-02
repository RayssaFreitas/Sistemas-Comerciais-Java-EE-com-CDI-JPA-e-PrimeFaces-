package com.algaworks.cursojavaee.service;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;


@ApplicationScoped 
public class CalculadoraPrecoService {
	
	
	@PostConstruct
	public void init() {
		System.out.println("Init CalculadoraPrecoService");
	}
	
	public double CalculaPreco(int qtde, double precoUni) {
		return qtde * precoUni;
	}

}
