package com.residencia.academia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
	public Turma findById(@PathVariable(value = "id") Integer id) {
		return turmaService.findByIdTurma(id);
	}

	@PostMapping
	public Turma save(@RequestBody Turma Turma) {
		return turmaService.saveTurma(Turma);
	}

	@PutMapping("/{id}")
	public Turma update(@PathVariable(value = "id") Integer id, @RequestBody Turma turma) {
		return turmaService.updateTurma(turma);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable Integer id) {
		turmaService.deleteTurma(id);
	}
}
