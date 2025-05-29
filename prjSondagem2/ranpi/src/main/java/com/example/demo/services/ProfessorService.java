package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Professor;
import com.example.demo.repositories.ProfessorRepository;

@Service
public class ProfessorService {
	
private final ProfessorRepository professorRepository;
	
	@Autowired
	public ProfessorService(ProfessorRepository professorRepository) {
		this.professorRepository = professorRepository;
	}
	
	public Professor findProfessorByid(Long id) {
		Optional<Professor> professor = professorRepository.findById(id);
		return professor.orElse(null);
	}
	
	public List<Professor> findAllProfessor() {
		return professorRepository.findAll();
	}
	
	public Professor saveProfessor(Professor professor) {
		return professorRepository.save(professor);
		
	}
	
	public void deleteProfessorById(Long id) {
		professorRepository.deleteById(id);
	}
	
}
	
	
