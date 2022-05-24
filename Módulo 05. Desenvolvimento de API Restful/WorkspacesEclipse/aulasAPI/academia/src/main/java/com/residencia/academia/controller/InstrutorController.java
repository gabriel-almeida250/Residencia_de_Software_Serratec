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

import com.residencia.academia.enety.Instrutor;
import com.residencia.academia.exception.NoSuchElementFoundException;
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
	public ResponseEntity<Instrutor> findById(@PathVariable(value = "id") Integer id) {
		Instrutor instrutor = instrutorService.findByIdInstrutor(id);
		if (null == instrutor) {
			// return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
			throw new NoSuchElementFoundException("Não foi possível encontrar o instrutor de id: " + id);
		} else {
			return new ResponseEntity<>(instrutor, HttpStatus.OK);
		}
	}

	@GetMapping("nome/{nomeInstrutor}")
	public ResponseEntity<Instrutor> findByNome(@PathVariable(value = "nomeInstrutor") String nome) {
		Instrutor instrutor = instrutorService.findByNomeInstrutor(nome);
		if (null == instrutor) {
			// return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
			throw new NoSuchElementFoundException("Não foi possível encontrar o instrutor com o nome: " + nome);
		} else {
			return new ResponseEntity<>(instrutor, HttpStatus.OK);
		}
	}

	@PostMapping
	public ResponseEntity<Instrutor> save(@RequestBody Instrutor instrutor) {
		Instrutor Instrutor = instrutorService.saveInstrutor(instrutor);
		return new ResponseEntity<>(Instrutor, HttpStatus.CREATED);
	}

	@PutMapping
	public ResponseEntity<Instrutor> update(@RequestBody Instrutor instrutor) {
		Instrutor Instrutor = instrutorService.updateInstrutor(instrutor);
		return new ResponseEntity<>(Instrutor, HttpStatus.CREATED);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> delete(@PathVariable Integer id) {
		Instrutor instrutor = instrutorService.findByIdInstrutor(id);
		if (null == instrutor) {
			// return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
			throw new NoSuchElementFoundException("Não foi possível deletar o instrutor com o id: " + id);
		} else {
			instrutorService.deleteInstrutor(id);
			return new ResponseEntity<>("Deletado com sucesso!", HttpStatus.OK);
		}
	}

}
