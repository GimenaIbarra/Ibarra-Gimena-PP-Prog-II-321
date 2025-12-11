
package com.mycompany.ibarra.gimena.rec.pp.progii321;
/**
 *
 * @author ibarr
 */
public abstract class CazaJet {
    
    private final String indicativo;
    private final String hangar;
    private final TipoDespliegue tipodespliegue;

    public CazaJet(String nombre, String hangar, TipoDespliegue tipodespliegue) {
        this.indicativo = nombre;
        this.hangar = hangar;
        this.tipodespliegue = tipodespliegue;
    }
    
    //REVISAR
    //public abstract void realizarAccionEspecial();
    
    public TipoDespliegue getTipo() {
        return tipodespliegue;
    }
    
    // !! REVISAR
    //public void eliminarCazaPorTipo();
    
    
    @Override
    public String toString() {
        return " Nombre: " + indicativo +" Hangar: " + hangar + " Tipo De Despliegue: " + tipodespliegue;
    }
    
    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        CazaJet caza = (CazaJet) obj;
        return indicativo.equals(caza.indicativo) && hangar.equals(caza.hangar);
    }
    
    @Override
    public int hashCode() {
        return indicativo.hashCode() + hangar.hashCode();
        //return Objects.hash(nombre, tanque);
    }
    
}
