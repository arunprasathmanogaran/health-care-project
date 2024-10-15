package com.health_plus_pro.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class DoctorEmailServiceImpl implements DoctorEmailService {
	
	@Autowired
    private JavaMailSender sender;                                                                      //inbuilt mail interface

	@Override
	public void sendDocEmail(String to, String sub, String text) {

		SimpleMailMessage s= new SimpleMailMessage();
		
		s.setTo(to);
		s.setSubject(sub);
		s.setText(text);
		
		sender.send(s);
		
			}

}
