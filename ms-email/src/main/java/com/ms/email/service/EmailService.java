package com.ms.email.service;

import com.ms.email.enums.EnumStatusEmail;
import com.ms.email.model.EmailModel;
import com.ms.email.repository.IEmailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class EmailService {

    @Autowired
    IEmailRepository repository;

    @Autowired
    JavaMailSender emailSender;

    public EmailModel sendEmail(final EmailModel entity) {
        entity.setSendDateEmail(LocalDateTime.now());

        try {
            SimpleMailMessage message = new SimpleMailMessage();
            message.setFrom(entity.getEmailFrom());
            message.setTo(entity.getEmailTo());
            message.setSubject(entity.getSubject());
            message.setText(entity.getText());
            emailSender.send(message);

            entity.setStatusEmail(EnumStatusEmail.SENT);
        } catch (MailException e) {
            entity.setStatusEmail(EnumStatusEmail.ERROR);
        } finally {
            return repository.save(entity);
        }
    }
}
