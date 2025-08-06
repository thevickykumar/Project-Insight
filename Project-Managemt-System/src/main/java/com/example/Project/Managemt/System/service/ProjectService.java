package com.example.Project.Managemt.System.service;

import com.example.Project.Managemt.System.exception.ChatException;
import com.example.Project.Managemt.System.exception.ProjectException;
import com.example.Project.Managemt.System.exception.UserException;
import com.example.Project.Managemt.System.modal.Chat;
import com.example.Project.Managemt.System.modal.Project;
import com.example.Project.Managemt.System.modal.User;

import java.util.List;

public interface ProjectService {
    Project createProject(Project project, Long userId) throws UserException;

    List<Project> getProjectsByTeam(User user,String category,String tag) throws ProjectException;

    Project getProjectById(Long projectId) throws ProjectException;

    String deleteProject(Long projectId,Long userId) throws UserException;

    Project updateProject(Project updatedProject, Long id) throws ProjectException;

    List<Project> searchProjects(String keyword, User user) throws ProjectException;

    void addUserToProject(Long projectId, Long userId) throws UserException, ProjectException;

    void removeUserFromProject(Long projectId, Long userId) throws UserException, ProjectException;

    Chat getChatByProjectId(Long projectId) throws ProjectException, ChatException;



}
