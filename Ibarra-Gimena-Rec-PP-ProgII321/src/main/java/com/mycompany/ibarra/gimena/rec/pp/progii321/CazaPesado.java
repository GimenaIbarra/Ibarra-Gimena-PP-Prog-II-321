
package com.mycompany.ibarra.gimena.rec.pp.progii321;

/**
 *
 * @author ibarr
 */
public class CazaPesado extends CazaJet implements AccionDespegar {
    private final int armamentoMax;

    public CazaPesado(int armamentoMax, String nombre, String hangar, TipoDespliegue tipodespliegue) {
        super(nombre, hangar, tipodespliegue);
        this.armamentoMax = armamentoMax;
    }

    // REVISAR
    //ataqueDirigido();
    @Override
    public void despegar() {
        System.out.println("Caza Pesado despegando...");
    }
    
    @Override
    public String toString() {
        return super.toString() + " Capacidad de Armamento máxima " + armamentoMax;
    }
    
}
