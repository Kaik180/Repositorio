package org.example;

public class bucleanidados {
    static void main() {
        //externo:
        for (int i=10;i<9;i++){
            System.out.println("Soy el externo con i ="+ i);
            //interno:
            for (int j=10;j>=0;j--){
                System.out.println("soy el interno con j = "+ j);
                if (j==5){
                    continue;

                }
                System.out.println("hola"+ i + j);
            }
        }

    }
}


