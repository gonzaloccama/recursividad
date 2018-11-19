package com.cadena_conbinada;

/**
 * Created by Ccama on 29/06/2017.
 */
public class caracter_conbinada {
    public static void combina(String[] a, int i){
        if(i <= a.length - 2){
            for (int j = i + 1 ; j < a.length ; j++){
                System.out.print(a[i] + a[j] + " ");
            }
            System.out.println();
            combina(a, i + 1);
        }
    }

    public static void main(String[] args) {
        String[] a = {"AA", "BB", "CC", "DD", "EE", "FF"};
        combina(a, 0);
    }
}
