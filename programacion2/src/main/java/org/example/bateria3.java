package org.example;

import java.util.Scanner;

public class bateria3 {
    static void main() {
        Scanner Entrada = new Scanner(System.in);

        System.out.println("Escribe un numero");
        float num1 = Entrada.nextFloat();
        if (num1>0){
            System.out.println("el numero es positivo");
        } else if (num1<0){
            System.out.println("el numero es negativo");
        } else {
            System.out.println("el numero es 0");
        }






    }
}
