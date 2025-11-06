package org.example;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class vector {
    public static void main(){
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();
        int aux = 0;

        int vector[] = { 1,3,5,10,20 };
        System.out.println(Arrays.toString(vector));
        System.out.println(vector.length);

        int vector2[] = new int[8];
        vector2[4] =10;
        vector2[5] =5;
        System.out.println(Arrays.toString(vector2));

        for ( int i= 0; vector2.length>i; i++){
            System.out.println("Posicion " + i +" :"+vector2[i]);
        }
        vector2=vector.clone();
        for ( int i= 0; vector2.length>i; i++){
            vector2[i]= random.nextInt(501);
        }
        int vector3[] = new int[4];
        for ( int i= 0; vector3.length>i; i++){
            vector3[i]= teclado.nextInt();
        }

        //ejercicio 2

        for ( int i= 0; i<vector.length/2; i++){
           aux = vector[i];
            vector[i]= vector[vector.length-1-i];
            vector[vector.length-1-i]=aux;
        }
        System.out.println(Arrays.toString(vector));
        //ejercicio 3
        System.out.println("introduce el numero a buscar");
        int numero_buscar = teclado.nextInt();

        int contador = 0;
        for ( int i=0; i<vector.length;i++){
            if (vector[i]==numero_buscar){
                contador++;
            }
        }

        System.out.println("el numero"+ numero_buscar+ " esta en la posicion "+ contador);

        //ejercicio 5
        for ( int i= vector.length; i>=1; i--){
           if (vector[i]== vector.length-1){
               aux=vector[i];
               vector[i]=vector[i-1];
           } else {
               vector[i]=vector[i-1];
           }

        }
        vector[0]=aux;
        System.out.println(Arrays.toString(vector));

        //ejercicio 10
        String palabras[] = {"espada","arma","juegos"};
        System.out.println("introduce una letra");
        char letra = teclado.next().charAt(0);
        for (i=0; i< palabras.length;i++) {
        if (letra == palabras[])
        }


        }






    }

}
