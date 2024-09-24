package com.btg.pactual.fondos.services;

import com.btg.pactual.fondos.domain.exceptions.ClienteNotFoundException;
import com.btg.pactual.fondos.domain.exceptions.SucursalNotFoundException;
import com.btg.pactual.fondos.domain.exceptions.VisitanNotFoundException;
import com.btg.pactual.fondos.domain.models.Cliente;
import com.btg.pactual.fondos.domain.models.Sucursal;
import com.btg.pactual.fondos.domain.models.Visitan;
import com.btg.pactual.fondos.repositories.ClienteRepository;
import com.btg.pactual.fondos.repositories.SucursalRepository;
import com.btg.pactual.fondos.repositories.VisitanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Service
public class VisitanService {

    @Autowired
    private VisitanRepository visitanRepository;

    @Autowired
    private SucursalRepository sucursalRepository;

    @Autowired
    private ClienteRepository clienteRepository;

    public List<Visitan> obtenerTodasLasVisitas() {
        return visitanRepository.findAll();
    }

    public Visitan obtenerVisitaPorId(String idVisita) {
        return visitanRepository.findById(idVisita)
                .orElseThrow(() -> new VisitanNotFoundException(
                        "Visita con ID: " + idVisita + " no existe."));
    }

    public Visitan regisrarVisita(Visitan visitan) throws ClienteNotFoundException {
        Cliente cliente = clienteRepository.findById(visitan.getCliente().getIdCliente())
                .orElseThrow(() -> new ClienteNotFoundException(
                        "Cliente con ID: " + visitan.getCliente().getIdCliente() + " no existe."));
        Sucursal sucursal = sucursalRepository.findById(visitan.getSucursal().getIdSucursal())
                .orElseThrow(() -> new SucursalNotFoundException(
                        "Sucursal con ID: " + visitan.getSucursal().getIdSucursal() + " no existe."));
        visitan.setIdVisita(UUID.randomUUID().toString());
        visitan.setFechaVisita(LocalDate.now());

        return visitanRepository.save(visitan);
    }

    public void eliminarVisita(String idVisita) throws VisitanNotFoundException {
        Visitan visitan = obtenerVisitaPorId(idVisita);
        visitanRepository.delete(visitan);
    }
}
