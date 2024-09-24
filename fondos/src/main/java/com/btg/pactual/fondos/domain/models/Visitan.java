package com.btg.pactual.fondos.domain.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "visitan")
public class Visitan {

    @Id
    private String idVisita;

    @DBRef
    private Cliente cliente;

    @DBRef
    private Sucursal sucursal;

    private LocalDate fechaVisita;
}
