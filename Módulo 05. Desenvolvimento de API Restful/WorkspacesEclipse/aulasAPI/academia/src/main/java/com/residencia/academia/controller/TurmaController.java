package com.residencia.academia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.residencia.academia.enety.Turma;
import com.residencia.academia.exception.NoSuchElementFoundException;
import com.residencia.academia.service.TurmaService;

@RestController
@RequestMapping("/turma")
public class TurmaController {

	@Autowired
	private TurmaService turmaService;

	@GetMapping
	public ResponseEntity<List<Turma>> findAllTurma() {
		List<Turma> turmaList = turmaService.findAllTurma();
		return ResponseEntity.ok().body(turmaList);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Turma> findById(@PathVariable(value = "id") Integer id) {
		Turma turma = turmaService.findByIdTurma(id);
		if (null == turma) {
			// return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
			throw new NoSuchElementFoundException("Não foi possível encontrar a turma de id: " + id);
		} else {
			return new ResponseEntity<>(turma, HttpStatus.OK);
		}
	}

	@PostMapping
	public ResponseEntity<Turma> save(@RequestBody Turma Turma) {
		Turma turma = turmaService.saveTurma(Turma);
		return new ResponseEntity<>(turma, HttpStatus.CREATED);
	}

	@PutMapping
	public ResponseEntity<Turma> update(@PathVariable(value = "id") Integer id, @RequestBody Turma Turma) {
		Turma novaTurma = turmaService.updateTurma(Turma);
		return new ResponseEntity<>(novaTurma, HttpStatus.CREATED);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> delete(@PathVariable Integer id) {
		Turma turma = turmaService.findByIdTurma(id);
		if (null == turma) {
			throw new NoSuchElementFoundException("Não foi possível excluir a turma de id: " + id + ", ela não existe");
		} else {
			turmaService.deleteTurma(id);
			return new ResponseEntity<>("Deletado com sucesso!", HttpStatus.OK);
		}
	}
}