
package ibarra.gimena.pp.progii321;

public class IbarraGimenaPPProgII321 {

   
    public static void main(String[] args) {
        
        Acuario Ac = new Acuario("Aquarium");
        cargarAcuario(Ac);
        
        
        Ac.realizarFuncionesBiologicas();
        System.out.println(Utils.obtenerSepHorizontal(40));
        Ac.filtrarPorTipoAgua(TipoAgua.AGUA_SALADA);
        System.out.println(Utils.obtenerSepHorizontal(40));
        Ac.mostrarEspecie();
        System.out.println(Utils.obtenerSepHorizontal(40));
        Ac.moverEspecies();
        System.out.println(Utils.obtenerSepHorizontal(40));
        
    }
    
    public static void cargarAcuario(Acuario Ac) {
        Pez p1 = new Pez(30, "Pez Payaso", "Tanque Norte", TipoAgua.AGUA_DULCE);
        //Pez p2 = new Pez(40, "Pez Payaso", "Tanque Norte", TipoAgua.AGUA_DULCE);
        Pez p3 = new Pez(50, "Tararira", "Tanque Este", TipoAgua.AGUA_SALADA);
        
        Molusco m1 = new Molusco("Espiralada", "Almeja", "Tanque Sur", TipoAgua.AGUA_DULCE);
        Molusco m2 = new Molusco("Bivalba", "Krill", "Tanque Norte", TipoAgua.AGUA_DULCE);
        Molusco m3 = new Molusco("Espiralada", "Abalon", "Tanque Sur", TipoAgua.AGUA_SALADA);
        
        Coral c1 = new Coral(0.1, "Acropora", "Tanque Oeste", TipoAgua.AGUA_SALADA);
        Coral c2 = new Coral(0.3, "Corallium", "Tanque Oeste", TipoAgua.AGUA_SALADA);
        Coral c3 = new Coral(0.1, "Fungia", "Tanque Oeste", TipoAgua.AGUA_SALADA);
        
        try{
        Ac.agregarEspecie(p1);
        //ac.agregarEspecie(p2);
        Ac.agregarEspecie(p3);
        Ac.agregarEspecie(m1);
        Ac.agregarEspecie(m2);
        Ac.agregarEspecie(m3);
        Ac.agregarEspecie(c1);
        Ac.agregarEspecie(c2);
        Ac.agregarEspecie(c3);
        }catch(EspecieRepetidaException ex) {
            System.out.println(ex.getMessage());
        }
        
    }
    
    
}
