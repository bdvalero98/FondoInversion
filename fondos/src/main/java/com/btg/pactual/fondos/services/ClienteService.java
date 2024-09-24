package com.btg.pactual.fondos.services;

import com.btg.pactual.fondos.domain.exceptions.ClienteNotFoundException;
import com.btg.pactual.fondos.domain.models.Cliente;
import com.btg.pactual.fondos.repositories.ClienteRepository;
import com.btg.pactual.fondos.repositories.InscripcionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private InscripcionRepository inscripcionRepository;

    public Cliente crearCliente(Cliente cliente) {
        cliente.setSaldo(500000.0);
        return clienteRepository.save(cliente);
    }

    public Cliente obtenerClientePorId(String idCliente) {
        Optional<Cliente> clienteOptional = clienteRepository.findById(idCliente);

        if (clienteOptional.isPresent()) {
            return clienteOptional.get();
        } else {
            throw new ClienteNotFoundException("Cliente con ID: " + idCliente + " no encontrado.");
        }
    }

    public List<Cliente> obtenerTodosLosClientes() {
        return clienteRepository.findAll();
    }

    public Cliente actualizarCliente(String idCliente, Cliente clienteActualizado)
            throws ClienteNotFoundException {
        Cliente clienteExistente = obtenerClientePorId(idCliente);

        clienteExistente.setNombre(clienteActualizado.getNombre());
        clienteExistente.setApellido(clienteActualizado.getApellido());
        clienteExistente.setTelefono(clienteActualizado.getTelefono());
        clienteExistente.setEmail(clienteActualizado.getEmail());
        clienteExistente.setCiudad(clienteActualizado.getCiudad());
        clienteExistente.setSaldo(clienteActualizado.getSaldo());
        clienteExistente.setInscripciones(clienteActualizado.getInscripciones());
        clienteExistente.setVisitas(clienteActualizado.getVisitas());
        clienteExistente.setTransacciones(clienteActualizado.getTransacciones());

        return clienteRepository.save(clienteExistente);
    }

    public void eliminarCliente(String idCliente) {
        Cliente clienteExistente = obtenerClientePorId(idCliente);
        clienteRepository.delete(clienteExistente);
    }
}
