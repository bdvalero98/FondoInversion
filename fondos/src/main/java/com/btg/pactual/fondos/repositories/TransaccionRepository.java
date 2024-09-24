package com.btg.pactual.fondos.repositories;

import com.btg.pactual.fondos.domain.models.Transaccion;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransaccionRepository extends MongoRepository<Transaccion, String> {
}
