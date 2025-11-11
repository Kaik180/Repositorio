package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Samurai {
    public static void main(){

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
        for (int j=1;j<=2;j++){
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
        int ronda = random.nextInt(7) + 1;
        int puntuacion1= 0;
        int puntuacion2= 0;
        for (int x=0;x<=6;x++) {
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
            if (ronda == 7) {
                ronda = 0;
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
