package br.com.email.service;

import org.springframework.stereotype.Component;

@Component
public interface FabricaEnviadorEmail {

	void envia(String para, String assunto, String corpo);
}
