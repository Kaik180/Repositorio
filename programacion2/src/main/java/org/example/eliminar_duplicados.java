package org.example;
import java.util.Arrays;

public class eliminar_duplicados {
    static void main() {

        int vector[] = {1,2,2,3,4,5,5,6,6};
        int tamanyo = 0;
        int aux[] = new int[vector.length];
        for (int i = 0;i<= vector.length-1;i++) {
            if (i == vector.length-1){
                aux[i] = vector[i];
                tamanyo++;
            }else if (vector[i] != vector[i+1]){
                aux[i] = vector[i];
                tamanyo++;
            }
        }
        System.out.println(Arrays.toString(aux));
        System.out.println(tamanyo);
        int listo[] = new int [tamanyo];
        int j = 0;
        for (int i = 0; i<aux.length;i++){

            if (aux[i] != 0){
                listo[j] = aux[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(listo));
    }
}
