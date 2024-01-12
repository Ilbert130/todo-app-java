package com.castilb.todoapp.repositories;

import com.castilb.todoapp.models.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ListRepository extends JpaRepository<List, Integer> {
}
