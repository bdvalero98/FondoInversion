package com.btg.pactual.fondos.repositories;

import com.btg.pactual.fondos.domain.models.Producto;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends MongoRepository<Producto, String> {
}
