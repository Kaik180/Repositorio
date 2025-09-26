package org.example;

import java.util.Scanner;

public class bateria1 {
    static void main() {
        Scanner Entrada = new Scanner(System.in);
        System.out.println("introduzca las horas:");
        float num1 = Entrada.nextFloat();
        System.out.println("introduce la tarifa por hora");
        float num2 = Entrada.nextFloat();
        float resultado = num1 * num2;
        System.out.println("salario:" + resultado +"€" );







    }
}
