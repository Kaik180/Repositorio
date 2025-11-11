package org.example;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class RuletaCasino {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();
        Integer numeros[]= new Integer[37];
        String color = "";
        final String COLORES[] ={"rojo", "negro"};
        final String PAR_IMPAR[] ={"par", "impar"};
        String color_apuesta = "";
        for (int i = 0; i< numeros.length; i++){
            numeros[i]=i;
        }
        System.out.println("introduce un numero entre eñ 0 y el 36");
        int numeroelegido= teclado.nextInt();
        if (!Arrays.asList(numeros).contains(numeroelegido)){
            System.out.println("ERROR:el numero que has elegido no esta entre el 0 y el 36");
            return;
        }
        if (numeroelegido!=0){
            System.out.println("introduce el color de tu apuesta (rojo/negro");
            color = teclado.next().toLowerCase();

        }
        if (!Arrays.asList(COLORES).contains(color)){
            System.out.println("ERROR:el numero que has elegido no esta entre el 0 y el 36");
            return;
        }
        System.out.println("introduce si quieres par o impar");
        String Par_impar_elegido= teclado.next();
        if (!Arrays.asList(PAR_IMPAR).contains(Par_impar_elegido)){
            System.out.println("ERROR: no has elegido par o impar");
            return;
        }

         color_apuesta = COLORES[random.nextInt(2)];
        int numero_sorteo= numeros[random.nextInt(37)];

        String par_impar_sorteo = numero_sorteo % 2 == 0 ? "par": "impar";
        System.out.println("ha salido "+ numero_sorteo+ " "+ color_apuesta+" "+ par_impar_sorteo);

        if (numero_sorteo==numeroelegido && color_apuesta.equals(color) && par_impar_sorteo.equals(Par_impar_elegido)){
            System.out.println("HAS GANADO");
        } else if (numero_sorteo==numeroelegido) {
            System.out.println("has acertado el numero");

        } else if (color_apuesta.equals(color)) {
            System.out.println("has acertado el color");

        } else if (par_impar_sorteo.equals(Par_impar_elegido)) {
            System.out.println("has acertado "+ par_impar_sorteo);
        }else {
            System.out.println("has perdido");
        }


    }
}
