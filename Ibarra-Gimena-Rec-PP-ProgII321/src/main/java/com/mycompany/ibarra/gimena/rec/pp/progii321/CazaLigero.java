
package com.mycompany.ibarra.gimena.rec.pp.progii321;

/**
 *
 * @author ibarr
 */
public class CazaLigero extends CazaJet implements AccionDespegar, AccionReconocer{
    private final int velocidadMax;

    public CazaLigero(int velocidadMax, String nombre, String hangar, TipoDespliegue tipodespliegue) {
        super(nombre, hangar, tipodespliegue);
        this.velocidadMax = velocidadMax;
    }
    
    //REVISAR
    //maniobraEvasion()
    
    @Override
    public void despegar() {
        System.out.println("Caza Ligero despegando...");
    }
    
    @Override
    public void realizarReconocimiento() {
        System.out.println("Reconociendo...");
    }
    
    @Override
    public String toString() {
        return super.toString() + " Velocidad Máxima: " + velocidadMax;
    }
}
