package com.cuadro_latino;

/**
 * Created by Ccama on 26/06/2017.
 */
public class Latino {
    static void latino(int fila, int col, int cont, int orden, int mat[][]){
        if (fila == 0 && col == 0){
            mat[0][0] = 1;
        }else {
            if (fila == col){
                latino(fila - 1, orden - 1, orden, orden, mat);
            }else {
                mat[fila][col] = cont;
                latino(fila, col - 1, orden + 1, orden, mat);
            }
        }
    }
    public static void main(String[] args) {
        int[][] Matriz = new int[4][4];

        latino(0,1, 1, 10, Matriz);

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(Matriz[i][j] +  " ");
            }
            System.out.println();
        }

    }
}
