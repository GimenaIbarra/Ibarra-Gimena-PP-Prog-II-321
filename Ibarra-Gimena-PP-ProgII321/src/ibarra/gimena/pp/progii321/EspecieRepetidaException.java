
package ibarra.gimena.pp.progii321;

public class EspecieRepetidaException extends RuntimeException {
    
    private static final String MESSAGE = "Nombre de la especie repetido.";
    
    public EspecieRepetidaException() {
        super(MESSAGE);
    }
}
