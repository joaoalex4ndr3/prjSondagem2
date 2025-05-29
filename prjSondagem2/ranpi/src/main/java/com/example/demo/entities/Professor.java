package com.example.demo.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_professor")
public class Professor {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long id; 	
	
	private String nome;
	
	private String email;
	
	private String especialidade;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(
        name = "departamento_id"
       
    )
    private Departamento departamento;


    public Professor() {
    }


	public Professor(Long id, String nome, String email, String especialidade, Departamento departamento) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.especialidade = especialidade;
		this.departamento = departamento;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getEspecialidade() {
		return especialidade;
	}


	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}


	public Departamento getDepartamento() {
		return departamento;
	}


	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

    
	
}
