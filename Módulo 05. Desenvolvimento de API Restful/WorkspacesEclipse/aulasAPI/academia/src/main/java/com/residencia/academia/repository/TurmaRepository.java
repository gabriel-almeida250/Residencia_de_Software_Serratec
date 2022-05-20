package com.residencia.academia.repository;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;

import com.residencia.academia.enety.Turma;

public interface TurmaRepository extends JpaRepository<Turma, Integer>{

	Turma findByDataInicio(Date dataIncio);
	Turma findByDataInicioAndDataFim(Date dataIncio, Date dataFim);
}
