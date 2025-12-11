
package ibarra.gimena.pp.progii321;


public class Molusco extends EspecieMarina implements FuncionBiologica, Movible {
    
    private final String tipoDeConcha;

    public Molusco(String tipoDeConcha, String nombre, String tanque, TipoAgua tipoagua) {
        super(nombre, tanque, tipoagua);
        this.tipoDeConcha = tipoDeConcha;
    }
    
   
    @Override
    public void mover() {
        System.out.println("Moviendo Moluscos....");
    }
    
    
    @Override
    public void reproducirse() {
        System.out.println("Molusco ^&%^$%%^###$#....reproduciendose");
    }
    
    @Override
    public void respirar() {
        System.out.println("Molusco respirando...");
    }
    
    @Override
    public void alimentar() {
        System.out.println("Molusco siendo alimentado");
    }
     
    @Override
    public String toString() {
        return super.toString() + " Tipo de Concha: " + tipoDeConcha;
    }
    
}
