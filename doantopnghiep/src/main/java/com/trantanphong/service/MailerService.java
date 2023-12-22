package com.trantanphong.service;

public interface MailerService {
	void sendMail(String to, String subject, String text);
}
