package usta.fis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        final int FILAS = 5, COLUMNAS = 4;
        Scanner keyboard = new Scanner(System.in);
        int i, j;


        int[][] bidimensional_array = new int[FILAS][COLUMNAS]; //

        System.out.println("Lectura de elemntos de la matriz: ");
        for (i= 0; i < FILAS; i++) {
            for (j = 0; j < COLUMNAS; j++) {
                System.out.print("Bidimensional_array["+ i +"][" + j + "]= ");
                bidimensional_array[i][j] = keyboard.nextInt();
            }
        }

        System.out.println("Valores introducidos: ");
        for (i = 0; i < bidimensional_array.length; i++) {
            System.out.print(bidimensional_array[i] + " ");
        }
        System.out.println();
    }
}
