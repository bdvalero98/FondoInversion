package com.btg.pactual.fondos.repositories;

import com.btg.pactual.fondos.domain.models.Sucursal;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SucursalRepository extends MongoRepository<Sucursal, String> {
}
