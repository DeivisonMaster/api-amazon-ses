package br.com.email.service;

import org.springframework.stereotype.Component;

@Component
public interface EnviadorEmail {

	void envia(String para, String assunto, String corpo);
}
