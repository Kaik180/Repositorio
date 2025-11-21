package org.example;

import java.util.Scanner;

public class nivel1_3 {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("cuantos alumnos tienes");
        int alumno = teclado.nextInt();
        System.out.println("cuantas asignaturas cursan");
        int asignatura = teclado.nextInt();
        teclado.nextLine();
        String notas[][] = new String[alumno+1][asignatura+1];
        notas[0][0] = "Estudiantes";
        for ( int i=1;i< notas.length;i++){
            System.out.println("introduce el nombre del alumno"+ i +": ");
            notas[i][0] = teclado.next();

        }
        for ( int i=1;i< notas[0].length;i++){
            System.out.println("introduce asignatura "+ i);
            notas[0][1] = teclado.next();

        }
        for (String fila[] : notas){
            for(String valor: fila){
                System.out.print(valor+ " ");
            }
            System.out.println();
        }

        for ( int i=1;i< notas.length;i++){
            for ( int j=0;j< notas[i].length;j++){
                System.out.println("introduce la nota de "+ notas[i][0] +"para la asignatura de"+ notas[0][j+1]+ ": ");
                notas[i][j] = teclado.next();

            }
        }
        for (String fila[] : notas){
            for(String valor: fila){
                System.out.print(valor+ " ");
            }
            System.out.println();
        }
        int suma_notas=0;
        for ( int i=1;i< notas.length;i++){
            for ( int j=1;j< notas[i].length;j++){
                suma_notas+= Integer.parseInt(notas[i][j]);

            }
            System.out.println("La nota media del alumno "+ notas[i][0] +"es "+ suma_notas/asignatura);
        }
        for ( int i=1;i< notas[0].length;i++){
            suma_notas=0;
            for ( int j=1;j< notas.length;j++){
                suma_notas+= Integer.parseInt(notas[j][i]);

            }
            System.out.println("La nota media de la asignatura de "+ notas[0][1] +"es "+ (double) (suma_notas/alumno));
        }
    }
}
