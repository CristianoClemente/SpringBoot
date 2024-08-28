package jv.triersistemas.primeiro_projeto.controller;

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

import jv.triersistemas.primeiro_projeto.dto.TarefaDto;
import jv.triersistemas.primeiro_projeto.entity.TarefaEntity;
import jv.triersistemas.primeiro_projeto.repository.TarefaRepository;
import jv.triersistemas.primeiro_projeto.service.TarefaService;

@RestController
@RequestMapping("/tarefas")
public class TarefaController {

	@Autowired
	private TarefaRepository repository;

//	@GetMapping
//	public List<TarefaEntity> getTodasTarefas() {
//		return repository.getTodasTarefas();
//	}
//
//	@GetMapping("/{id}")
//	public ResponseEntity<TarefaEntity> getTarefaPorId(@PathVariable Long id) {
//		return repository.findById(id).map(ResponseEntity::ok)
//				.orElseGet(() -> ResponseEntity.status(HttpStatus.NOT_FOUND).body(null));
//	}
//
//	@PostMapping
//	public TarefaDto adicionarTarefa(@RequestBody TarefaDto novaTarefa) {
//		return repository.save(new TarefaEntity(novaTarefa));
//	}
//
//	@PutMapping("/{id}")
//	public TarefaDto atualizarTarefa(@PathVariable Long id, @RequestBody TarefaDto tarefaAtualizada) {
//		return repository.save(null);
//	}
//
//	@DeleteMapping("/{id}")
//	public void removerTarefa(@PathVariable Long id) {
//		repository.deleteAll(removerTarefa(id));
//	}

}