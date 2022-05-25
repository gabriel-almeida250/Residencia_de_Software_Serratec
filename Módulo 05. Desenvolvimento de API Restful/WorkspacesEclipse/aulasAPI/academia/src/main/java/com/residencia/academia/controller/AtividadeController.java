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

import com.residencia.academia.dto.AtividadeDTO;
import com.residencia.academia.entity.Atividade;
import com.residencia.academia.exception.ListaVaziaException;
import com.residencia.academia.exception.NoSuchElementFoundException;
import com.residencia.academia.service.AtividadeService;

@RestController
@RequestMapping("/atividade")
public class AtividadeController {

	@Autowired
	private AtividadeService atividadeService;

	@GetMapping
	public ResponseEntity<List<Atividade>> findAllAtividade() {
		List<Atividade> atividadeList = atividadeService.findAllAtividade();
		if (atividadeList.isEmpty()) {
			throw new ListaVaziaException("Essa lista está vazia");
		} else {
			return ResponseEntity.ok().body(atividadeList);
		}
	}

	@GetMapping("/{id}")
	public ResponseEntity<Atividade> findById(@PathVariable(value = "id") Integer id) {
		Atividade atividade = atividadeService.findByIdAtividade(id);
		if (null == atividade) {
			// return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
			throw new NoSuchElementFoundException("Não foi possível encontrar a atividade de id: " + id);
		} else {
			return new ResponseEntity<>(atividade, HttpStatus.OK);
		}
	}
	
	@GetMapping("/dto/{id}")
	public ResponseEntity<AtividadeDTO> findByIdDTO(@PathVariable(value = "id") Integer id) {
		AtividadeDTO atividadeDTO = atividadeService.findByIdAtividadeDTO(id);
			return new ResponseEntity<>(atividadeDTO, HttpStatus.OK);
	}

	@GetMapping("nome/{nomeAtividade}")
	public ResponseEntity<Atividade> findByNome(@PathVariable(value = "nomeAtividade") String nome) {
		Atividade atividade = atividadeService.findByNomeAtividade(nome);
		if (null == atividade) {
			// return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
			throw new NoSuchElementFoundException("Não foi possível encontrar a atividade com o nome: " + nome);
		} else {
			return new ResponseEntity<>(atividade, HttpStatus.OK);
		}
	}

	@PostMapping
	public ResponseEntity<Atividade> save(@RequestBody Atividade atividade) {
		Atividade Atividade = atividadeService.saveAtividade(atividade);
		return new ResponseEntity<>(Atividade, HttpStatus.CREATED);
	}
	
	@PostMapping("/dto")
	public ResponseEntity<AtividadeDTO> saveDTO(@RequestBody AtividadeDTO atividadeDTO) {
		AtividadeDTO novoAtividadeDTO = atividadeService.saveAtividadeDTO(atividadeDTO);
		return new ResponseEntity<>(novoAtividadeDTO, HttpStatus.CREATED);
	}

	@PutMapping
	public ResponseEntity<Atividade> update(@RequestBody Atividade atividade) {
		Atividade Atividade = atividadeService.updateAtividade(atividade);
		return new ResponseEntity<>(Atividade, HttpStatus.CREATED);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> delete(@PathVariable Integer id) {
		Atividade turma = atividadeService.findByIdAtividade(id);
		if (null == turma) {
			throw new NoSuchElementFoundException(
					"Não foi possível excluir a atividade de id: " + id + ", ela não existe");
		} else {
			atividadeService.deleteAtividade(id);
			return new ResponseEntity<>("Deletado com sucesso!", HttpStatus.OK);
		}
	}
}
