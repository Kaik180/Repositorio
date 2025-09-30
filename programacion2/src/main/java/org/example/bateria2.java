package org.example;

import com.sun.jdi.event.ExceptionEvent;

import java.util.Scanner;

public class bateria2 {
    static void main() {
        Scanner Entrada = new Scanner(System.in);
        try{


            System.out.println("introduzca las horas:");
            float num1 = Entrada.nextFloat();
            System.out.println("introduce la tarifa por hora");
            float num2 = Entrada.nextFloat();
            if (num1 > 40) {
                float num3 = 0;
                num3 = num1 - 40;
                final float num6 = 40;
                float num4 = num2 * num3;
                double num5 = num4 * 1.5;
                float resultado = num6 * num2;
                System.out.println("salario:" + resultado + "€");
                double resultadof = resultado + num5;
                System.out.println("dinero ganado con horas extras" + num5 + "€");
                System.out.println("salario mas las horas extras" + resultadof + "€");
            }
            else {
                System.out.println("introduce la tarifa por hora");
                float resultado = num1 * num2;
                System.out.println("salario:" + resultado +"€" );
            }
        } catch (Exception e){
            System.out.println();
        }



    }
}
