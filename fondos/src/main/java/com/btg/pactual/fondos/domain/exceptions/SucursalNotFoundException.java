package com.btg.pactual.fondos.domain.exceptions;

public class SucursalNotFoundException extends RuntimeException {

    public SucursalNotFoundException(String mensaje) {
        super(mensaje);
    }
}
