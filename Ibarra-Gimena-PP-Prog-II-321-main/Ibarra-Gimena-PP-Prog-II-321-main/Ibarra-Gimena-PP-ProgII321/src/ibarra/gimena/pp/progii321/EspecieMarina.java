
package ibarra.gimena.pp.progii321;

import java.util.Objects;

public abstract class EspecieMarina {
    private final String nombre;
    private final String tanque;
    private final TipoAgua tipoagua;

    public EspecieMarina(String nombre, String tanque, TipoAgua tipoagua) {
        this.nombre = nombre;
        this.tanque = tanque;
        this.tipoagua = tipoagua;
    }
    
    public abstract void reproducirse();
    
    //public abstract void respirar();
    
    public TipoAgua getTipo() {
        return tipoagua;
    }
    
    @Override
    public String toString() {
        return " Nombre: " + nombre+" Tanque: " + tanque + " Tipo De Agua: " + tipoagua;
    }
    
    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        EspecieMarina especie = (EspecieMarina) obj;
        return nombre.equals(especie.nombre) && tanque.equals(especie.tanque);
    }
    
    @Override
    public int hashCode() {
        return nombre.hashCode() + tanque.hashCode();
        //return Objects.hash(nombre, tanque);
    }
}

