package br.com.email.controller;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import br.com.email.model.EmailRequisicao;
import br.com.email.service.impl.EnviadorEmailImpl;

@ExtendWith(SpringExtension.class)
class EnviadorEmailControllerTest {
	
	@InjectMocks
	private EnviadorEmailController enviadorEmailController;
	
	@Mock
	private EnviadorEmailImpl enviadorEmailMock;
	
	@BeforeEach
	void setUp() {
		BDDMockito.doNothing().when(enviadorEmailMock).envia("deivisonoliveira.info@gmail.com", "e-mail teste", "corpo do e-mail teste");
	}

	@Test
	void deveEnviarUmEmail() {
		EmailRequisicao emailRequisicao = new EmailRequisicao("deivisonoliveira.info@gmail.com", "e-mail teste", "corpo do e-mail teste");
		
		ResponseEntity<String> resposta = enviadorEmailController.enviaEmail(emailRequisicao);
		
		Assertions.assertThat(resposta).isNotNull();
		Assertions.assertThat(resposta.getBody()).isEqualTo("Email enviado com sucesso!");
		Assertions.assertThat(resposta.getStatusCode()).isEqualTo(HttpStatus.OK);
	}

}
