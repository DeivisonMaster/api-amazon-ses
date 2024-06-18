package br.com.email.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.email.service.EnviadorEmail;
import br.com.email.service.FabricaEnviadorEmail;

@Service
public class EnviadorEmailImpl implements EnviadorEmail{

	@Autowired
	private FabricaEnviadorEmail fabricaEnviadorEmail;
	
	@Override
	public void envia(String para, String assunto, String corpo) {
		this.fabricaEnviadorEmail.envia(para, assunto, corpo);
	}

}
