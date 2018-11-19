package com.invertir_num;

/**
 * Created by Ccama on 28/06/2017.
 */
public class invertir {
    public static String invertir(int n){
        if (n < 10){
            return String.valueOf(n);
        }else {
            return String.valueOf(n%10) + invertir(n/10);
        }
    }

    public static void main(String[] args) {
        System.out.println(invertir(264));
    }
}
