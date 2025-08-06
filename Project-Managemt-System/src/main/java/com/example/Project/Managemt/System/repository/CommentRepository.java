package com.example.Project.Managemt.System.repository;

import com.example.Project.Managemt.System.modal.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment,Long> {

    List<Comment> findByIssueId(Long issueId);
}
