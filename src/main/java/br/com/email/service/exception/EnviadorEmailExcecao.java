package br.com.email.service.exception;

public class EnviadorEmailExcecao extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public EnviadorEmailExcecao(String mensagem) {
		super(mensagem);
	}
	
	public EnviadorEmailExcecao(String mensagem, Throwable causa) {
		super(mensagem, causa);
	}
}	
