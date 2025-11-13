package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Samurai {
    public static void main(){
        //En este codigo vamos a intentar crear dos equipos de 7 samurais con diferente fuerza y luego hacer que compitan practicando el uso de el split para agarrar los numeros separados por espacios en mi caso
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();
        String equipogen;
        boolean controlador=true;
        int suma=0;
        int vector= 0;
        final int PODERMAX=30;
        int equipo1[] = new int[7];
        int equipo2[] = new int[7];
        int aux = 0;
        int equipo1_int[];
        for (int j=1;j<=2;j++){ //con este for separamos los numeros de los dos equipos y lo introducimos a un vector distinto cada uno, ademas comprobamos la suma de poder  y  que sean 7 numeros 
            controlador=true;
            suma=0;
            do {
                System.out.println("Equipo "+ j);
                System.out.print(" imtroduce potencia de los samurais: ");
                equipogen=teclado.nextLine();
                String[] subcadena = equipogen.split(" ");
                System.out.println(Arrays.toString(subcadena));
                if (subcadena.length==7){
                    int vector12[] = new int[subcadena.length];
                    for (int i = 0; i < subcadena.length; i++) {
                        suma += Integer.parseInt(subcadena[i]);
                    }
                    if (suma==30){

                        if (j==1){
                            controlador=false;
                            equipo1= vector12.clone();

                        }else{
                            controlador=false;
                            equipo2=vector12.clone();

                        }


                    }else {
                        System.out.print(" No tiene 30  de poder en total los samurais");
                    }

                }else{
                    System.out.print(" No hay 7 samurais ");
                }
            }while (controlador==true);
        }
        int ronda = random.nextInt(6) + 1;
        int puntuacion1= 0;
        int puntuacion2= 0;
        for (int x=0;x<=6;x++) { //en este for hacemos que los numeros se peleen y se comparen para ver quien gana y dependiendo de quien gana se suma puntuacion
            if (equipo1[x] > equipo2[x]) {
                System.out.println(equipo1[ronda] + " gana a " + equipo2[ronda]);
                puntuacion1++;
            } else if (equipo1[x] < equipo2[x]) {
                System.out.println(equipo1[ronda] + " pierde contra " + equipo2[ronda]);
                puntuacion2++;
            } else {
                System.out.println(equipo1[ronda] + " empata " + equipo2[ronda]);
                puntuacion1++;
                puntuacion2++;
            }

            ronda++;
            if (ronda == 6) { //este if controla el equipo que gana y termina el codigo
                ronda = 0;
            }else if (puntuacion2==4 || puntuacion1==4){
                System.out.println("los dos equipos empatan");
                return;
            }else if (puntuacion1==4){
                System.out.println("equipo 1 gana el combate");
                return;
            } else if (puntuacion2==4){
                System.out.println("equipo 2 gana el combate");
                return;
            }


        }


    }
}
