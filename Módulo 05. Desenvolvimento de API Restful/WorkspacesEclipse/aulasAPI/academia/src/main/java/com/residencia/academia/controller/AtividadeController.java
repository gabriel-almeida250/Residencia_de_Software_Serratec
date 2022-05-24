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

import com.residencia.academia.enety.Atividade;
import com.residencia.academia.service.AtividadeService;

@RestController
@RequestMapping("/atividade")
public class AtividadeController {

	@Autowired
	private AtividadeService atividadeService;

	@GetMapping
	public ResponseEntity<List<Atividade>> findAllAtividade() {
		List<Atividade> instrutorList = atividadeService.findAllAtividade();
		return ResponseEntity.ok().body(instrutorList);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Atividade> findById(@PathVariable(value = "id") Integer id) {
		Atividade instrutor = atividadeService.findByIdAtividade(id);
		if(null == instrutor) {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
		}else {
        return new ResponseEntity<>(instrutor, HttpStatus.OK);
		}
	}

	@GetMapping("nome/{nomeAtividade}")
	public ResponseEntity<Atividade> findByNome(@PathVariable(value = "nomeAtividade") String nome) {
		Atividade atividade = atividadeService.findByNomeAtividade(nome);
		if (null == atividade) {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
		} else {
			return new ResponseEntity<>(atividade, HttpStatus.OK);
		}
	}

	@PostMapping
	public ResponseEntity<Atividade> save(@RequestBody Atividade instrutor) {
		Atividade Atividade = atividadeService.saveAtividade(instrutor);
		return new ResponseEntity<>(Atividade, HttpStatus.CREATED);
	}

	@PutMapping
	public ResponseEntity<Atividade> update( @RequestBody Atividade instrutor) {
		Atividade Atividade = atividadeService.updateAtividade(instrutor);
		return new ResponseEntity<>(Atividade, HttpStatus.CREATED);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> delete(@PathVariable Integer id) {
		atividadeService.deleteAtividade(id);
		return new ResponseEntity<>("Deletado com sucesso!", HttpStatus.OK);
	}
}
