package com.example.Project.Managemt.System.service;

import com.example.Project.Managemt.System.modal.PasswordResetToken;

public interface PasswordResetTokenService {

    public PasswordResetToken findByToken(String token);

    public void delete(PasswordResetToken resetToken);

}