package jv.triersistemas.primeiro_projeto.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Tarefa {

	private Long id;
	private String titulo;
	private String descricao;
	private boolean completa;

}
