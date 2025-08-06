package com.example.Project.Managemt.System.service;

import com.example.Project.Managemt.System.exception.MailsException;
import com.example.Project.Managemt.System.modal.Invitation;
import jakarta.mail.MessagingException;

public interface InvitationService {

    public void sendInvitation(String email, Long projectId) throws MailsException, MessagingException;

    public Invitation acceptInvitation(String token, Long userId) throws Exception;
    public String getTokenByUserMail(String userEmail);
    public void deleteToken(String token);
}
