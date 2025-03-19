package com.restaurante.service;

import com.restaurante.model.Entrega;
import com.restaurante.repository.EntregaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EntregaService {

    @Autowired
    private EntregaRepository entregaRepository;

    // Salvar uma nova entrega
    public Entrega salvar(Entrega entrega) {
        return entregaRepository.save(entrega);
    }

    // Listar todas as entregas
    public List<Entrega> listar() {
        return entregaRepository.findAll();
    }

    // Buscar uma entrega por ID
    public Optional<Entrega> buscarPorId(Long id) {
        return entregaRepository.findById(id);
    }

    // Deletar uma entrega pelo ID
    public void deletar(Long id) {
        entregaRepository.deleteById(id);
    }

    // Atualizar uma entrega (caso necessário)
    public Entrega atualizar(Long id, Entrega entregaAtualizada) {
        if (entregaRepository.existsById(id)) {
            entregaAtualizada.setId(id);  // Garantir que o ID seja mantido
            return entregaRepository.save(entregaAtualizada);
        } else {
            return null;
        }
    }
}
