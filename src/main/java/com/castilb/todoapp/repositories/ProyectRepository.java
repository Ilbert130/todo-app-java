package com.castilb.todoapp.repositories;

import com.castilb.todoapp.models.Proyect;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProyectRepository extends JpaRepository<Proyect, Integer> {
}
