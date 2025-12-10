
package ibarra.gimena.pp.progii321;

import java.util.ArrayList;
import java.util.List;


public class Acuario {
    private String nombre;
    private final List<EspecieMarina> listaEspecies;

    public Acuario(String nombre) {
        this.nombre = nombre;
        listaEspecies = new ArrayList<>();
    }
    
    private void verificarRepetida(EspecieMarina especie) {
        if(listaEspecies.contains(especie)) {
            throw new EspecieRepetidaException();
        }
    }
    
    public void agregarEspecie(EspecieMarina especie) {
        if(especie == null) {
            throw new IllegalArgumentException();
        }
        verificarRepetida(especie);
        listaEspecies.add(especie);
    }
    
    public void mostrarEspecie() {
        for(EspecieMarina e : listaEspecies) {
            System.out.println(e.toString());
        }
    }
    
    
    
    public void realizarFuncionesBiologicas() {
        for(EspecieMarina e : listaEspecies) {
            if(e instanceof  FuncionBiologica a) {
            a.alimentar();
            a.respirar();
            }
            
        }
                
    }        
        
        
    
    public void filtrarPorTipoAgua(TipoAgua tipo) {
        for(EspecieMarina e : listaEspecies) {
            if(e.getTipo() == tipo) {
                 System.out.println(e.toString());
            }
        }
    }
    
    public void moverEspecies() {
        for(EspecieMarina e : listaEspecies) {
            if(e instanceof Movible m) {
                m.mover();
            }else{
                System.out.println("Esta especie no se puede mover");
            }
        }
    }
    
}

