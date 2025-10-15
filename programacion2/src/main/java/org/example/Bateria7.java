package org.example;

import java.util.Scanner;

public class Bateria7 {

    static void main() {

        Scanner teclado = new Scanner(System.in);


        System.out.println("¿Hay tomate? (Y/N)");
        char tomate = teclado.next().charAt(0);

        System.out.println("¿Hay aceite? (Y/N)");
        char aceite = teclado.next().charAt(0);

        System.out.println("¿Hay jamón? (Y/N)");
        char jamon = teclado.next().charAt(0);

        if (tomate=='S' && aceite=='S' && jamon =='S'){
            System.out.println("No tengo que ir a comprar");
        }else {
            System.out.println("Tengo que ir a comprar");
        }
    }
}
