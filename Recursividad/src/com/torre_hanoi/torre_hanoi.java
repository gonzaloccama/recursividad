package com.torre_hanoi;

/**
 * Created by Ccama on 29/06/2017.
 */
public class torre_hanoi {

    public static void tower_of_hanoi(int n, String origen, String auxiliar, String destino){
        if (n > 0){
            tower_of_hanoi(n-1, origen, destino, auxiliar);
            System.out.println("Mover " + n + " de Torre " + origen + " a la Torre " + destino);
            tower_of_hanoi(n-1, auxiliar, origen, destino);
        }
    }

    public static void main(String[] args) {
        tower_of_hanoi(3, "A", "B", "C");
    }
}
