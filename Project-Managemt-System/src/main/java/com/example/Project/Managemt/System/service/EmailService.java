package com.example.Project.Managemt.System.service;


import com.example.Project.Managemt.System.exception.MailsException;
import jakarta.mail.MessagingException;

public interface EmailService {

    void sendEmailWithToken(String userEmail,String link) throws MessagingException, MailsException;
}
