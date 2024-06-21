package br.com.email.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.email.model.EmailRequisicao;
import br.com.email.service.exception.EnviadorEmailExcecao;
import br.com.email.service.impl.EnviadorEmailImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api/emails")
@Slf4j
public class EnviadorEmailController {
	
	@Autowired
	private EnviadorEmailImpl enviadorEmail;
	
	@PostMapping
	@Operation(summary = "Novo e-mail", description = "envio de novos emails")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "operação realizada com sucesso"),
			@ApiResponse(responseCode = "500", description = "erro interno ao enviar email")
	})
	public ResponseEntity<String> enviaEmail(@RequestBody EmailRequisicao emailRequisicao){
		try {
			this.enviadorEmail.envia(emailRequisicao.para(), emailRequisicao.assunto(), emailRequisicao.corpo());
			return new ResponseEntity<>("Email enviado com sucesso!", HttpStatus.OK);
		} catch (EnviadorEmailExcecao e) {
			log.error(e.getMessage(), e.getCause());
			return new ResponseEntity<>(e.getMessage().concat(" -- ").concat(e.getCause().getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
