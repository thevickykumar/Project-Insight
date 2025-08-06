package com.example.Project.Managemt.System.service;

import com.example.Project.Managemt.System.exception.IssueException;
import com.example.Project.Managemt.System.exception.ProjectException;
import com.example.Project.Managemt.System.exception.UserException;
import com.example.Project.Managemt.System.modal.Issue;
import com.example.Project.Managemt.System.modal.User;
import com.example.Project.Managemt.System.request.IssueRequest;

import java.util.List;
import java.util.Optional;

public interface IssueService {

    Optional<Issue> getIssueById(Long issueId) throws IssueException;

    List<Issue> getIssueByProjectId(Long projectId) throws ProjectException;

    Issue createIssue(IssueRequest issue,Long userid) throws UserException, IssueException, ProjectException;

    Optional<Issue> updateIssue(Long issueid,IssueRequest updatedIssue,Long userid ) throws IssueException, UserException, ProjectException;

    String deleteIssue(Long issueId,Long userid) throws UserException, IssueException;

    List<Issue> getIssuesByAssigneeId(Long assigneeId) throws IssueException;

    List<Issue> searchIssues(String title, String status, String priority, Long assigneeId) throws IssueException;

    List<User> getAssigneeForIssue(Long issueId) throws IssueException;

    Issue addUserToIssue(Long issueId, Long userId) throws UserException, IssueException;

    Issue updateStatus(Long issueId, String status) throws IssueException;

}