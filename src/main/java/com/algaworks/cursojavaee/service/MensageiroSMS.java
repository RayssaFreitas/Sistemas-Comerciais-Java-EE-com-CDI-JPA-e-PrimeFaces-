package com.algaworks.cursojavaee.service;

@Urgente
public class MensageiroSMS implements Mensageiro {

	@Override
	public void enviarMensagem(String texto) {
		System.out.println("Enviando mensagem por SMS " + texto);
	}

}
