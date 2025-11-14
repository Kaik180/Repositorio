package org.example;
import java.util.Arrays;

public class eliminar_duplicados2 {
    static void main() {

        int vector_or[] ={1,2,2,3,4,4,5,6};

        int tamanyo = 1;
        for (int i =0; i<vector_or.length-1;i++){
            if (vector_or[i]==vector_or[i+1]){
                vector_or[i]=-1000;
            }else{
                tamanyo++;
            }
        }

        System.out.println(Arrays.toString(vector_or));

        int listo[] = new int[tamanyo];
        int j = 0;

        for (int i = 0; i< vector_or.length;i++){
            if (vector_or[i]!=-1000){
                listo[j]=vector_or[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(listo));
    }
}
