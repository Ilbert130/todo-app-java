package com.castilb.todoapp.repositories;

import com.castilb.todoapp.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
