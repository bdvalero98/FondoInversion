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
@Document(collection = "transaccion")
public class Transaccion {

    @Id
    private String idTransaccion;

    @DBRef
    private Cliente cliente;

    private String tipoTransaccion;
    private Double monto;
    private LocalDate fechaTransaccion;
}
