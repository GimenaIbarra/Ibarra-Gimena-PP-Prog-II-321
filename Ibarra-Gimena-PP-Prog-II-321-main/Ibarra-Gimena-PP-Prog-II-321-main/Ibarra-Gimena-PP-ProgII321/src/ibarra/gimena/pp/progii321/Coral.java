
package ibarra.gimena.pp.progii321;

public class Coral extends EspecieMarina implements FuncionBiologica{
    
    private final double profundidadCrecimiento;

    public Coral(double profundidadCrecimiento, String nombre, String tanque, TipoAgua tipoagua) {
        super(nombre, tanque, tipoagua);
        this.profundidadCrecimiento = profundidadCrecimiento;
    }
    
    @Override
    public void reproducirse() {
        System.out.println("Coral.......^&%^$%%^###$#....reproduciendose");
    }
    
    @Override
    public void respirar() {
        System.out.println("Coral respirando...");
    }
        
    @Override
    public void alimentar() {
        System.out.println("Coral siendo alimentado");
    }
    
     
    @Override
    public String toString() {
        return super.toString() + " Profundidad de Crecimiento: " + profundidadCrecimiento;
    }
    
}
