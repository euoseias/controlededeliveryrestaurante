package com.restaurante.service;

import com.restaurante.model.Pedido;
import com.restaurante.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    // Salvar um novo pedido
    public Pedido salvar(Pedido pedido) {
        return pedidoRepository.save(pedido);
    }

    // Listar todos os pedidos
    public List<Pedido> listar() {
        return pedidoRepository.findAll();
    }

    // Buscar um pedido por ID
    public Optional<Pedido> buscarPorId(Long id) {
        return pedidoRepository.findById(id);
    }

    // Deletar um pedido pelo ID
    public void deletar(Long id) {
        pedidoRepository.deleteById(id);
    }

    // Atualizar um pedido (caso necessário)
    public Pedido atualizar(Long id, Pedido pedidoAtualizado) {
        if (pedidoRepository.existsById(id)) {
            pedidoAtualizado.setId(id);  // Garantir que o ID seja mantido
            return pedidoRepository.save(pedidoAtualizado);
        } else {
            return null;
        }
    }
}
