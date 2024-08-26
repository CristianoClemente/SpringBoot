package jv.triersistemas.primeiro_projeto.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jv.triersistemas.primeiro_projeto.model.Tarefa;

/**
 * 
 */
@RestController
@RequestMapping("/tarefa")
public class TarefaController {

	ArrayList<Tarefa> tarefas = new ArrayList<Tarefa>();
	private static Tarefa tarefa = new Tarefa();
	private long contador = -1;

	@GetMapping
	public List<Tarefa> getTarefas() {
		
		return tarefas;
	}

	@GetMapping("/tarefa/{id}")
	public List<Tarefa> getTarefas(@PathVariable long id) {
		return tarefas;
	}
	@PostMapping
	public void salvaProduto(@RequestBody Tarefa tarefaRequest) {
		contador++;
		tarefa = tarefaRequest;
		tarefa.setId(contador);
		tarefas.add(tarefa);
	}

}
