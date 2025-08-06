package com.example.Project.Managemt.System.service;

import com.example.Project.Managemt.System.exception.IssueException;
import com.example.Project.Managemt.System.exception.UserException;
import com.example.Project.Managemt.System.modal.Comment;

import java.util.List;

public interface CommentService {
    Comment createComment(Long issueId,Long userId,String comment) throws UserException, IssueException;

    void  deleteComment(Long commentId, Long userId) throws UserException, IssueException;

    List<Comment> findCommentByIssueId(Long issueId);

}
