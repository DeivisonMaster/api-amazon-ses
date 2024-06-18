package br.com.email.model;

import io.swagger.v3.oas.annotations.media.Schema;

public record EmailRequisicao(
		@Schema(description = "destinatario do e-mail", example = "email@email.com", required = true) String para, 
		@Schema(description = "assunto do e-mail", example = "lorem ipsum dolor", required = true) String assunto, 
		@Schema(description = "mensagem do e-mail", example = "lorem ipsum dolor", required = true) String corpo) {}
