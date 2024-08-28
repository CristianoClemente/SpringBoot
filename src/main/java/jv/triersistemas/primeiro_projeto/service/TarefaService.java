package jv.triersistemas.primeiro_projeto.service;

import java.util.List;
import java.util.Optional;

import jv.triersistemas.primeiro_projeto.dto.TarefaDto;
import jv.triersistemas.primeiro_projeto.entity.TarefaEntity;


public interface TarefaService {
	
	List<TarefaDto> getTodasTarefas();
	
	Optional<TarefaDto> findById(Long id);
	
	TarefaDto adicionarTarefa(TarefaDto novaTarefa);
	
	TarefaDto atualizarTarefa(Long id, TarefaDto tarefaAtualizada);
	
	void removerTarefa(Long id);
}