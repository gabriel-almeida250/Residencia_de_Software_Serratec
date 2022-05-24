package com.residencia.academia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.residencia.academia.enety.Atividade;

public interface AtividadeRepository extends JpaRepository<Atividade, Integer> {
	
	Atividade findByNomeAtividade(String nome);
}
