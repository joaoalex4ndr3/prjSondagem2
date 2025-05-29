package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Departamento;
import com.example.demo.repositories.DepartamentoRepository;

@Service
public class DepartamentoService {
	
private final DepartamentoRepository departamentoRepository;
	
	@Autowired
	public DepartamentoService(DepartamentoRepository departamentoRepository) {
		this.departamentoRepository = departamentoRepository;
	}
	
	public Departamento findDepartamentoByid(Long id) {
		Optional<Departamento> departamento = departamentoRepository.findById(id);
		return departamento.orElse(null);
	}
	
	public List<Departamento> findAllDepartamentos() {
		return departamentoRepository.findAll();
	}
	
	public Departamento saveDepartamentos(Departamento departamento) {
		return departamentoRepository.save(departamento);
		
	}
	
	public void deleteDepartamentoById(Long id) {
		departamentoRepository.deleteById(id);
	}
	
	public Departamento getDepartamentoByName(String nome) {
		return departamentoRepository.procurarPorNome(nome);
	}

	    

}
