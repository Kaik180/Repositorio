package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class nivel1_1 {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        int matriz[][] = new int[3][3];
        System.out.println("introduce los numeros de la matriz");
        for (int i=0;i< matriz.length;i++){
            for (int j=0;j< matriz[i].length;j++){
                matriz[i][j] = teclado.nextInt();
            }
        }
        for (int fila[] : matriz){
            System.out.println(Arrays.toString(fila));
        }
        System.out.println("que numero buscas? ");
        int busca = teclado.nextInt();
        externo:
        for (int i=0;i< matriz.length;i++){
            for (int j=0;j< matriz[i].length;j++){
                if (matriz[i][j]==busca){
                    System.out.println("el numero que buscamos esta en la posicion: "+ i +","+ j);
                    break externo;
                }
            }
        }
    }
}
