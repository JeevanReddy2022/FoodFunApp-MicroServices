/*package com.Userservice.Service;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {
	
	private JavaMailSender mailSender;

	

	public void sendSimpleEmail(String email, String body, String subject) {
		SimpleMailMessage message = new SimpleMailMessage();
		message.setFrom("foodfunapp@gmail.com");
		message.setTo(email);
		message.setText(body);
		message.setSubject(subject);

		mailSender.send(message);

		
	}

}*/
package com.Userservice.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {
private final JavaMailSender mailSender;

	@Autowired
	public EmailService (JavaMailSender mailSender) {
		this.mailSender = mailSender;
	}

	

	public void sendSimpleEmail(String email, String body, String subject) {
		SimpleMailMessage message = new SimpleMailMessage();
		message.setFrom("foodfunapp@gmail.com");
		message.setTo(email);
		message.setText(body);
		message.setSubject(subject);

		mailSender.send(message);

		
	}

}


