package boletin29;

/**
 *
 * @author agomezcastro
 */
public class Velero extends Barco{
    private int mastil;
    private String matricula;

    public Velero(int mastil, String matricula, int diasOcup, int eslora) {
        super(diasOcup, eslora);
        this.mastil = mastil;
        this.matricula= matricula;
    }

    @Override
    public String toString() {
        return "Velero{" + "mastil=" + mastil + ", matricula=" + matricula +'}';
    }
    
    @Override
    public void alquiler(){
        System.out.println("");
    }
}
