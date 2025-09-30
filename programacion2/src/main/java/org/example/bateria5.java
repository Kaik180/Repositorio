package org.example;

import java.util.Scanner;

public class bateria5 {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        int numerador = 0;
        int denominador =0;

        boolean control = true;

        do {
            try {
                System.out.println("introduce el numerador...");
                numerador = teclado.nextInt();

                System.out.println("introduce el numerador...");
                denominador = teclado.nextInt();
                control = false;
            } catch (Exception e) {
                System.out.println("El formato no es correcto");
            }
            teclado.nextLine();
        }while (control==true);










    }
}
