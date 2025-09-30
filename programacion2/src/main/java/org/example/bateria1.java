package org.example;

import java.util.Scanner;

public class bateria1 {
    static void main() {
        Scanner Entrada = new Scanner(System.in);
        float num1 = 0;
        float num2 = 0;
        boolean control = true;
        do {


            try {


                System.out.println("introduzca las horas:");
                num1 = Entrada.nextFloat();
                System.out.println("introduce la tarifa por hora");
                num2 = Entrada.nextFloat();
                control = false;
            } catch (Exception e){
                System.out.println("tienes que colocar numeros");
            }
            float resultado = num1 * num2;
            System.out.println("salario:" + resultado + "€");
        }while (control=true);








    }
}
