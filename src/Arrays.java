package src;

import java.util.ArrayList;

public class Arrays {


//    Implementare un metodo che prenda come parametro un array di interi e
//    ne ritorni il minimo

    public static void ritornaMinimo(int[] numeri) {
        int result = numeri[0];
        for (int number : numeri) {
            if (number <= result) {
                result = number;
            }

        }
        System.out.println("Il minimo valore nell'array risulta essere : "+result);
        ;
    }public static void ritornaMassimo(int[] numeri) {
        int result = numeri[0];
        for (int number : numeri) {
            if (number >= result) {
                result = number;
            }

        }
        System.out.println("Il massimo valore nell'array risulta essere : "+result);
        ;
    }
}
