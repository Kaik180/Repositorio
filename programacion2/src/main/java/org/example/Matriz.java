package org.example;

import java.util.Arrays;

public class Matriz {
    static void main() {
        int matriz[][] ={{0,1,2},{3,4,5},{6,7,8}};
        int matriz2[][] = new int [3][3];
        System.out.println(matriz[1][0]);
        System.out.println(matriz[2][1]);

        for (int i=0; i<matriz.length; i++){
            for (int j=0;j<matriz[0].length; j++){
                System.out.print(matriz[i][j]);
            }
            System.out.println();
            int vector[] = {1,2,3,4};
            for (int num : vector){
                System.out.println(num);
            }
            for (int fila[] : matriz ){
                for (int columna : fila){
                    System.out.println(columna);
                }
                System.out.println();
            }
            for (int fila[] : matriz ){
                System.out.println(Arrays.toString(fila));
            }

        }
    }
}
