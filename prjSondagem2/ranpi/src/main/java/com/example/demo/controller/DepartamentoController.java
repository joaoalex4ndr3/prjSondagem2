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

import com.example.demo.entities.Departamento;
import com.example.demo.services.DepartamentoService;


@RestController
@RequestMapping("/departamentos")
public class DepartamentoController {
	
private final DepartamentoService departamentoService;
	
	
	@Autowired
	public DepartamentoController(DepartamentoService departamentoService) {
		this.departamentoService = departamentoService;
	}
	
	@PostMapping("/create")
	public Departamento createDepartamento(@RequestBody Departamento departamento) {
		return departamentoService.saveDepartamentos(departamento);
	}
	
	@GetMapping("/{id}")
	public Departamento getDepartamento(@PathVariable Long id) {
		return departamentoService.findDepartamentoByid(id);
	}
	
	@GetMapping("/all")
	public List<Departamento> getAllDepartamentos(){
		return departamentoService.findAllDepartamentos();
	}
	
	@DeleteMapping("/{id}")
	public void deleteDepartamentos(@PathVariable Long id){
		 departamentoService.deleteDepartamentoById(id);
	}
	
	@GetMapping("/procurar/{nome}")
	public Departamento procurarPorNome(@PathVariable String nome) {
		return departamentoService.getDepartamentoByName(nome);
	}
	 
	 
}
