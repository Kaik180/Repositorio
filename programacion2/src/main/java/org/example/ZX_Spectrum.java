package org.example;
import java.util.Scanner;

public class ZX_Spectrum {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce el ancho: ");
        int ancho = teclado.nextInt();

        System.out.print("Introduce el alto: ");
        int alto = teclado.nextInt();
        teclado.nextLine();

        if (!((ancho % 8 == 0 || ancho < 48) &&
                (alto % 8 == 0  || alto < 48))) {

            System.out.println("Error: El ancho y el alto deben ser múltiplos de 8 o menores de 48.");
            return;
        }

        String[][] matriz = new String[alto][ancho];

        System.out.println("introduce un total de " + ancho + " caracteres (solo letras):");

        for (int i = 0; i < alto; i++) {

            System.out.print("Fila " + i + ": ");
            String linea = teclado.nextLine();

            if (linea.length() != ancho) {
                System.out.println("Error: La fila debe tener " + ancho + " caracteres.");
                i--;
                continue;
            }
            String[] letras = linea.split("");

            for (String letra : letras) {
                if (!letra.matches("[a-oA-O]")) {
                    System.out.println("Error: Solo se permiten letras.");
                    i--;
                }
            }
            for (int j = 0; j < ancho; j++) {
                matriz[i][j] = letras[j];
            }
        }
        System.out.println("Matriz final:");
        for (int i = 0; i < alto; i++) {
            for (int j = 0; j < ancho; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        int bloque = 8;
        int numFilasBloque = alto / bloque;
        int numColsBloque = ancho / bloque;
        boolean compatible = true;
        for (int b = 0; b < numFilasBloque * numColsBloque; b++) {
            int filaBloque = (b / numColsBloque) * bloque;
            int colBloque = (b % numColsBloque) * bloque;

            String aux = "";
            String aux2 = "";

            for (int k = 0; k < bloque * bloque; k++) {
                int i = filaBloque + (k / bloque);
                int j = colBloque + (k % bloque);

                String valor = matriz[i][j];

                if (aux.equals("")) {
                    aux = valor;
                } else if (!valor.equals(aux) && aux2.equals("")) {
                    aux2 = valor;
                } else if (!valor.equals(aux) && !valor.equals(aux2)) {
                    compatible = false;
                    break;
                }
            }
        }
        if (compatible) {
            System.out.println("Es compatible con un ZX Spectrum");
        } else {
            System.out.println("No es compatible con un ZX Spectrum");
        }
    }



}
