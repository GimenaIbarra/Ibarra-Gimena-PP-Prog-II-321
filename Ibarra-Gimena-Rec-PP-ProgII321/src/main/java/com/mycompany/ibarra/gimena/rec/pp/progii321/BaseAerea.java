
package com.mycompany.ibarra.gimena.rec.pp.progii321;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ibarr
 */
public class BaseAerea {
    
    private String nombre;
    private final List<CazaJet> listaCazas;
    
    public BaseAerea(String nombre) {
        this.nombre = nombre;
        listaCazas = new ArrayList<>();
    }
    
    private void verificarCazaRepetido(CazaJet caza) {
        if(listaCazas.contains(caza)) {
            throw new CazaRepetidoException();
        }
    }
    
    public void agregarCaza(CazaJet caza) {
        if(caza == null) {
            throw new IllegalArgumentException();
        }
        verificarCazaRepetido(caza);
        listaCazas.add(caza);
    }
    
    public void mostrarCaza(){
        for(CazaJet e : listaCazas) {
            System.out.println(e.toString());
        }
    }
    
    
    
    public void realizarAccionDespegar() {
        for(CazaJet e : listaCazas) {
            if(e instanceof  AccionDespegar a) {
            a.despegar();
            //a.realizarReconocimiento();
            }
            
        }
                
    }
    
    
    
    public void filtrarPorTipoDespliegue(TipoDespliegue tipo) {
        for(CazaJet e : listaCazas) {
            if(e.getTipo() == tipo) {
                 System.out.println(e.toString());
            }
        }
    }
    
    public void despegarCaza() {
        for(CazaJet e : listaCazas) {
            if(e instanceof AccionDespegar acc) {
                acc.despegar();
            }else {
                System.out.println("Este Caza no puede despegar.");
            }
        }
    }
    
    public void realizarReconocimiento() {
        for(CazaJet e : listaCazas) {
            if(e instanceof AccionReconocer acc) {
                acc.realizarReconocimiento();
            }else {
                System.out.println("Este Caza no puede realizar el reconocimiento.");
            }
        }
    }
    
}
