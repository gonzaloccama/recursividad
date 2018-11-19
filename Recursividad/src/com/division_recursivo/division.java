package com.division_recursivo;

/**
 * Created by Ccama on 28/06/2017.
 */
public class division {
    public static int division(int a, int b){
        if (b > a){
            return 0;
        }else {
            return 1 + division(a - b, b);
        }
    }

    public static void main(String[] args) {
        System.out.println(division(10, 2));
    }
}
