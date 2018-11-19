package com.suma_digitos;

/**
 * Created by Ccama on 29/06/2017.
 */
public class suma_digitos {

    public static void ite(int i){
        if (i == 1)
            System.out.println(i + " ");
        else {
            ite(i - 1);
            System.out.println(i + " ");
        }
    }

    public static int suma_digitos(int n){
        if (n == 0){
            return n;
        }else {
            return suma_digitos(n/10) + (n%10);
        }

    }

    public static void main(String[] args) {
        ite(5);
        System.out.println();
        System.out.println(suma_digitos(999999999));
    }
}
