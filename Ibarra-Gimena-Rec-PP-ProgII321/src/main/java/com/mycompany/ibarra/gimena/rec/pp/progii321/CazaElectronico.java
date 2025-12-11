
package com.mycompany.ibarra.gimena.rec.pp.progii321;

/**
 *
 * @author ibarr
 */
public class CazaElectronico extends CazaJet implements AccionReconocer{
    private final String interferencia;
    
    public CazaElectronico(String interferencia, String nombre, String hangar, TipoDespliegue tipodespliegue) {
        super(nombre, hangar, tipodespliegue);
        this.interferencia = interferencia;
    }
    
    //REVISAR
    //realizar reconocimiento
    
    @Override
    public void realizarReconocimiento() {
        System.out.println("Reconociendo...");
    }
    
    @Override
    public String toString() {
        return super.toString() + " Interferencia Electronica " + interferencia;
    }
}
