package com.positivo_negativo;

/**
 * Created by Ccama on 29/06/2017.
 */
public class positivo_negativo {
    public static boolean positivo(int n){
        if (n > 0){
            return true;
        }else {
            return negativo(n);
        }
    }
    public static boolean negativo(int n){
        if (n < 0){
            return false;
        }else {
            return positivo(n);
        }
    }

    public static void main(String[] args) {
        if (positivo(-10)){
            System.out.println("Positivo!!");
        }else {
            System.out.println("Negativo!!");
        }

    }
}
