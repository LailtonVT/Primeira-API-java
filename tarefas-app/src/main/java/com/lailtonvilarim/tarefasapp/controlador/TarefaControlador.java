package com.lailtonvilarim.tarefasapp.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lailtonvilarim.tarefasapp.Tarefa;
import com.lailtonvilarim.tarefasapp.servico.TarefaServico;

@RestController
@RequestMapping("/tarefas")
public class TarefaControlador {
    @Autowired
    private TarefaServico tarefaServico;

    @GetMapping
    public List<Tarefa> listarTarefas() {
        return tarefaServico.obterTodasTarefas();
    }

    @PostMapping
    public Tarefa criarTarefa(@RequestBody Tarefa tarefa) {
        return tarefaServico.criarTarefa(tarefa);
    }

    @PutMapping
    public Tarefa atualizarTarefa(@RequestBody Tarefa tarefa) {
        return tarefaServico.atualizarTarefa(tarefa);
    }

    @DeleteMapping("/{id}")
    public void excluirTarefa(@PathVariable Long id) {
        tarefaServico.excluirTarefa(id);
    }
}
