package org.example;

import java.util.Scanner;

public class practica_trazas {
    static void main(){
        Scanner teclado = new Scanner(System.in);
        final int TAMANYO_FIJO= 10;
        int suma = 0;
        int numero10 = 0;
        System.out.println("**** BIENVENIDO AL VALIDADOR ISBN *****");
        System.out.println("--------------------------");
        System.out.println("[1] -> Validar");
        System.out.println("[2] -> Reparar");
        System.out.println("[x] -> salir");
        System.out.println("--------------------------");
        System.out.print("Elige una operación: ");
        String opcion = teclado.nextLine().toLowerCase();
        String numero = teclado.nextLine();
        int tamanyo = numero.length();
        if (tamanyo==TAMANYO_FIJO){
            System.out.print("ISBN Tamaño correcto");
        }else {
            System.out.print("ISBN Tamaño incorrecto");
        }
        switch (opcion.toLowerCase()) {
            case "1":

                for (int i = 10; i >= 1; i--) {
                    int parte1 =0;
                    int parte2 =1;
                    String trozo_10 = numero.substring(parte1,parte2);
                    if (parte1==9){
                        if (trozo_10!="x"){
                            try {
                                numero10 = Integer.parseInt(trozo_10);
                            }catch (Exception e){
                                System.out.println("Error: no se puede convertir a número, formato mal colocado (no coloques letras)");
                                return;
                            }
                            suma += numero10*i;
                        }else {
                            suma+= 10;
                        }
                    }else {
                        try {
                            numero10 = Integer.parseInt(trozo_10);
                        }catch (Exception e){
                            System.out.println("Error: no se puede convertir a número, formato mal colocado (no coloques letras)");
                            return;
                        }
                        suma += numero10*i;
                    }
                    parte1++;
                    parte2++;

                }
                System.out.println("El numero final de Tu ISBN es "+ suma);

                break;

            case "2":
                try {
                    int posicion = 0;
                    posicion = numero.indexOf("?");
                }catch (Exception e){
                    System.out.println("Error: No hay ? en el numero");
                    return;
                }
                for (int i = 10; i >= 1; i--) {
                    int parte1 =0;
                    int parte2 =1;
                    String trozo_10 = numero.substring(parte1,parte2);
                    if (parte1==9){
                        if (trozo_10!="x"){
                            try {
                                numero10 = Integer.parseInt(trozo_10);
                            }catch (Exception e){
                                System.out.println("Error: no se puede convertir a número, formato mal colocado (no coloques letras)");
                                return;
                            }
                            suma += numero10*i;
                        }else {
                            suma+= 10;
                        }
                    }else {
                        try {
                            numero10 = Integer.parseInt(trozo_10);
                        }catch (Exception e){
                            System.out.println("Error: no se puede convertir a número, formato mal colocado (no coloques letras)");
                            return;
                        }
                        suma += numero10*i;
                    }

                }

                break;

            case "x":
                System.out.print("Adios");
                break;
            default:
                System.out.println("Operación no válida.");
        }
    }



}
