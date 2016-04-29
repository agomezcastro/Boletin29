package boletin29;

import java.util.ArrayList;

/**
 *
 * @author agomezcastro
 */
public class Boletin29 {

    
    public static void main(String[] args) {
        ArrayList <Barco> listaBarcos = new ArrayList();
        
        Barco vel = new Velero(3, "65898XC842", 40, 4);
        Barco mot = new Motor(140, "FGTYH74BV856", 3, 5);
        Barco yat = new Yates(180, 10,"VGJF99GHTS52", 8, 4);
        
        listaBarcos.add(vel);
        listaBarcos.add(mot);
        listaBarcos.add(yat);
        
        for (Barco bar:listaBarcos)
            System.out.println(bar.toString());
        
    }
    
}
