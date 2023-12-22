package com.trantanphong.service.implement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.trantanphong.service.MailerService;

@Service
public class MailerServiceImp implements MailerService {
	@Autowired
	private JavaMailSender javaMailSender;

	@Override
	public void sendMail(String to, String subject, String text) {
		// TODO Auto-generated method stub
		SimpleMailMessage mailMessage = new SimpleMailMessage();
		mailMessage.setFrom("tiemtoahuong1406@gmail.com");
		mailMessage.setTo(to);
		mailMessage.setSubject(subject);
		mailMessage.setText(text);
		javaMailSender.send(mailMessage);
	}
}
