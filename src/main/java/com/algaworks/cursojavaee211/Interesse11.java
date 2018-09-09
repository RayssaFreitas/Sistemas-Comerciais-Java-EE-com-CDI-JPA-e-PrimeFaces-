package com.algaworks.cursojavaee211;

import java.io.Serializable;

public class Interesse11 implements Serializable {

	private static final long serialVersionUID = 1L;

	private String descricao;
	private String nomeIcone;

	public Interesse11() {
	}

	public Interesse11(String descricao, String nomeIcone) {
		this.descricao = descricao;
		this.nomeIcone = nomeIcone;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getNomeIcone() {
		return nomeIcone;
	}

	public void setNomeIcone(String nomeIcone) {
		this.nomeIcone = nomeIcone;
	}
	
}
