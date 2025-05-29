package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Professor;

public interface ProfessorRepository extends JpaRepository<Professor, Long> {

	
}
