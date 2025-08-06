package com.example.Project.Managemt.System.repository;

import com.example.Project.Managemt.System.modal.Chat;
import com.example.Project.Managemt.System.modal.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChatRepository extends JpaRepository<Chat,Long> {

    Chat findByProject(Project projectById);
}
