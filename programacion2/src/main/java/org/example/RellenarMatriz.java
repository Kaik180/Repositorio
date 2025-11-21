package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class RellenarMatriz {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        String nombre[][] = new String[2][3];
        for ( int i =0;i< nombre.length;i++){
            String fila[] = teclado.next().split(";");
            if (fila.length==nombre[i].length) {
                for (int j = 0; j < nombre[j].length; j++) {
                    nombre[i][j] = fila[j];
                }
            }else {
                System.out.println("tamaño no adecuado");
            }
        }
        for (String fila[]: nombre){
            System.out.println(Arrays.toString(fila));
        }
    }
}
