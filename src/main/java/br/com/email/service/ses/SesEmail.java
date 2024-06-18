package br.com.email.service.ses;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.services.simpleemail.AmazonSimpleEmailService;
import com.amazonaws.services.simpleemail.model.Body;
import com.amazonaws.services.simpleemail.model.Content;
import com.amazonaws.services.simpleemail.model.Destination;
import com.amazonaws.services.simpleemail.model.Message;
import com.amazonaws.services.simpleemail.model.SendEmailRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.email.service.FabricaEnviadorEmail;
import br.com.email.service.exception.EnviadorEmailExcecao;

@Service
public class SesEmail implements FabricaEnviadorEmail {
	
	@Autowired
	private AmazonSimpleEmailService amazonSimpleEmailService;

	@Override
	public void envia(String para, String assunto, String corpo) {
		SendEmailRequest request = new SendEmailRequest()
				.withSource("seu_email_aws_ses_aqui@email.com")
				.withDestination(new Destination().withToAddresses(para))
				.withMessage(new Message()
						.withSubject(new Content(assunto))
						.withBody(new Body().withText(new Content(corpo))));
		
		try {
			this.amazonSimpleEmailService.sendEmail(request);
		} catch (AmazonServiceException e) {
			throw new EnviadorEmailExcecao("Falhou ao enviar o e-mail", e);
		}
	}

}
