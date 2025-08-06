package com.example.Project.Managemt.System.service;

import com.example.Project.Managemt.System.exception.ProjectException;
import com.example.Project.Managemt.System.exception.UserException;
import com.example.Project.Managemt.System.modal.User;

public interface UserService {

    public User findUserProfileByJwt(String jwt) throws UserException, ProjectException;

    public User findUserByEmail(String email) throws UserException;

    public User findUserById(Long userId) throws UserException;

    public User updateUsersProjectSize(User user,int number);

    void updatePassword(User user, String newPassword);

    void sendPasswordResetEmail(User user);

}

