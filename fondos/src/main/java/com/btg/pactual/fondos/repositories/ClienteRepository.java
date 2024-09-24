package com.btg.pactual.fondos.repositories;

import com.btg.pactual.fondos.domain.models.Cliente;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends MongoRepository<Cliente, String> {
}
