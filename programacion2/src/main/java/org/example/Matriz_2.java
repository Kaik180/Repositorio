package org.example;

public class Matriz_2 {
    static void main() {
                int[][] A = {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9},
                        {10, 11, 12}
                };

                int[][] B = {
                        {3, 1, 5},
                        {9, 7, 3},
                        {7, 11, 5},
                        {11, 2, 15}
                };

                int filas = A.length;
                int columnas = A[0].length;
                int[][] M = new int[filas][columnas];

                for (int i = 0; i < A.length; i++) {
                    for (int j = 0; j < A[0].length; j++) {
                        if (A[i][j]>B[i][j]){

                        M[i][j] = A[i][j];
                        }else{
                            M[i][j] = B[i][j];
                        }
                    }
                }

                // Imprimir matriz M
                System.out.println("Matriz M (máximos):");
                for (int i = 0; i < filas; i++) {
                    for (int j = 0; j < columnas; j++) {
                        System.out.print(M[i][j] + "\t");
                    }
                    System.out.println();
                }
            }
}
