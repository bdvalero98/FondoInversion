package com.btg.pactual.fondos.domain.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "sucursal")
public class Sucursal {

    @Id
    private String idSucursal;
    private String nombre;
    private String ciudad;

    @DBRef
    private List<Producto> productos;
}
