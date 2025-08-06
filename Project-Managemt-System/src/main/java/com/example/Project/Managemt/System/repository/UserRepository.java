package com.example.Project.Managemt.System.repository;

import com.example.Project.Managemt.System.modal.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

   public User findByEmail(String email);
}
