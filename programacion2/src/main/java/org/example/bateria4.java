package org.example;

import java.util.Scanner;

public class bateria4 {
    static void main(){

        Scanner teclado = new Scanner(System.in);

            System.out.println("Dame un número");
            int numero1 = teclado.nextInt();

            System.out.println("Dame otro número");
            int numero2 = teclado.nextInt();

            System.out.println("Dame un tercer número");
            int numero3 = teclado.nextInt();

            if (numero1==numero2 || numero1==numero3 || numero2==numero3);{
                System.out.println("ERROR: hay números introducidos que son iguales");
            }


    }
}

