package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entities.Departamento;

public interface DepartamentoRepository extends JpaRepository<Departamento, Long> {

@Query(value="SELECT * FROM tb_departamento WHERE LOWER(nome) LIKE LOWER(CONCAT('%', :nome, '%'))", nativeQuery=true)
Departamento procurarPorNome(@Param("nome") String nome);
	
}
