package com.suma_recursivo;

/**
 * Created by Ccama on 28/06/2017.
 */
public class suma {

    public static int suma(int a, int b){
        if (a == 0){
            return b;
        }else if (b == 0){
            return a;
        }else {
            return 1 + suma(a - 1, b);
        }
    }

    public static void main(String[] args) {
        System.out.println(suma(5,5));
    }
}
