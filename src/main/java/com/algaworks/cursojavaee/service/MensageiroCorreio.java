package com.algaworks.cursojavaee.service;

import javax.enterprise.inject.Default;

@Default
public class MensageiroCorreio implements Mensageiro {

	@Override
	public void enviarMensagem(String texto) {
		System.out.println("Enviando mensagem por correio " + texto);
	}

}
