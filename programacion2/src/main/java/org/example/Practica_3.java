package org.example;

import java.util.Scanner;

public class Practica_3 {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        int altura = 0;
        int alturareal= 0;
        int peso = 0;
        final int PESOMIN = (altura*2/8);
        final int PESOMAX = 120;
        final int ALTURAMAX = 230;
        final int REQUISITO = 140;
        int pesoreal = 0;
                System.out.println("Bienvenido al raton juguetón");
                try {
                    System.out.println("leyendo altura (cm)");
                    altura = teclado.nextInt();
                }catch (Exception e){
                    System.out.println("Error de formato");
                }
                if ( altura>ALTURAMAX) {
                    alturareal=(altura-ALTURAMAX);
                    System.out.println("te pasas de altura p" + alturareal + "cm");
                } else if (0 < altura) {
                    alturareal = (REQUISITO-altura);

                    System.out.println("no tienes una altura correcta, te faltan" + alturareal + "cm");
                    return;
                } else if (altura > REQUISITO){
                    System.out.println("leyendo peso (kg)");
                    peso = teclado.nextInt();
                    if (peso > PESOMAX)  {
                        pesoreal = (peso-PESOMAX);
                        System.out.println("Lo siento. Sobre pasas el limite por" + pesoreal + "Kg");

                    } else if (PESOMIN > peso) {
                        pesoreal = (PESOMIN-peso);
                        System.out.println("Lo siento. Te faltan" + pesoreal + "Kg" );
                    } else {
                        System.out.println("Tienes un peso y altura ideal. pase");
                    }
                }else {
                    System.out.println("“ERROR DE LECTURA. BAJA DE LA BÁSCULA Y VUELVE A SUBIR");
                    }




















    }
}

