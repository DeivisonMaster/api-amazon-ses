package br.com.email.config;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.simpleemail.AmazonSimpleEmailService;
import com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClientBuilder;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AmazonSesConfig {
	
	@Value("${aws.region}")
	private String region;
	
	@Value("${aws.accessKeyId}")
	private String accessKey;
	
	@Value("${aws.secretKey}")
	private String secretKey;

	@Bean
	public AmazonSimpleEmailService amazonSimpleEmailService() {
		BasicAWSCredentials credenciais = new BasicAWSCredentials(accessKey, secretKey);
		
		return AmazonSimpleEmailServiceClientBuilder
				.standard()
				.withCredentials(new AWSStaticCredentialsProvider(credenciais))
				.withRegion(region)
				.build();
	}
	
}
