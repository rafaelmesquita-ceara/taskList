package br.com.tasks.service;

import br.com.tasks.domain.Tarefa;

import java.util.Date;
import java.util.List;

public interface TarefaService {

    void save(Tarefa tarefa);

    void update(Long id, Tarefa tarefa);

    void delete(Long id);

    Tarefa findById(Long id);

    List<Tarefa> findAll();

}