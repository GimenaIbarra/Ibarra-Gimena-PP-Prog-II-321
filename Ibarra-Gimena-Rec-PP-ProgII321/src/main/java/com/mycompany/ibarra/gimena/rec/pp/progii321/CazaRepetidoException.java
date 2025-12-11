
package com.mycompany.ibarra.gimena.rec.pp.progii321;

/**
 *
 * @author ibarr
 */
public class CazaRepetidoException extends RuntimeException {
    
    private static final String MESSAGE = "No se puede agregar un caza repetido.";
    
    public CazaRepetidoException() {
        super(MESSAGE);
    }
}
