package org.example;

import java.util.Scanner;

public class practica1 {
    static void main(){
        Scanner teclado = new Scanner(System.in);
        boolean control = false;

        do {
            try {
            System.out.println("insertar numero en el siguiente formato dd-mm-aaaa (se tienen que poner ceros)");
            String numero = teclado.nextLine();
                System.out.println(numero);




            }catch (Exception e){
                System.out.println("Error: no se puede convertir a número, formato mal colocado");

            }
            String trozo_1 = numero.substring(0,2);
            String trozo_2 = numero.substring(3,5);
            String trozo_3 = numero.substring(6,10);
            String linea1 =  numero.substring(2,3);
            String linea2 =  numero.substring(5,6);
            int numero1 = Integer.parseInt(trozo_1);
            int numero2 = Integer.parseInt(trozo_2);
            int numero3 = Integer.parseInt(trozo_3);
            if (numero1>31){
                System.out.println("Error: El numero de dias no puede ser mayor a 31");
            }else if (numero1<1){
                System.out.println("Error: El numero de dias no puede ser menor a 1");
            }else{
                if (numero2>12){
                    System.out.println("Error: El numero de meses no puede ser mayor a 12");
                }else if(numero2<1){
                    System.out.println("Error: El numero de meses no puede ser menor a 1");
                }else {
                    if (numero3<1930){
                        System.out.println("Error: El numero de año es menor a 1930");

                    }else if (numero3>2025){
                        System.out.println("Error: El numero de año es mayor a 2025");
                    }else{
                        if (linea1=="-"){
                            if (linea2=="-"){
                                System.out.println("todo correcto");
                            }else {
                                System.out.println("Error: formato mal colocado la segunda linea");
                            }
                        }else {
                            System.out.println("Error: formato mal colocado la primera linea");
                        }
                    }
                }
            }
        }while (control == true);



    }
}
