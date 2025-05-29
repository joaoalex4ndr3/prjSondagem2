package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Professor;
import com.example.demo.services.ProfessorService;

@RestController
@RequestMapping("/professores")
public class ProfessorController {
	
	private final ProfessorService professorService;
	
	@Autowired
	public ProfessorController(ProfessorService professorService) {
		this.professorService = professorService;
	}
	
	@PostMapping("/create")
	public Professor createProfessor(@RequestBody Professor professor) {
		return professorService.saveProfessor(professor);
	}
	
	@GetMapping("/{id}")
	public Professor getProfessor(@PathVariable Long id) {
		return professorService.findProfessorByid(id);
	}
	
	@GetMapping("/all")
	public List<Professor> getAllProfessor(){
		return professorService.findAllProfessor();
	}
	
	@DeleteMapping("/{id}")
	public void deleteProfessor(Long id){
		 professorService.deleteProfessorById(id);
	}


}
