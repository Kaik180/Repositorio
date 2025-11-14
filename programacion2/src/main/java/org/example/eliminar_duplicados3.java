package org.example;

import java.util.Arrays;
import java.util.Random;

public class eliminar_duplicados3 {
    static void main() {
        Random aleatorio = new Random();
        int numeros[] = new int[10];
        boolean control = true;
        for (int i =0; i<numeros.length;i++){
            numeros[i]= aleatorio.nextInt(10)+1;
        }
        System.out.println(Arrays.toString(numeros));

        Arrays.sort(numeros);
        System.out.println(Arrays.toString(numeros));

        while(control){
            control= false;
            Arrays.sort(numeros);
            for ( int i =0;i<numeros.length;i++){
                if (i!= numeros.length-1 && numeros[i] == numeros[i+1]){
                    System.out.println("duplicado: "+ numeros[i]);
                    System.out.println(Arrays.toString(numeros));
                    numeros[i] = aleatorio.nextInt(10)+1;
                    control=true;
                }

            }
        }
        System.out.println(Arrays.toString(numeros));

    }
}
