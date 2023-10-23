package com.lailtonvilarim.tarefasapp.servico;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lailtonvilarim.tarefasapp.Tarefa;
import com.lailtonvilarim.tarefasapp.modelo.repositorio.TarefaRepositorio;

@Service
public class TarefaServico {
    @Autowired
    private TarefaRepositorio tarefaRepositorio;

    public List<Tarefa> obterTodasTarefas() {
        return tarefaRepositorio.findAll();
    }

    public Tarefa criarTarefa(Tarefa tarefa) {
        return tarefaRepositorio.save(tarefa);
    }

    public Tarefa atualizarTarefa(Tarefa tarefa) {
        return tarefaRepositorio.save(tarefa);
    }

    public void excluirTarefa(Long id) {
        tarefaRepositorio.deleteById(id);
    }
}
