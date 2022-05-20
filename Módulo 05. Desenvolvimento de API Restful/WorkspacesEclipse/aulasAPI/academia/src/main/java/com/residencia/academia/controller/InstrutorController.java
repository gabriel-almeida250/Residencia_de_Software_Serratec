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

import com.residencia.academia.enety.Instrutor;
import com.residencia.academia.service.InstrutorService;

@RestController
@RequestMapping("/instrutor")
public class InstrutorController {
	
	@Autowired
	private InstrutorService instrutorService;
	
	@GetMapping
	public ResponseEntity<List<Instrutor>> findAllInstrutor() {
		List<Instrutor> instrutorList = instrutorService.findAllInstrutor();
		return ResponseEntity.ok().body(instrutorList);
	}

	@GetMapping("/{id}")
	public Instrutor findById(@PathVariable(value = "id") Integer id) {
		return instrutorService.findByIdInstrutor(id);
	}

	@GetMapping("nome/{nomeInstrutor}")
	public Instrutor findByNome(@PathVariable(value = "nomeInstrutor") String nome) {
		return instrutorService.findByNomeInstrutor(nome);
	}

	@PostMapping
	public Instrutor save(@RequestBody Instrutor instrutor) {
		return instrutorService.saveInstrutor(instrutor);
	}

	@PutMapping("/{id}")
	public Instrutor update(@PathVariable(value = "id") Integer id, @RequestBody Instrutor instrutor) {
		return instrutorService.updateInstrutor(instrutor);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable Integer id) {
		instrutorService.deleteInstrutor(id);
	}
}
