package com.btg.pactual.fondos.repositories;

import com.btg.pactual.fondos.domain.models.Inscripcion;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InscripcionRepository extends MongoRepository<Inscripcion, String> {
}
