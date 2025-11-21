package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class nivel1_2 {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();
        int n= aleatorio.nextInt(5)+1;
        int matriz[][] = new int[n][n];

        for (int i=0;i< matriz.length;i++){
            for (int j=0;j< matriz[i].length;j++){
                matriz[i][j] = aleatorio.nextInt(50)+1;
            }
        }
        for (int fila[] : matriz){
            System.out.println(Arrays.toString(fila));
        }
        System.out.println("Sumamos las filas: ");
        int suma= 0;
        for ( int i=0;i< matriz.length;i++){
            suma = 0;
            for ( int j=0;j< matriz.length;j++){
                suma += matriz[i][j];
            }
            System.out.println("Fila "+ (i+1)+ ": "+ suma);
        }
        System.out.println("Sumamos las columnas");
        for ( int i=0;i< matriz.length;i++){
            suma = 0;
            for ( int j=0;j< matriz.length;j++){
                suma += matriz[j][i];
            }
            System.out.println("columna "+ (i+1)+ ": "+ suma);
        }
        //sumar una fila
        for (int i =0; i < matriz[0].length; i++){
            suma += matriz[aleatorio.nextInt(matriz.length-1)][i];
        }
    }

}
