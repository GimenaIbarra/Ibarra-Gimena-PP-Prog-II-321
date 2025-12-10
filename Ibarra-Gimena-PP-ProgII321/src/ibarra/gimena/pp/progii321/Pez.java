
package ibarra.gimena.pp.progii321;

public class Pez extends EspecieMarina implements FuncionBiologica, Movible{
    
    private final int longMaxima;

    public Pez(int longMaxima, String nombre, String tanque, TipoAgua tipoagua) {
        super(nombre, tanque, tipoagua);
        this.longMaxima = longMaxima;
         }
    
    @Override
    public void mover() {
        System.out.println("Moviendo Peces....");
    }
    

    @Override
    public void respirar() {
        System.out.println("Pez respirando...");
    }
        
    @Override
        public void reproducirse() {
            System.out.println("Pez...^&%^$%%^###$#....reproduciendose");
        }
    
    @Override
    public void alimentar() {
        System.out.println("Pez siendo alimentado");
    }
      
       
    @Override
    public String toString() {
        return super.toString() + " Longitud maxima: " + longMaxima;
    }
}
