package boletin29;

/**
 *
 * @author agomezcastro
 */
public abstract class Barco {
    private int diasOcup;
    private int eslora;

    public Barco(int diasOcup, int eslora) {
        this.diasOcup = diasOcup;
        this.eslora = eslora;
    }

    public int getDiasOcup() {
        return diasOcup;
    }

    public int getEslora() {
        return eslora;
    }

    @Override
    public String toString() {
        return "Barco{" + "diasOcup=" + diasOcup + ", eslora=" + eslora + '}';
    }
    
    public abstract void alquiler();
}
