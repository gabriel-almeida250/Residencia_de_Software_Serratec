package com.residencia.academia.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.residencia.academia.dto.InstrutorDTO;
import com.residencia.academia.dto.TurmaDTO;
import com.residencia.academia.entity.Instrutor;
import com.residencia.academia.entity.Turma;
import com.residencia.academia.repository.InstrutorRepository;

@Service
public class InstrutorService {

	@Autowired
	InstrutorRepository instrutorRepository;

	public List<Instrutor> findAllInstrutor() {
		return instrutorRepository.findAll();
	}

	public Instrutor findByIdInstrutor(Integer id) {
		return instrutorRepository.findById(id).isPresent() ? instrutorRepository.findById(id).get() : null;
	}

	public InstrutorDTO findByIdInstrutorDTO(Integer id) {
		Instrutor instrutor = instrutorRepository.findById(id).isPresent() ? instrutorRepository.findById(id).get()
				: null;

		InstrutorDTO instrutorDTO = new InstrutorDTO();
		if (null != instrutor) {
			instrutorDTO = converterEntidadeParaDTO(instrutor);
			return instrutorDTO;
		}
		return null;
	}

	public Instrutor findByNomeInstrutor(String nome) {
		return instrutorRepository.findByNomeInstrutor(nome);
	}

	public Instrutor saveInstrutor(Instrutor instrutor) {
		return instrutorRepository.save(instrutor);
	}

	public InstrutorDTO saveInstrutorDTO(InstrutorDTO instrutorDTO) {
		Instrutor instrutor = conversorDTOParaEntidade(instrutorDTO);
		Instrutor instrutorNovo = instrutorRepository.save(instrutor);
		return converterEntidadeParaDTO(instrutorNovo);
	}

	public Instrutor updateInstrutor(Instrutor instrutor) {
		return instrutorRepository.save(instrutor);
	}

	public void deleteInstrutor(Integer id) {
		Instrutor instrutor = instrutorRepository.findById(id).isPresent() ? instrutorRepository.findById(id).get()
				: null;
		instrutorRepository.delete(instrutor);
	}

	private InstrutorDTO converterEntidadeParaDTO(Instrutor instrutor) {
		InstrutorDTO instrutorDTO = new InstrutorDTO();
		instrutorDTO.setDataNascimentoInstrutor(instrutor.getDataNascimento());
		instrutorDTO.setIdInstrutor(instrutor.getIdInstrutor());
		instrutorDTO.setNomeInstrutor(instrutor.getNomeInstrutor());
		instrutorDTO.setRgInstrutor(instrutor.getRg());
		instrutorDTO.setTitulacaoInstrutor(instrutor.getTitulacaoInstrutor());

		List<TurmaDTO> listaTurmaDTO = new ArrayList<>();
		if (null != instrutor.getTurmaList()) {

			for (Turma turma : instrutor.getTurmaList()) {
				TurmaDTO turmaDTO = new TurmaDTO();
				turmaDTO.setDataFim(turma.getDataFim());
				turmaDTO.setDataInicio(turma.getDataInicio());
				turmaDTO.setDuracaoTurma(turma.getDuracaoTurma());
				turmaDTO.setHorarioTurma(turma.getHorarioTurma());
				turmaDTO.setIdTurma(turma.getIdTurma());

				listaTurmaDTO.add(turmaDTO);
			}
			instrutorDTO.setTurmaList(listaTurmaDTO);
		}
		return instrutorDTO;
	}

	private Instrutor conversorDTOParaEntidade(InstrutorDTO instrutorDTO) {
		Instrutor instrutor = new Instrutor();
		instrutor.setDataNascimento(instrutorDTO.getDataNascimentoInstrutor());
		instrutor.setNomeInstrutor(instrutorDTO.getNomeInstrutor());
		instrutor.setRg(instrutorDTO.getRgInstrutor());
		instrutor.setTitulacaoInstrutor(instrutorDTO.getTitulacaoInstrutor());

		return instrutor;
	}
}
