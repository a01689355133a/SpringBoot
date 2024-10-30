package com.example.demo.crud.repository;

import com.example.demo.crud.entity.entityStudent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface repositoryStudent extends JpaRepository<entityStudent, Integer> {
}
