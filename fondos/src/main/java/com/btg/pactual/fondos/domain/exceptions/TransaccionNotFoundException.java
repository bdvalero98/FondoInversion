package com.btg.pactual.fondos.domain.exceptions;

public class TransaccionNotFoundException extends RuntimeException {

    public TransaccionNotFoundException(String mensaje) {
        super(mensaje);
    }
}
