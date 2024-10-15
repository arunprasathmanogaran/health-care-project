package com.health_plus_pro.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class PatientEmailServiceImpl implements PatientEmailService {

	@Autowired
	private JavaMailSender sender;
	
	@Override
	public void sendPatEmail(String to, String sub, String text) {
		
		
		SimpleMailMessage s = new SimpleMailMessage();
		
		s.setTo(to);
		s.setSubject(sub);
		s.setText(text);
		
		sender.send(s);
		
		
		
	}

}
