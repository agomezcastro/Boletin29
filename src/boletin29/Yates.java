package boletin29;

/**
 *
 * @author agomezcastro
 */
public class Yates extends Barco{
    private int potencia, numCamarotes;
    private String matricula;

    public Yates(int potencia, int numCamarotes, String matricula, int diasOcup, int eslora) {
        super(diasOcup, eslora);
        this.potencia = potencia;
        this.numCamarotes = numCamarotes;
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Yates{" + "potencia=" + potencia + ", numCamarotes=" + numCamarotes + ", matricula=" + matricula + '}';
    }

    @Override
    public void alquiler() {
        
    }
    
    
}
