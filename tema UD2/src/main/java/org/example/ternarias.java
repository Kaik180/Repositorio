package org.example;

public class ternarias {
    public static void main(){
        int a=1;
        int b=2;
        int c=3;
        boolean condicion = a == 1 ? true : false;


         condicion = a++ == b ? true :
                 c == a++ ? true : false;

        System.out.println(condicion);

    }

}
