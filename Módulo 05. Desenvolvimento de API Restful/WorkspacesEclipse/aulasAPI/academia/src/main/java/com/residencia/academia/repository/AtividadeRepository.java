package com.residencia.academia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.residencia.academia.enety.Atividade;
import com.residencia.academia.enety.Instrutor;

public interface AtividadeRepository extends JpaRepository<Atividade, Integer> {
	
	Instrutor findByNomeAtividade(String nome);
}
