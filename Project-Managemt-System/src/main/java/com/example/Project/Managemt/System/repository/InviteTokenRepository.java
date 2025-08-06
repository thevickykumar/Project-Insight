package com.example.Project.Managemt.System.repository;

import com.example.Project.Managemt.System.modal.Invitation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InviteTokenRepository extends JpaRepository<Invitation, Long> {

    void deleteByToken(String token);

    Invitation findByToken(String token);

    Invitation findByEmail(String userEmail);
}
