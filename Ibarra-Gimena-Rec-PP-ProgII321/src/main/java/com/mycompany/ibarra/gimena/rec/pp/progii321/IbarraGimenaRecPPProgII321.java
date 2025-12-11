
package com.mycompany.ibarra.gimena.rec.pp.progii321;

/**
 *
 * @author ibarr
 */
public class IbarraGimenaRecPPProgII321 {

    public static void main(String[] args) {
        
        BaseAerea bA = new BaseAerea("Thunder Strike");
        cargarBase(bA);
        
        
        bA.realizarAccionDespegar();
        System.out.println(Utils.obtenerSepHorizontal(40));
        bA.filtrarPorTipoDespliegue(TipoDespliegue.AIRE);
        System.out.println(Utils.obtenerSepHorizontal(40));
        bA.mostrarCaza();
        System.out.println(Utils.obtenerSepHorizontal(40));
        bA.despegarCaza();
        System.out.println(Utils.obtenerSepHorizontal(40));
        
    }
    
    public static void cargarBase(BaseAerea bA) {
        CazaLigero cL1 = new CazaLigero(130, "Luis", "Hangar 8", TipoDespliegue.AIRE);

        CazaLigero cL2 = new CazaLigero(150, "Jose", "Hangar 2", TipoDespliegue.TIERRA);
        
        CazaPesado cP1 = new CazaPesado(50, "Jose", "Hangar 4", TipoDespliegue.TIERRA);
        
        CazaElectronico cE1 = new CazaElectronico("Radar", "Jose", "Hangar 9", TipoDespliegue.AIRE);
        
        try{
        bA.agregarCaza(cL1);
        bA.agregarCaza(cL2);
        bA.agregarCaza(cP1);
        bA.agregarCaza(cE1);
        }catch(CazaRepetidoException ex) {
            System.out.println(ex.getMessage());
        }
        /*
        La Base Aérea Internacional “Thunder Strike” necesita un sistema para gestionar los cazas jet que operan en
        sus diferentes misiones.
        En la base se registran distintos tipos de cazas:
        • CazaLigero
        • CazaPesado
        • CazaElectrónico
        
        Cada caza cuenta con:
        • un indicativo (nombre/identificador del piloto o del jet),  
        • un hangar donde se almacena,
        • un tipo de despliegue (AIRE o TIERRA). (Enum obligatorio)
        Además, cada tipo de caza posee atributos y capacidades específicas:
        
        CazaLigero
        • Velocidad máxima (en Mach)
        • Puede realizar maniobraEvasion()
        
        CazaPesado
        • Capacidad máxima de armamento (número de misiles)
        • Puede realizar ataqueDirigido()
        
        CazaElectrónico
        • Tipo de interferencia electrónica (por ejemplo: “Radar”, “Comunicaciones”, etc.)
        • Puede realizar bloquearSistemasEnemigos()
        
        Acciones compartidas (dependiendo del tipo)
        • despegar()
        Solo puede ser ejecutado por CazaLigero y CazaPesado.
        • realizarReconocimiento()
        Solo puede ser ejecutado por CazaElectrónico y CazaLigero.
        Se deben informar los errores cuando un tipo de caza no pueda ejecutar una acción.
        
        Funcionalidades requeridas del sistema
        Implementar un sistema que permita:
        1. agregarCaza(Caza caza)
        Agrega cualquier tipo de caza al sistema.
        Debe lanzarse una excepción personalizada si ya existe un caza con el mismo indicativo y mismo hangar.
        
        2. mostrarCazas()
        Muestra todos los cazas registrados, indicando:
        • indicativo
        • hangar
        • tipo de despliegue
        • atributos específicos según el tipo de caza.
        
        3. despegar()
        Ejecuta la acción para los cazas que la tengan permitida.
        En caso contrario, debe informarse que el caza no puede despegar.
        
        4. realizarAccionEspecial()
        Ejecuta:
        • maniobraEvasion() → CazaLigero
        • ataqueDirigido() → CazaPesado
        • bloquearSistemasEnemigos() → CazaElectrónico
        Si la acción no corresponde al tipo de caza, debe informarse el error.
        
        5. filtrarPorTipoDespliegue(TipoDespliegue tipo)
        Devuelve e imprime todos los cazas cuyo despliegue sea AIRE o TIERRA.
        
        6. eliminarCazasPorTipo(String tipoCaza)
        Elimina todos los cazas del tipo solicitado y muestra cuántos fueron eliminados.
        
        Se solicita
        1. Diagrama de clases completo en UMLetino, incluyendo:
        o Herencia adecuada
        o Enum
        o Interfaz (si se usa para acciones)
        o Visibilidad
        o Acciones especiales
        2. Implementación en Java de todas las funcionalidades solicitadas.
        */
    }
}
