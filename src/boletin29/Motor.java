package boletin29;

/**
 *
 * @author agomezcastro
 */
public class Motor extends Barco{
    private int potencia;
    private String matricula;

    public Motor(int potencia, String matricula, int diasOcup, int eslora) {
        super(diasOcup, eslora);
        this.potencia = potencia;
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Motor{" + "potencia=" + potencia + ", matricula=" + matricula +'}';
    }

    @Override
    public void alquiler() {
        
    }
    
    
}
