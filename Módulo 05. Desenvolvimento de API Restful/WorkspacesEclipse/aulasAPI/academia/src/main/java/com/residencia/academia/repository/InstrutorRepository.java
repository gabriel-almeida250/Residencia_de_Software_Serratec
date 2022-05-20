package com.residencia.academia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.residencia.academia.enety.Instrutor;

public interface InstrutorRepository extends JpaRepository<Instrutor, Integer> {
	
	Instrutor findByInstrutorNome(String nome);
}
