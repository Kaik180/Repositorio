package org.example;

import java.util.Arrays;

public class eleminar_opcion {
    static void main() {

        int numeros[] = {1,1,1,2,2,3,3,4,5,5,};

        int numeros_limpio[]= Arrays.stream(numeros).distinct().toArray();
        System.out.println(Arrays.toString(numeros_limpio));
    }
}
