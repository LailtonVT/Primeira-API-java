package com.lailtonvilarim.tarefasapp.modelo.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lailtonvilarim.tarefasapp.Tarefa;

public interface TarefaRepositorio extends JpaRepository<Tarefa, Long> {
}
