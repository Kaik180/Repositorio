package org.example;

import java.util.Random;
import java.util.Scanner;

public class Matriz_1 {
    private static Object arrays;

    static void main() {
        
        //forma 1
        int n = 4;
        String[][] matriz = new String[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = "-";
            }
        }
        for (int i = 0; i < n; i++) {
            matriz[i][n - 1 - i] = "X";
        }
        for ( int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        
    }
}
